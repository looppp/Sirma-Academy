package com.sirma.footballapi.service;

import com.sirma.footballapi.models.Match;
import com.sirma.footballapi.repository.MatchRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import static com.sirma.footballapi.utils.DateParser.parseDate;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Validated
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public List<Match> getAllMatches(){
        return matchRepository.findAll();
    }

    public Optional<Match> getMatchById(Long id){
        return matchRepository.findById(id);
    }

    public Match createMatch(@Valid Match match){
        if(matchRepository.existsById(match.getId())){
            throw new IllegalArgumentException(STR.
                    "Match with ID: \{match.getId()} allready exist");
        } else if(matchRepository.existsByDateAndATeamAndBTeam(match.getDate(), match.getATeam(), match.getBTeam())){
            throw new IllegalArgumentException(STR.
                    "Match with Date: \{match.getDate()}, Team A:\{match.getATeam()}, and Team B: \{match.getBTeam()} already exists");
        }
        try{
            LocalDate currentMatchDate = parseDate(String.valueOf(match.getDate()));
            match.setDate(currentMatchDate);
        } catch (DateTimeException e){
            throw new IllegalArgumentException(STR."Failed to parse the match date: \{match.getDate()}");
        }

       return matchRepository.save(match);
    }

    public Match updateMatch(Long id, @Valid Match match){
        if(!matchRepository.existsById(match.getId())){
            throw new IllegalArgumentException(STR."Match with ID: \{match.getId()} doesn't exist");
        }
        try{
            LocalDate currentMatchDate = parseDate(String.valueOf(match.getDate()));
            match.setDate(currentMatchDate);
        } catch (DateTimeException e){
            throw new IllegalArgumentException(STR."Failed to parse the match date: \{match.getDate()}");
        }

        return matchRepository.save(match);
    }

    public void deleteMatch(Long id){
        if(!matchRepository.existsById(id)){
            throw new IllegalArgumentException(STR."Match with ID: \{id} doesn't exist");
        }
        matchRepository.deleteById(id);
    }
}
