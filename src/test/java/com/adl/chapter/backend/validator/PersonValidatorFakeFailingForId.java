package com.adl.chapter.backend.validator;

import com.adl.chapter.backend.exception.PersonWithoutIdException;
import com.adl.chapter.backend.exception.PersonWithoutNameException;
import com.adl.chapter.backend.model.Person;

public class PersonValidatorFakeFailingForId extends PersonValidator {

  public boolean validatePersonId(Person person) throws PersonWithoutIdException {
    throw new PersonWithoutIdException();
  }

}
