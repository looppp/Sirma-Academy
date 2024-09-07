package com.sirma.footballapi.service;

import com.sirma.footballapi.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    public List<Record> getAllRecords(){
        return recordRepository.findAll();
    }

    public Optional<Record> getRecordById(Long id){
        return recordRepository.findById(id);
    }

    public Record createRecord(Record record){
        return recordRepository.save(record);
    }

    public void deleteRecord(Long id){
        recordRepository.deleteById(id);
    }
}
