package com.sirma.footballapi.repository;

import com.sirma.footballapi.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query("SELECT CASE WHEN COUNT(m) > 0 THEN true ELSE false END FROM Team m WHERE m.name = :name AND m.managerFullName = :managerFullName")
    boolean existByNameAndManagerName(@Param("name") String name, @Param("managerFullName") String managerFullName);
}
