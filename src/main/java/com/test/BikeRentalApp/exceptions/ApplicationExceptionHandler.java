/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.BikeRentalApp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;

/**
 *
 * @author Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
 */
@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler({ApplicationException.class, AsyncRequestTimeoutException.class})
    public String handleException(){
        System.out.println("in global exception handler");
        return "error";
    }
    
    @ExceptionHandler(LoginFailureException.class)
    public ResponseEntity handleLoginFailure(LoginFailureException ex){
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ex.getMessage());
    }
}
