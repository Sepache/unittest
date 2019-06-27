package com.adl.chapter.backend.validator;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.adl.chapter.backend.controller.PersonController;
import com.adl.chapter.backend.exception.PersonWithoutIdException;
import com.adl.chapter.backend.exception.PersonWithoutNameException;
import com.adl.chapter.backend.model.Person;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ValidatorSpyTest {

  private PersonValidator personValidator;

  private PersonController personController;

  private Person person;

  @Before
  public void setup(){
    personValidator = spy(new PersonValidator());
    personController = new PersonController(personValidator);
    person = new Person(1 , "MockName");
  }

  @Test
  public void testPersonValitionOK() throws PersonWithoutIdException, PersonWithoutNameException {
    personController.validatePerson(person);
    verify(personValidator, times(1)).validatePersonId(person);
    verify(personValidator , times(1)).validatePersonName(person);
  }

  @Test(expected = PersonWithoutIdException.class)
  public void testPersonCreationExceptionWithoutId(){
    //TODO: Complete this test
  }

  @Test(expected = PersonWithoutNameException.class)
  public void testPersonCreationExceptionWithoutName(){
    //TODO: Complete this test
  }

}
