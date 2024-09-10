package com.sirma.footballapi.controller;

import com.sirma.footballapi.models.Player;
import com.sirma.footballapi.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/players")
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
    public Player createPlayer(@RequestBody Player player){
        return playerService.createPlayer(player);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable Long id, @RequestBody Player player){
        if(playerService.getPlayerById(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }
        player.setId(id);
        return ResponseEntity.ok(playerService.createPlayer(player));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayer(@PathVariable Long id){
        if(playerService.getPlayerById(id).isEmpty()){
            return ResponseEntity.notFound().build();
        }

        playerService.deletePlayer(id);
        return ResponseEntity.noContent().build();
    }
}
