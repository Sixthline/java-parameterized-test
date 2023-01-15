package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void isAdultWhenAgeIsMoreThan18True() {
        Person men = new Person();
        int age = 18;
        boolean actualResult = men.isAdult(age);
        assertTrue("Молоко под носом", actualResult);
    }
}