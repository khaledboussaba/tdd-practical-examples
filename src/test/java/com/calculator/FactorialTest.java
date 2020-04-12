package com.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    private Factorial factorialUnderTest = new Factorial();

    @Test
    public void factorialOfZero_shouldReturn1() {
        assertEquals(1, factorialUnderTest.factorialCalculation(0));
    }

    @Test
    public void factorialOfOne_shouldReturn1() {
        assertEquals(1, factorialUnderTest.factorialCalculation(1));
    }

    @Test
    public void factorialOfTwo_shouldReturn2() {
        assertEquals(2, factorialUnderTest.factorialCalculation(2));
    }

    @Test
    public void factorialOfFive_shouldReturn120() {
        assertEquals(120, factorialUnderTest.factorialCalculation(5));
    }

}