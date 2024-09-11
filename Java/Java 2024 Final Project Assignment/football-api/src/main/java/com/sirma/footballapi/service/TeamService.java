package com.sirma.footballapi.service;

import com.sirma.footballapi.exception.TeamNotFoundException;
import com.sirma.footballapi.models.Team;
import com.sirma.footballapi.repository.TeamRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@Validated
@Transactional
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
        if(teamRepository.existByNameAndManagerName(team.getName(), team.getManagerFullName())){
            log.warn(STR."Team record already exists with name: \{team.getName()} and managerFullName: \{team.getManagerFullName()}");
            throw new TeamNotFoundException(STR."A team with the name '\{team.getName()}' and manager '\{team.getManagerFullName()}' already exists.");
        }
        return teamRepository.save(team);
    }

    public Team updateTeam(@NotNull Long id, @Valid Team team){
        if(!teamRepository.existsById(id)){
            throw new TeamNotFoundException(STR."Team with ID: \{id} doesn't exist");
        }
        team.setId(id);
        return teamRepository.save(team);
    }

    public void deleteTeam(Long id){
        if(!teamRepository.existsById(id)){
            throw new TeamNotFoundException(STR."Team with ID: \{id} doesn't exist");
        }
        log.info(STR."Deleted Team with ID: \{id}");
        teamRepository.deleteById(id);
    }
}
