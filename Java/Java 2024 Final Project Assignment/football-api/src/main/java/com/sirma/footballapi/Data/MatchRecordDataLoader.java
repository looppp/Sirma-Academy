package com.sirma.footballapi.Data;

import com.sirma.footballapi.models.Match;
import com.sirma.footballapi.models.MatchRecord;
import com.sirma.footballapi.models.Player;
import com.sirma.footballapi.service.MatchRecordService;
import com.sirma.footballapi.service.MatchService;
import com.sirma.footballapi.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MatchRecordDataLoader {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private MatchService matchService;

    @Autowired
    private MatchRecordService matchRecordService;

    public void loadRecords(String filePath){
        List<String[]> csvData = CsvReader.readCSV(filePath);

        for(String[] row : csvData){
            if(row.length != 5) {
                System.out.println(STR."Invalid data format:\{String.join(",", row)}");
                continue;
            }

            try{
                Long id = Long.parseLong(row[0]);
                Long playerId = Long.parseLong(row[1]);
                Long matchId = Long.parseLong(row[2]);
                Integer fromMinutes = Integer.parseInt(row[3]);
                Integer toMinutes = !Objects.equals(row[4].toLowerCase(), "NULL".toLowerCase()) ? Integer.parseInt(row[4]) : 90;

                Player player = playerService.getPlayerById(playerId).orElse(null);
                Match match = matchService.getMatchById(matchId).orElse(null);

                if (matchRecordService.getRecordById(id).isPresent()) continue;

                if(player == null || match == null){
                    System.out.println(STR."Invalid player or match in row with ID: \{id}");
                }

                MatchRecord matchRecord = new MatchRecord(id, player, match, fromMinutes, toMinutes);
                matchRecordService.createRecord(matchRecord);

            } catch (NumberFormatException e){
                System.out.println(STR."Error loading the records.csv \{e.getMessage()}");
            }
        }
    }
}
