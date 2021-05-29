package com.weighttracker.weighttracker.services;

import java.util.List;

import com.weighttracker.weighttracker.classes.WeightRecord;
import com.weighttracker.weighttracker.repository.WeightRecordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeightRecordService {
    
    @Autowired
    WeightRecordRepository weightRecordRepository;

    // add
    public void createRecord(WeightRecord weightRecord){
        weightRecordRepository.save(weightRecord);
    }

    // view one
    public WeightRecord getRecord(Integer recordId){
        return weightRecordRepository.findById(recordId).get();
    }

    // view all
    public List<WeightRecord> getAllRecords(){
        return (List<WeightRecord>) weightRecordRepository.findAll();
    }

    // update
    public void updateRecord(WeightRecord weightRecord){
        weightRecordRepository.save(weightRecord);
    }

    // delete
    public void deleteRecord(Integer recordId){
        weightRecordRepository.deleteById(recordId);
    }
}
