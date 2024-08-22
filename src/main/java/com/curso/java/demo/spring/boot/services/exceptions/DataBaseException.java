package com.curso.java.demo.spring.boot.services.exceptions;

public class DataBaseException extends RuntimeException {

    public DataBaseException(String message) {
        super(message);
    }
}
