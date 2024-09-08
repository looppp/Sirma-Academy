package com.sirma.footballapi.Data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadingDataConfiguration {


    @Bean
    public CommandLineRunner dataLoader(PlayerDataLoader playerDataLoader, TeamDataLoader teamDataLoader){
        return args -> {
            teamDataLoader.loadTeams("csv/teams.csv");
            playerDataLoader.loadPlayers("csv/players.csv");
        };
    }
}
