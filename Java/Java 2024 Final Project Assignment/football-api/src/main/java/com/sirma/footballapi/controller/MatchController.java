package com.sirma.footballapi.controller;

import com.sirma.footballapi.models.Match;
import com.sirma.footballapi.service.MatchService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/matches")
@Validated
@Slf4j
public class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Match> getMatchById(@PathVariable Long id) {
        Optional<Match> match = matchService.getMatchById(id);
        return match.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Match createMatch(@Valid @RequestBody Match match) {
        return matchService.createMatch(match);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Match> updateMatch( @PathVariable Long id, @Valid @RequestBody Match match) {
        if (matchService.getMatchById(id).isEmpty()) {
            log.warn(STR."Match with ID: \{id} doesn't exist");
            return ResponseEntity.notFound().build();
        }
        if (!id.equals(match.getId())){
            log.warn(STR."The URL ID: \{id} doesn't match the request body ID: \{match.getId()}");
            return ResponseEntity.badRequest().body(null);
        }
        match.setId(id);
        return ResponseEntity.ok(matchService.updateMatch(id, match));
    }

    @Transactional
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMatch(@PathVariable Long id) {
        if (matchService.getMatchById(id).isEmpty()) {
            log.warn(STR."Match with ID: \{id} doesn't exist");
            return ResponseEntity.notFound().build();
        }
        matchService.deleteMatch(id);
        return ResponseEntity.noContent().build();
    }
}
