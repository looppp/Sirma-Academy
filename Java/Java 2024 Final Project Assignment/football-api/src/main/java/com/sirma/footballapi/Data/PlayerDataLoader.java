package com.sirma.footballapi.Data;

import com.sirma.footballapi.models.Player;
import com.sirma.footballapi.models.Team;
import com.sirma.footballapi.service.PlayerService;
import com.sirma.footballapi.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerDataLoader {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private TeamService teamService;

    public void loadPlayers(String filePath){
        List<String[]> csvData = CsvReader.readCSV(filePath);

        for (String[] row: csvData){
            if(row.length != 5) continue;

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
                        System.out.println(STR."Team not found for player with ID: \{teamId}");
                        continue;
                    }

                    Player player = new Player(id, teamNumber, position, fullName, team);
                    playerService.createPlayer(player);
                }
            } catch (NumberFormatException e){
                System.out.println(STR."Error loading the teams.csv \{e.getMessage()}");
            }

        }
    }
}
