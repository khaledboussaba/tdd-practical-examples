package com.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void printsRegularNumbers() {
        assertEquals("1", fizzBuzz.read(1));
    }

    @Test
    public void printsFizzForMultiplesOfThree() {
        assertEquals("Fizz", fizzBuzz.read(3));
    }

    @Test
    public void printsBuzzForMultiplesOfFive() {
        assertEquals("Buzz", fizzBuzz.read(5));
    }

    @Test
    public void printsFizzBuzzForMultiplesOfFiveAndThree() {
        assertEquals("FizzBuzz", fizzBuzz.read(15));
    }

    @Test
    public void returnsARangeOfNumbers() {
        int count = 10;
        String[] actualRange = fizzBuzz.range(count);
        assertEquals(count, actualRange.length);

        for(int i = 0; i < count; i++) {
            String expected = fizzBuzz.read(i + 1);
            assertEquals(expected, actualRange[i]);
        }
    }

}