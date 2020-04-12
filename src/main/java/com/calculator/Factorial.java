package com.calculator;

public class Factorial {

    public int factorialCalculation(int inputNumber) {
        if (inputNumber <= 1)
            return 1;
        return inputNumber * (factorialCalculation(inputNumber - 1));
    }

}
