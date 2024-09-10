package com.sirma.footballapi.repository;

import com.sirma.footballapi.models.Match;
import com.sirma.footballapi.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

    boolean existsByDateAndATeamAndBTeam(LocalDate date, Team aTeam, Team bTeam);
}
