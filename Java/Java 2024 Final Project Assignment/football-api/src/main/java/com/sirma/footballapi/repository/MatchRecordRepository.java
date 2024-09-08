package com.sirma.footballapi.repository;

import com.sirma.footballapi.models.MatchRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRecordRepository extends JpaRepository<MatchRecord, Long> {
}
