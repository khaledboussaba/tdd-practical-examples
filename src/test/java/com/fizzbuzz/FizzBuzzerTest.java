package com.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzerTest {

    FizzBuzzer underTest;

    private void testFizzBuzz(FizzBuzzer underTest, String expectedResult, int fizzBuzzNumber) {
        String actualResult = underTest.fizzBuzz(fizzBuzzNumber);
        assertEquals(expectedResult, actualResult);
    }

    @Before
    public void initialize() {
        underTest = new FizzBuzzer();
    }

    @Test
    public void whenInputLessThanOneReturnInvalidInput() {
        testFizzBuzz(underTest, "Invalid input", 0);
    }

    @Test
    public void whenInputIsOneThanReturnOne() {
        testFizzBuzz(underTest, "1", 1);
    }

    @Test
    public void whenInputIsTwoThanReturnTwo() {
        testFizzBuzz(underTest, "2", 2);
    }

    @Test
    public void whenInputIsThreeThanReturnFizz() {
        testFizzBuzz(underTest, "Fizz", 3);
    }

    @Test
    public void whenInputIsSixThanReturnFizz() {
        testFizzBuzz(underTest, "Fizz", 6);
    }

    @Test
    public void whenInputIsFiveThanReturnBuzz() {
        testFizzBuzz(underTest, "Buzz", 5);
    }

    @Test
    public void whenInputIsTenThanReturnBuzz() {
        testFizzBuzz(underTest, "Buzz", 10);
    }

    @Test
    public void whenInputIsNegativeTenThanReturnInvalidInput() {
        testFizzBuzz(underTest, "Invalid input", -10);
    }

    @Test
    public void whenInputIsFifteenThanReturnFizzBuzz() {
        testFizzBuzz(underTest, "FizzBuzz", 15);
    }

    @Test
    public void whenInputIsThirtyThanReturnFizzBuzz() {
        testFizzBuzz(underTest, "FizzBuzz", 30);
    }

}
