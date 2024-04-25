package com.project.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.User;

public interface UserRepositry extends JpaRepository<User, Integer> {

}
