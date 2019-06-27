package com.adl.chapter.backend.controller;

import com.adl.chapter.backend.exception.PersonWithoutIdException;
import com.adl.chapter.backend.exception.PersonWithoutNameException;
import com.adl.chapter.backend.model.Person;
import com.adl.chapter.backend.validator.PersonValidator;

public class PersonController {

  private PersonValidator personValidator;

  public PersonController(){
    personValidator = new PersonValidator();
  }

  public PersonController(PersonValidator personValidator){
    this.personValidator = personValidator;
  }

  public boolean validatePerson(Person person) throws PersonWithoutIdException, PersonWithoutNameException {
    return personValidator.validatePersonName(person) && personValidator.validatePersonId(person);
  }

}
