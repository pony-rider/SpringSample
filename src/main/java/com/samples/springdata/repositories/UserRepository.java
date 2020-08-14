package com.samples.springdata.repositories;

import com.samples.springdata.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
