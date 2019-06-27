package com.adl.chapter.backend.validator;

import com.adl.chapter.backend.exception.PersonWithoutIdException;
import com.adl.chapter.backend.exception.PersonWithoutNameException;
import com.adl.chapter.backend.model.Person;

public class PersonValidatorFakeFailingForName extends PersonValidator {

  public boolean validatePersonName(Person person) throws PersonWithoutNameException {

    throw new PersonWithoutNameException();
  }
}
