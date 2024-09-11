package com.sirma.footballapi.service;

import com.sirma.footballapi.exception.TeamNotFoundException;
import com.sirma.footballapi.models.Team;
import com.sirma.footballapi.repository.MatchRepository;
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
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    private boolean teamExists(String name, String managerFullName) {
        return teamRepository.existByNameAndManagerName(name, managerFullName);
    }

    public List<Team> getAllTeams(){
        if(teamRepository.findAll().isEmpty()){
            log.warn("No teams are found in the database");
            throw new TeamNotFoundException("No teams are found in the database");
        }
        return teamRepository.findAll();
    }

    public Optional<Team> getTeamById(Long id){
        return teamRepository.findById(id);
    }

    public Team createTeam(@Valid Team team){
        if(teamExists(team.getName(), team.getManagerFullName())){
            log.warn(STR."Team record already exists with name: \{team.getName()} and managerFullName: \{team.getManagerFullName()}");
            throw new RuntimeException(STR."A team with the name '\{team.getName()}' and manager '\{team.getManagerFullName()}' already exists.");
        }


        log.info("Team is created");
        return teamRepository.save(team);
    }

    public Team updateTeam(@NotNull Long id, @Valid Team team){
        if(!teamRepository.existsById(id)){
            throw new TeamNotFoundException(STR."Team with ID: \{id} doesn't exist");
        }
        team.setId(id);

        log.info("Team is updated");
        return teamRepository.save(team);
    }

    @Transactional
    public void deleteTeam(Long id){
        if(!teamRepository.existsById(id)){
            throw new TeamNotFoundException(STR."Team with ID: \{id} doesn't exist");
        }

        log.info(STR."Deleted Team with ID: \{id}");
        teamRepository.deleteById(id);
    }
}
