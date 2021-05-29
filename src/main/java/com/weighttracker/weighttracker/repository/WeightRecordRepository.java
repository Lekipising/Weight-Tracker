package com.weighttracker.weighttracker.repository;

import com.weighttracker.weighttracker.classes.WeightRecord;

import org.springframework.data.repository.CrudRepository;

public interface WeightRecordRepository extends CrudRepository<WeightRecord, Integer>{
    
}
