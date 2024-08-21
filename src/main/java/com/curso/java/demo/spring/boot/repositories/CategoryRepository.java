package com.curso.java.demo.spring.boot.repositories;

import com.curso.java.demo.spring.boot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}

