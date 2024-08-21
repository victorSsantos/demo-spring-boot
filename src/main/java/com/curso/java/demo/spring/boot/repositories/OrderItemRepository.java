package com.curso.java.demo.spring.boot.repositories;

import com.curso.java.demo.spring.boot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
