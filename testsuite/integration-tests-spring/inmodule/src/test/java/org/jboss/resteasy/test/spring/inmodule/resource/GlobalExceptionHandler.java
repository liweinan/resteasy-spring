package org.jboss.resteasy.test.spring.inmodule.resource;

//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
//@ControllerAdvice
@Component
public class GlobalExceptionHandler {

//    @ExceptionHandler(NoHandlerFoundException.class)
//    public ResponseEntity<String> handleNoHandlerFoundException(NoHandlerFoundException ex) {
//        return new ResponseEntity<>("Error 404 - Page Not Found", HttpStatus.NOT_FOUND);
//    }

}