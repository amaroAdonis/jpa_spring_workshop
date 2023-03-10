package com.jpa_spring_course.jpa_spring.services.exceptions;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String msg) {
        super(msg);
    }

}
