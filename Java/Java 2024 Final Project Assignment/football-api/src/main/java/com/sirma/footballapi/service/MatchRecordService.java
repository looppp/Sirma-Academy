package com.sirma.footballapi.service;


import com.sirma.footballapi.models.MatchRecord;
import com.sirma.footballapi.repository.MatchRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatchRecordService {

    @Autowired
    private MatchRecordRepository matchRecordRepository;

    public List<MatchRecord> getAllRecords(){
        return matchRecordRepository.findAll();
    }

    public Optional<MatchRecord> getRecordById(Long id){
        return matchRecordRepository.findById(id);
    }

    public void createRecord(MatchRecord matchRecord){
        matchRecordRepository.save(matchRecord);
    }

    public void deleteRecord(Long id){
        matchRecordRepository.deleteById(id);
    }
}
