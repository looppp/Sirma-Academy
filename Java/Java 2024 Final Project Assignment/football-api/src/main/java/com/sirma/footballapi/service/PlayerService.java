package com.sirma.footballapi.service;

import com.sirma.footballapi.models.Player;
import com.sirma.footballapi.repository.PlayerRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

@Service
@Validated
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(Long id){
        return playerRepository.findById(id);
    }

    public Player createPlayer(@Valid Player player){
        if(playerRepository.existsById(player.getId())){
            throw new IllegalArgumentException(STR."Player with ID: \{player.getId()} allready exist");
        }
       return playerRepository.save(player);
    }

    public Player updatePlayer(Long id, @Valid Player player){
        if(!playerRepository.existsById(id)){
            throw new IllegalArgumentException(STR."Player with ID: \{id} doesn't exist");
        }
        return playerRepository.save(player);
    }

    public void deletePlayer(Long id){
        if(!playerRepository.existsById(id)){
            throw new IllegalArgumentException(STR."Player with ID: \{id} doesn't exist");
        }
        playerRepository.deleteById(id);
    }
}
