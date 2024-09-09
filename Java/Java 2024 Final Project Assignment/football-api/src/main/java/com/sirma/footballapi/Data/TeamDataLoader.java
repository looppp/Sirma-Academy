package com.sirma.footballapi.Data;

import com.sirma.footballapi.models.Player;
import com.sirma.footballapi.models.Team;
import com.sirma.footballapi.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamDataLoader {

    @Autowired
    private TeamService teamService;

    public void loadTeams(String filePath){
        List<String[]> csvData = CsvReader.readCSV(filePath);

        for (String[] row : csvData){
            if(row.length != 4) {
                System.out.println(STR."Invalid data format:\{String.join(",", row)}");
                continue;
            }
            try {
                Long id = Long.parseLong(row[0]);
                String name = row[1];
                String managerFullName = row[2];
                String group = row[3];

                Team existingTeam = teamService.getTeamById(id).orElse(null);

                if(existingTeam == null){

                    Team team = new Team(id, name, managerFullName, group, null);
                    teamService.createTeam(team);
                }
            } catch (NumberFormatException e){
                System.out.println(STR."Error loading the teams.csv \{e.getMessage()}");
            }
        }
    }
}
