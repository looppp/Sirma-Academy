package com.sirma.footballapi.service;

import com.sirma.footballapi.Data.PlayerDataLoader;
import com.sirma.footballapi.exception.PlayerNotFoundException;
import com.sirma.footballapi.exception.TeamNotFoundException;
import com.sirma.footballapi.models.Player;
import com.sirma.footballapi.models.Team;
import com.sirma.footballapi.repository.PlayerRepository;
import com.sirma.footballapi.repository.TeamRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

@Service
@Validated
@Slf4j
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private TeamRepository teamRepository;


    private boolean playerExists(Integer teamNumber, String position, String fullName) {
        return playerRepository.existsByTeamNumberPositionFullName(teamNumber, position, fullName);
    }

    public List<Player> getAllPlayers(){
        if(playerRepository.findAll().isEmpty()){
            log.warn("No players are found in the database");
            throw new PlayerNotFoundException("No players are found in the database");
        }
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(Long id){
        return playerRepository.findById(id);
    }

    public Player createPlayer(@Valid Player player){
        if(playerExists(player.getTeamNumber(), player.getPosition(), player.getFullName())){
            log.warn(STR."Player with ID: \{player.getFullName()} allready exist");
            throw new RuntimeException(STR."Player with ID: \{player.getFullName()} allready exist");
        }
        Team team = teamRepository.findById(player.getTeam().getId())
                .orElseThrow(() -> new TeamNotFoundException(STR."Team with ID: \{player.getTeam().getId()} not found"));
        player.setTeam(team);


        log.info(STR."Player with name: \{player.getFullName()} is created");
        return playerRepository.save(player);
    }

    public Player updatePlayer(Long id, @Valid Player player){
        if(!playerRepository.existsById(id)){
            log.warn(STR."Player with ID: \{id} doesn't exist");
            throw new PlayerNotFoundException(STR."Player with ID: \{id} doesn't exist");
        }
        log.info(STR."Player with ID: \{id} is updated");
        return playerRepository.save(player);
    }

    @Transactional
    public void deletePlayer(Long id){
        if(!playerRepository.existsById(id)){
            log.warn(STR."Player with ID: \{id} doesn't exist");
            throw new PlayerNotFoundException(STR."Player with ID: \{id} doesn't exist");
        }

        log.info(STR."Deleted player with ID: \{id}");
        playerRepository.deleteById(id);
    }
}
