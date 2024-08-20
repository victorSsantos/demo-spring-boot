package com.curso.java.demo.spring.boot.repositories;

import com.curso.java.demo.spring.boot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
