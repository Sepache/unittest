package com.adl.chapter.backend.exception;

public class PersonWithoutIdException extends Exception {

  private static final String ERROR_MSG = "The id field must be fulfilled";

  public PersonWithoutIdException(){
    super(ERROR_MSG);
  }

}
