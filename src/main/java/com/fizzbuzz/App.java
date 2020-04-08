package com.fizzbuzz;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Arrays.stream(fizzBuzz.range(100))
                .forEach(System.out::println);
    }
}
