package com.curso.java.demo.spring.boot.repositories;

import com.curso.java.demo.spring.boot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
