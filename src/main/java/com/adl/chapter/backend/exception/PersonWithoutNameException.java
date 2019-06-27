package com.adl.chapter.backend.exception;

public class PersonWithoutNameException extends Exception {

  private static final String ERROR_MSG = "The Name field must be fulfilled";

  public PersonWithoutNameException(){
    super(ERROR_MSG);
  }

}
