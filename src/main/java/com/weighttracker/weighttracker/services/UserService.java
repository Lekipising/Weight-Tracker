package com.weighttracker.weighttracker.services;

import java.util.List;

import com.weighttracker.weighttracker.classes.User;
import com.weighttracker.weighttracker.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void createUser(User user){
        userRepository.save(user);
    }

    public User getUser(String username){
        return userRepository.findById(username).get();
    }

    public List<User> getAllUsers(){
        return (List<User>) userRepository.findAll();
    }

    // update whole USER
    public void updateUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(String username){
        userRepository.deleteById(username);
    }


}
