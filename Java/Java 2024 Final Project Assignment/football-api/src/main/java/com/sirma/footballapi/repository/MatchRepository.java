package com.sirma.footballapi.repository;

import com.sirma.footballapi.models.Match;
import com.sirma.footballapi.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

    @Query("SELECT CASE WHEN COUNT(m) > 0 THEN true ELSE false END FROM Match m WHERE m.date = :date AND m.aTeam = :aTeam AND m.bTeam = :bTeam")
    boolean existsByDateAndATeamAndBTeam(@Param("date") LocalDate date, @Param("aTeam") Team aTeam, @Param("bTeam") Team bTeam);
}
