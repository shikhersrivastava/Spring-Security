package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
//@EnableJpaRepositories("com.example.demo")
public interface UserRepo extends JpaRepository<User,Long> {


    User findByName(String name);
}
