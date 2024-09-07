package com.sirma.footballapi.service;


import com.sirma.footballapi.models.Match;
import com.sirma.footballapi.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public List<Match> getAllMatches(){
        return matchRepository.findAll();
    }

    public Optional<Match> getMatchById(Long id){
        return matchRepository.findById(id);
    }

    public Match createMatch(Match match){
        return matchRepository.save(match);
    }

    public void deleteMatch(Long id){
        matchRepository.deleteById(id);
    }
}
