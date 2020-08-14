package com.samples.springdata.service;

import com.samples.springdata.entity.User;
import com.samples.springdata.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserService {

    //@Autowired
    UserRepository userRepository = new UserRepository() {
        public <S extends User> S save(S s) {
            return null;
        }

        public <S extends User> Iterable<S> save(Iterable<S> iterable) {
            return null;
        }

        public User findOne(Integer integer) {
            return null;
        }

        public boolean exists(Integer integer) {
            return false;
        }

        public Iterable<User> findAll() {
            return null;
        }

        public Iterable<User> findAll(Iterable<Integer> iterable) {
            return null;
        }

        public long count() {
            return 0;
        }

        public void delete(Integer integer) {

        }

        public void delete(User user) {

        }

        public void delete(Iterable<? extends User> iterable) {

        }

        public void deleteAll() {

        }
    };

    @PostConstruct
    public void init() {
        //userRepository.save(new User(1, "vasya"));
        //userRepository.save(new User(2, "petya"));
    }

    public User findUserById(Integer id) {
        //return userRepository.findOne(id);
        return new User(1, "123");
    }
}