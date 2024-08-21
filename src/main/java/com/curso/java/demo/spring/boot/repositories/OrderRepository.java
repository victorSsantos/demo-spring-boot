package com.curso.java.demo.spring.boot.repositories;

import com.curso.java.demo.spring.boot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
