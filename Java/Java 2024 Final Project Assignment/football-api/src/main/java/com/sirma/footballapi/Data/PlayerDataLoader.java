package com.sirma.footballapi.Data;

import com.sirma.footballapi.models.Player;
import com.sirma.footballapi.models.Team;
import com.sirma.footballapi.service.PlayerService;
import com.sirma.footballapi.service.TeamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PlayerDataLoader {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private TeamService teamService;

    public void loadPlayers(String filePath){
        List<String[]> csvData = CsvReader.readCSV(filePath);

        log.info(STR."Starting to load players from file: \{filePath}");
        int loadedPlayersCount = 0;

        for (String[] row: csvData){
            if(row.length != 5) {
               log.warn(STR."Invalid data format:\{String.join(",", row)}");
                continue;
            }

            try {
                Long id = Long.parseLong(row[0]);
                int teamNumber = Integer.parseInt(row[1]);
                String position = row[2];
                String fullName = row[3];
                Long teamId = Long.parseLong(row[4]);


                Player existingPlayer = playerService.getPlayerById(id).orElse(null);

                if(existingPlayer == null){
                    Team team = teamService.getTeamById(teamId).orElse(null);

                    if(team == null){
                       log.warn(STR."Team not found for player with ID: \{teamId}");
                        continue;
                    }

                    Player player = new Player(id, teamNumber, position, fullName, team);
                    playerService.createPlayer(player);
                    loadedPlayersCount++;

                }
            } catch (NumberFormatException e){
                log.warn(STR."Error loading the teams.csv \{e.getMessage()}");
            }
        }
        log.info(STR."Finished loading players. Players loaded: \{loadedPlayersCount}");
    }
}
