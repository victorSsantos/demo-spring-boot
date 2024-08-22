package com.curso.java.demo.spring.boot.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Resource not found in database:: Id " + id);
    }
}
