package com.sirma.footballapi.controller;

import com.sirma.footballapi.models.Team;
import com.sirma.footballapi.service.TeamService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
@Validated
@Slf4j
public class TeamController {

    @Autowired
    public TeamService teamService;

    @GetMapping
    public List<Team> getAllTeams(){
        return teamService.getAllTeams();
    }

    @PostMapping("/create")
    public Team createTeam(@Valid @RequestBody Team team) {
        log.info(STR."Created team: \{team.getName()}");
        return teamService.createTeam(team);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Team> updateTeam(@PathVariable Long id, @RequestBody Team team) {
        if (teamService.getTeamById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        if (!id.equals(team.getId())){
            System.out.println(STR."The URL ID: \{id} doesn't match the request body ID: \{team.getId()}");
            return ResponseEntity.badRequest().body(null);
        }
        team.setId(id);
        return ResponseEntity.ok(teamService.updateTeam(id, team));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTeam(@PathVariable Long id) {
        if (teamService.getTeamById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        teamService.deleteTeam(id);
        return ResponseEntity.noContent().build();
    }
}
