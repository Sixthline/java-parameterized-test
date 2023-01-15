package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void additionPositiveNumbersPositiveResult() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.addition(3,2);
        int expected = 3 + 2;
        assertEquals(expected, actualResult);
    }

    @Test
    public void subtractionPositiveNumbersPositiveResult() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.subtraction(5, 2);
        int expected = 5 - 2;
        assertEquals(expected, actualResult);
    }
}