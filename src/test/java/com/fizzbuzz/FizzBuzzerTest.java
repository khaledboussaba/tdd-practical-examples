package com.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzerTest {

    @Test
    public void whenInputLessThanOneReturnInvalidInput() {
        FizzBuzzer underTest = new FizzBuzzer();
        String testOutput = underTest.fizzBuzz(0);
        assertEquals("Invalid input", testOutput);
    }

    @Test
    public void whenInputIsOneThanReturnOne() {
        FizzBuzzer underTest = new FizzBuzzer();
        String testOutput = underTest.fizzBuzz(1);
        assertEquals("1", testOutput);
    }

    @Test
    public void whenInputIsTwoThanReturnTwo() {
        FizzBuzzer underTest = new FizzBuzzer();
        String testOutput = underTest.fizzBuzz(2);
        assertEquals("2", testOutput);
    }

    @Test
    public void whenInputIsThreeThanReturnFizz() {
        FizzBuzzer underTest = new FizzBuzzer();
        String testOutput = underTest.fizzBuzz(3);
        assertEquals("Fizz", testOutput);
    }

    @Test
    public void whenInputIsSixThanReturnFizz() {
        FizzBuzzer underTest = new FizzBuzzer();
        String testOutput = underTest.fizzBuzz(6);
        assertEquals("Fizz", testOutput);
    }

    @Test
    public void whenInputIsFiveThanReturnBuzz() {
        FizzBuzzer underTest = new FizzBuzzer();
        String testOutput = underTest.fizzBuzz(5);
        assertEquals("Buzz", testOutput);
    }

    @Test
    public void whenInputIsTenThanReturnBuzz() {
        FizzBuzzer underTest = new FizzBuzzer();
        String testOutput = underTest.fizzBuzz(10);
        assertEquals("Buzz", testOutput);
    }

    @Test
    public void whenInputIsNegativeTenThanReturnInvalidInput() {
        FizzBuzzer underTest = new FizzBuzzer();
        String testOutput = underTest.fizzBuzz(-10);
        assertEquals("Invalid input", testOutput);
    }

    @Test
    public void whenInputIsFifteenThanReturnFizzBuzz() {
        FizzBuzzer underTest = new FizzBuzzer();
        String testOutput = underTest.fizzBuzz(15);
        assertEquals("FizzBuzz", testOutput);
    }

    @Test
    public void whenInputIsThirtyThanReturnFizzBuzz() {
        FizzBuzzer underTest = new FizzBuzzer();
        String testOutput = underTest.fizzBuzz(30);
        assertEquals("FizzBuzz", testOutput);
    }

}
