package com.sirma.footballapi.Data;

import com.sirma.footballapi.models.Match;
import com.sirma.footballapi.models.MatchRecord;
import com.sirma.footballapi.models.Player;
import com.sirma.footballapi.service.MatchRecordService;
import com.sirma.footballapi.service.MatchService;
import com.sirma.footballapi.service.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class MatchRecordDataLoader {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private MatchService matchService;

    @Autowired
    private MatchRecordService matchRecordService;

    public void loadRecords(String filePath){
        List<String[]> csvData = CsvReader.readCSV(filePath);
        log.info(STR."Starting to load records from file: \{filePath}");
        int loadedRecordsCount = 0;

        for(String[] row : csvData){
            if(row.length != 5) {
               log.warn(STR."Invalid data format:\{String.join(",", row)}");
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
                    log.warn(STR."Invalid player or match in row with ID: \{id}");
                }

                MatchRecord matchRecord = new MatchRecord(id, player, match, fromMinutes, toMinutes);
                matchRecordService.createRecord(matchRecord);
                loadedRecordsCount++;

            } catch (NumberFormatException e){
               log.warn(STR."Error loading the records.csv \{e.getMessage()}");
            }
        }
        log.info(STR."Finished loading records. Records loaded: \{loadedRecordsCount}");
    }
}
