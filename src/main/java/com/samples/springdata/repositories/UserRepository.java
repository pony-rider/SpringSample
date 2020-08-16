package com.samples.springdata.repositories;

import com.samples.springdata.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
