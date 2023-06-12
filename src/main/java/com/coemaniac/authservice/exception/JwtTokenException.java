package com.coemaniac.authservice.exception;

public class JwtTokenException extends RuntimeException{

    public JwtTokenException(String message){
        super(message);

    }
}
