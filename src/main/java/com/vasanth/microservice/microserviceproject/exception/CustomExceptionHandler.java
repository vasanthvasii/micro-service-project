package com.vasanth.microservice.microserviceproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<CustErrors> resourceNotFound(ResourceNotFound ex, WebRequest req){
        CustErrors error = new CustErrors(ex.getMessage(), "404", new Date());
        return new ResponseEntity<CustErrors>(error,HttpStatus.NOT_FOUND);
    }
}
