package com.sirma.footballapi.controller;

import com.sirma.footballapi.models.Player;
import com.sirma.footballapi.service.PlayerService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/players")
@Validated
@Slf4j
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable Long id){
        Optional<Player> player = playerService.getPlayerById(id);
        return player.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Player createPlayer(@Valid @RequestBody Player player){
        return playerService.createPlayer(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable Long id, @Valid @RequestBody Player player){
        if(playerService.getPlayerById(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        if (!id.equals(player.getId())){
           log.warn(STR."The URL ID: \{id} doesn't match the request body ID: \{player.getId()}");
            return ResponseEntity.badRequest().body(null);
        }

        player.setId(id);
        return ResponseEntity.ok(playerService.updatePlayer(id, player));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayer(@PathVariable Long id){
        if(playerService.getPlayerById(id).isEmpty()){
            log.warn(STR."Player with ID: \{id} doesn't exist");
            return ResponseEntity.notFound().build();
        }

        playerService.deletePlayer(id);
        return ResponseEntity.noContent().build();
    }
}
