package com.curso.java.demo.spring.boot.services;

import com.curso.java.demo.spring.boot.entities.Category;
import com.curso.java.demo.spring.boot.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
