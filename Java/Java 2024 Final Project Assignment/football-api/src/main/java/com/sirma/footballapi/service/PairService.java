package com.sirma.footballapi.service;

import com.sirma.footballapi.dto.PlayerDTO;
import com.sirma.footballapi.models.MatchRecord;
import com.sirma.footballapi.repository.MatchRecordRepository;
import org.antlr.v4.runtime.misc.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PairService {

    @Autowired
    private MatchRecordRepository matchRecordRepository;

    public List<PlayerDTO> findLongestPlayingPair(){
        List<MatchRecord> matchRecords = matchRecordRepository.findAll();
        Map<String, Long> playerPairPlayedTime = new HashMap<>();

        Map<Long, List<MatchRecord>> recordsOrderedByMatch = matchRecords.
                stream().collect(Collectors.groupingBy(record -> record.getMatch().getId()));

        for(List<MatchRecord> matchRecordList : recordsOrderedByMatch.values()){
            for (int i = 0; i < matchRecordList.size(); i++){
                MatchRecord firstRecord = matchRecordList.get(i);

                for(int j = i + 1; j < matchRecordList.size(); j++){
                    MatchRecord secondRecord = matchRecordList.get(j);

                    int overlap = calculateOverlap(firstRecord, secondRecord);
                    if(overlap > 0){
                        String pairKey = createPairKey(firstRecord.getPlayer().getId(), secondRecord.getPlayer().getId());
                        playerPairPlayedTime.put(pairKey, playerPairPlayedTime.getOrDefault(pairKey, 0L) + overlap);
                    }
                }
            }
        }

        return playerPairPlayedTime.entrySet().stream().map(entry -> {
            String[] playerIds = entry.getKey().split("-");
            return new PlayerDTO(Long.parseLong(playerIds[0]), Long.parseLong(playerIds[1]), entry.getValue());
        }).collect(Collectors.toList());
    }

    private int calculateOverlap(MatchRecord firstRecord, MatchRecord secondRecord) {
        int firstStart = firstRecord.getFromMinutes();
        int firstEnd = firstRecord.getToMinutes();
        int secondStart = secondRecord.getFromMinutes();
        int secondEnd = secondRecord.getToMinutes();

        int overlapStart = Math.max(firstStart, secondStart);
        int overlapEnd = Math.max(firstEnd, secondEnd);

        if(overlapEnd > overlapStart){
            return overlapEnd - overlapStart;
        } else {
            return 0;
        }

    }
    private String createPairKey(Long firstPlayerId, Long secondPlayerId) {
        return (firstPlayerId < secondPlayerId) ? STR."\{firstPlayerId}-\{secondPlayerId}" : STR."\{secondPlayerId}-\{firstPlayerId}";
    }
}
