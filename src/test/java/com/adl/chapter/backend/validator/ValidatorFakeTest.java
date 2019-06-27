package com.adl.chapter.backend.validator;


import com.adl.chapter.backend.controller.PersonController;
import com.adl.chapter.backend.exception.PersonWithoutIdException;
import com.adl.chapter.backend.exception.PersonWithoutNameException;
import com.adl.chapter.backend.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ValidatorFakeTest {

    private PersonController personController;

    private PersonValidator personValidator;

    private PersonValidator personValidatorFailingByName;

    private PersonValidator personValidatorFailingById;

    private Person person;


    @Before
    public void setup(){
        personValidator = new PersonValidator();
        personValidatorFailingById = new PersonValidatorFakeFailingForId();
        personValidatorFailingByName = new PersonValidatorFakeFailingForName();
        person = new Person( 1 , "MockName");
    }

    @Test
    public void testPersonValitionOK(){
        //TODO: Complete this test
    }

    @Test(expected = PersonWithoutIdException.class)
    public void testPersonCreationExceptionWithoutId() throws PersonWithoutIdException, PersonWithoutNameException{
        personController = new PersonController(personValidatorFailingById);
        personController.validatePerson(person);
    }

    @Test(expected = PersonWithoutNameException.class)
    public void testPersonCreationExceptionWithoutName()throws PersonWithoutIdException, PersonWithoutNameException{
        //TODO: Complete this test
    }
}
