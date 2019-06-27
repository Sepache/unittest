package com.adl.chapter.backend.validator;

import com.adl.chapter.backend.exception.PersonWithoutIdException;
import com.adl.chapter.backend.exception.PersonWithoutNameException;
import com.adl.chapter.backend.model.Person;

public class PersonValidator {

  public boolean validatePersonName(Person person) throws PersonWithoutNameException {
    if(person.getName() == null){
      throw new PersonWithoutNameException();
    }
    return true;
  }

  public boolean validatePersonId(Person person) throws PersonWithoutIdException{
    if(person.getId() == null){
      throw new PersonWithoutIdException();
    }
    return true;
  }

}
