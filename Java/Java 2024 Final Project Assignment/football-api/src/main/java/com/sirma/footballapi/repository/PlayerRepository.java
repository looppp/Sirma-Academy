package com.sirma.footballapi.repository;

import com.sirma.footballapi.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {


    @Query("SELECT COUNT(p) > 0 FROM Player p WHERE p.teamNumber = :teamNumber AND p.position = :position AND p.fullName = :fullName")
    boolean existsByTeamNumberPositionFullName(@Param("teamNumber") Integer teamNumber, @Param("position") String position, @Param("fullName") String fullName);
}
