package com.weighttracker.weighttracker.repository;

import com.weighttracker.weighttracker.classes.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    
}
