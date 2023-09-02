package org.jboss.resteasy.test.spring.inmodule.resource;

import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(NoHandlerFoundException.class)
//    public ResponseEntity<String> handleNoHandlerFoundException(NoHandlerFoundException ex) {
//        return new ResponseEntity<>("Error 404 - Page Not Found", HttpStatus.NOT_FOUND);
//    }

    @ResponseStatus(HttpStatus.NOT_FOUND)  // 409
    @ExceptionHandler(NoHandlerFoundException.class)
    public void handleConflict() {
        // Nothing to do
    }

}
