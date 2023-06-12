package com.coemaniac.authservice.exception;

public class FileLoadException extends RuntimeException{

  public FileLoadException(String msg, Throwable cause){
        super(msg,cause);
    }
}
