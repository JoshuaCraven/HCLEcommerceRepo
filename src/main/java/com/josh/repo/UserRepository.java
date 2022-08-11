package com.josh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josh.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
