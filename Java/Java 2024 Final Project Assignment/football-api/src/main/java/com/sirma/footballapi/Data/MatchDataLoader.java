package com.sirma.footballapi.Data;

import com.sirma.footballapi.models.Match;
import com.sirma.footballapi.models.Team;
import com.sirma.footballapi.service.MatchService;
import com.sirma.footballapi.service.TeamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import static com.sirma.footballapi.utils.DateParser.parseDate;

@Service
@Slf4j
public class MatchDataLoader {


    @Autowired
    private MatchService matchService;

    @Autowired
    private TeamService teamService;


    public void loadMatches(String filePath){
        List<String[]> csvData = CsvReader.readCSV(filePath);
        log.info(STR."Starting to load matches from file: \{filePath}");
        int loadedMatchesCount = 0;

        for(String[] row : csvData){
            if(row.length != 5) {
               log.warn(STR."Invalid data format:\{String.join(",", row)}");
                continue;
            }
            try{
                Long id = Long.parseLong(row[0]);
                Long aTeamId = Long.parseLong(row[1]);
                Long bTeamId = Long.parseLong(row[2]);
                LocalDate date = parseDate(row[3]);
                String score = row[4];

                Team aTeam = teamService.getTeamById(aTeamId).orElse(null);
                Team bTeam = teamService.getTeamById(bTeamId).orElse(null);

                if(aTeam == null || bTeam == null){
                  log.warn(STR."No match found for either of the teams id's\{id}");
                    continue;
                }

                Match match = new Match(id, date, score, aTeam, bTeam, null);
                matchService.createMatch(match);
                loadedMatchesCount++;

            } catch (NumberFormatException e){
               log.warn(STR."Error loading the teams.csv \{e.getMessage()}");

            }
        }
        log.info(STR."Finished loading matches. Matches loaded: \{loadedMatchesCount}");

    }
}
