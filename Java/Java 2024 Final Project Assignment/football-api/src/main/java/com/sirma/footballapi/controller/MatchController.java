package com.sirma.footballapi.controller;

import com.sirma.footballapi.models.Match;
import com.sirma.footballapi.service.MatchService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/matches")
@Validated
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
            return ResponseEntity.notFound().build();
        }
        match.setId(id);
        return ResponseEntity.ok(matchService.createMatch(match));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMatch(@PathVariable Long id) {
        if (matchService.getMatchById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        matchService.deleteMatch(id);
        return ResponseEntity.noContent().build();
    }
}
