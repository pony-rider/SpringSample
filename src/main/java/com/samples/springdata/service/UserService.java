package com.samples.springdata.service;

import com.samples.springdata.entity.User;
import com.samples.springdata.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findUserById(Integer id) {
        return userRepository.findOne(id);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
