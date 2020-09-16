package com.samples.springdata.service;

import com.samples.springdata.entity.User;
import com.samples.springdata.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Profile("dev")
@Component
public class UserRepoInitializer {

    @Autowired
    UserRepository userRepository;

    @PostConstruct
    public void init() {
        userRepository.save(new User(1, "vasya"));
        userRepository.save(new User(2, "petya"));
    }
}
