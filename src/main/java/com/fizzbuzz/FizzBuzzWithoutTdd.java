package com.fizzbuzz;

import java.util.Scanner;

public class FizzBuzzWithoutTdd {

    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Please input an integer :");
        int number = consoleInput.nextInt();
        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Buzz");
        else if (number % 3 == 0)
            System.out.println("Fizz");
        else
            System.out.println(number);

    }

}
