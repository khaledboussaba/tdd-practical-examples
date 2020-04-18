package com.fizzbuzz;

public class FizzBuzzer {

    public String fizzBuzz(int fizzBuzzNumber) {
        /*
        if (isInvalidInput(fizzBuzzNumber)) {
            return "Invalid input";
        } else if (isDivisibleByFive(fizzBuzzNumber) && isDivisibleByThree(fizzBuzzNumber)) {
            return "FizzBuzz";
        } else if (isDivisibleByFive(fizzBuzzNumber)) {
            return "Buzz";
        } else if (isDivisibleByThree(fizzBuzzNumber)) {
            return "Fizz";
        } else {
            return Integer.toString(fizzBuzzNumber);
        }
        */
        String result = "";
        if (isInvalidInput(fizzBuzzNumber)) {
            return "Invalid input";
        }
        if (isDivisibleByThree(fizzBuzzNumber)) {
            result += "Fizz";
        }
        if (isDivisibleByFive(fizzBuzzNumber)) {
            result += "Buzz";
        }
        if (result.isEmpty()) {
            result += fizzBuzzNumber;
        }
        return result;
    }

    private boolean isDivisibleByFive(int fizzBuzzNumber) {
        return fizzBuzzNumber % 5 == 0;
    }

    private boolean isDivisibleByThree(int fizzBuzzNumber) {
        return fizzBuzzNumber % 3 == 0;
    }

    private boolean isInvalidInput(int fizzBuzzNumber) {
        return fizzBuzzNumber < 1;
    }

}
