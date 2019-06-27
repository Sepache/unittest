package com.adl.chapter.backend.validator;


import com.adl.chapter.backend.controller.PersonController;
import com.adl.chapter.backend.exception.PersonWithoutIdException;
import com.adl.chapter.backend.exception.PersonWithoutNameException;
import com.adl.chapter.backend.model.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class ValidatorMockTest {

  @Mock
  private PersonValidator personValidator;


  private PersonController personController;

  private Person person;

  @Before
  public void setup(){

    MockitoAnnotations.initMocks(this);

    person = new Person(1, "MockName");

    personController = new PersonController(personValidator);
  }

  @Test
  public void testPersonValitionOK()throws PersonWithoutNameException, PersonWithoutIdException {
    Mockito.when(personValidator.validatePersonId(
        person
    )).thenReturn(true);

    Mockito.when(personValidator.validatePersonName(
        person
    )).thenReturn(true);

    boolean personValidationStatus = personController.validatePerson(person);

    Assert.assertTrue(personValidationStatus);
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
