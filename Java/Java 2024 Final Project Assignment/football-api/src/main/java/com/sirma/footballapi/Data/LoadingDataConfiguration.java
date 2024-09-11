package com.sirma.footballapi.Data;

import com.sirma.footballapi.repository.MatchRecordRepository;
import com.sirma.footballapi.repository.MatchRepository;
import com.sirma.footballapi.repository.PlayerRepository;
import com.sirma.footballapi.repository.TeamRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadingDataConfiguration {


    @Bean
    public CommandLineRunner dataLoader(PlayerDataLoader playerDataLoader,
                                        TeamDataLoader teamDataLoader,
                                        MatchDataLoader matchDataLoader,
                                        MatchRecordDataLoader matchRecordDataLoader,
                                        TeamRepository teamRepository,
                                        PlayerRepository playerRepository,
                                        MatchRepository matchRepository,
                                        MatchRecordRepository matchRecordRepository){
        return args -> {
            if(teamRepository.count() == 0)  teamDataLoader.loadTeams("csv/teams.csv");
            if(playerRepository.count() == 0)  playerDataLoader.loadPlayers("csv/players.csv");
            if(matchRepository.count() == 0)  matchDataLoader.loadMatches("csv/matches.csv");
            if(matchRecordRepository.count() == 0)  matchRecordDataLoader.loadRecords("csv/records.csv");
        };
    }
}
