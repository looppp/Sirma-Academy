package com.sirma.footballapi.service;

import com.sirma.footballapi.models.Match;
import com.sirma.footballapi.models.Team;
import com.sirma.footballapi.repository.MatchRecordRepository;
import com.sirma.footballapi.repository.MatchRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private MatchRecordRepository matchRecordRepository;

    private boolean matchExists(LocalDate date, Team aTeam, Team bTeam) {
        return matchRepository.existsByDateAndATeamAndBTeam(date, aTeam, bTeam);
    }

    public List<Match> getAllMatches(){
        log.info("Getting all matches");
        return matchRepository.findAll();
    }

    public Optional<Match> getMatchById(Long id){
        Optional<Match> match = matchRepository.findById(id);
        if(match.isPresent()){
            log.info(STR."Match with ID: \{id} was found");
        } else  {
            log.warn(STR."Match with ID: \{id} wasn't found");
        }
        return match;
    }

    public Match createMatch(@Valid Match match){
        if(matchExists(match.getDate(), match.getATeam(), match.getBTeam())){
            throw new IllegalArgumentException("Match with the same date, team A, and team B already exists.");
        }
        try{
            LocalDate currentMatchDate = parseDate(String.valueOf(match.getDate()));
            match.setDate(currentMatchDate);
        } catch (DateTimeException e){
            throw new IllegalArgumentException(STR."Failed to parse the match date: \{match.getDate()}");
        }

        log.info(STR."Match is created");
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

        log.info(STR."Match with ID: \{id} is updated");
        return matchRepository.save(match);

    }

    @Transactional
    public void deleteMatch(Long id){
        if(!matchRepository.existsById(id)){
            throw new IllegalArgumentException(STR."Match with ID: \{id} doesn't exist");
        }
        Match match = matchRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(STR."Match not found with id \{id}"));

        matchRecordRepository.deleteByMatch(match);

        matchRepository.deleteById(id);

        log.info(STR."Deleted match with ID: \{id}");
    }
}
