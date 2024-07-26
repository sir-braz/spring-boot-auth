package com.example.backend.utility;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BackendException extends ResponseStatusException {
    public BackendException(String mensage){
        super(HttpStatus.INTERNAL_SERVER_ERROR, mensage);
    }
}
