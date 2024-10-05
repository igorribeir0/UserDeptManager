package com.devsuperior.UserDept.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.UserDept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    List<User> findByNameContaining(String name);
}
