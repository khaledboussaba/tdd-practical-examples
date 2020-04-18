package com.fizzbuzz;

public class FizzBuzzer {

    public String fizzBuzz(int fizzBuzzNumber) {
        if (fizzBuzzNumber < 1) {
            return "Invalid input";
        } else if (fizzBuzzNumber % 5 == 0 && fizzBuzzNumber % 3 == 0) {
            return "FizzBuzz";
        } else if (fizzBuzzNumber % 5 == 0) {
            return "Buzz";
        } else if (fizzBuzzNumber % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(fizzBuzzNumber);
        }
    }

}
