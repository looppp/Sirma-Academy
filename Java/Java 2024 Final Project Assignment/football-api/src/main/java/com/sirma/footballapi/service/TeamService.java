package com.sirma.footballapi.service;

import com.sirma.footballapi.models.Team;
import com.sirma.footballapi.repository.TeamRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

@Service
@Validated
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getAllTeams(){
        return teamRepository.findAll();
    }

    public Optional<Team> getTeamById(Long id){
        return teamRepository.findById(id);
    }

    public Team createTeam(@Valid Team team){
        if(teamRepository.existsById(team.getId())){
            throw new IllegalArgumentException(STR."Team with ID: \{team.getId()} allready exist");
        }
        return teamRepository.save(team);
    }

    public Team updateTeam(Long id, @Valid Team team){
        if(!teamRepository.existsById(id)){
            throw new IllegalArgumentException(STR."Team with ID: \{id} doesn't exist");
        }
        return teamRepository.save(team);
    }

    public void deleteTeam(Long id){
        if(!teamRepository.existsById(id)){
            throw new IllegalArgumentException(STR."Team with ID: \{id} doesn't exist");
        }
        teamRepository.deleteById(id);
    }
}
