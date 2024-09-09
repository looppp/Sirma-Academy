package com.sirma.footballapi.Data;


import com.sirma.footballapi.models.Match;
import com.sirma.footballapi.models.Team;
import com.sirma.footballapi.service.MatchService;
import com.sirma.footballapi.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class MatchDataLoader {

    private static final String[] DATE_FORMATTERS = {
            "yyyy-MM-dd", "yyyy/MM/dd", "yyyyMMdd",
            "dd-MM-yyyy", "dd/MM/yyyy", "MMddyyyy", "M/d/yyyy",
            "MMM d, yyyy", "MMMM d, yyyy", "yyyy MMM d", "yyyy/MM/dd HH:mm:ss"
    };

    @Autowired
    private MatchService matchService;

    @Autowired
    private TeamService teamService;

    public void loadMatches(String filePath){
        List<String[]> csvData = CsvReader.readCSV(filePath);

        for(String[] row : csvData){
            if(row.length != 5) {
                System.out.println(STR."Invalid data format:\{String.join(",", row)}");
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
                    System.out.println(STR."No match found for either of the teams id's\{id}");
                    continue;
                }

                Match match = new Match(id, date, score, aTeam, bTeam, null);

                matchService.createMatch(match);

            } catch (NumberFormatException e){
                System.out.println(STR."Error loading the teams.csv \{e.getMessage()}");

            }
        }
    }

    private static LocalDate parseDate(String date){
        for(String format : DATE_FORMATTERS){
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
                return  LocalDate.parse(date, formatter);
            } catch (DateTimeException e){
                continue;
            }
        }
        throw new DateTimeException(STR."Failed to parse the date: \{date}");
    }
}
