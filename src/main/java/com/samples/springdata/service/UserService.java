package com.samples.springdata.service;

import com.samples.springdata.entity.User;
import com.samples.springdata.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @PostConstruct
    public void init() {
        userRepository.save(new User(1, "vasya"));
        userRepository.save(new User(2, "petya"));
    }

    public User findUserById(Integer id) {
        return userRepository.findOne(id);
    }
}
