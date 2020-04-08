package com.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    public String read(int number) {
        if (number % 15 == 0){
            return "FizzBuzz";
        }
        if (number % 5 == 0){
            return "Buzz";
        }
        if (number % 3 == 0){
            return "Fizz";
        }
        return String.format("%d", number);
    }

    public String[] range(int count) {
//        String[] result = new String[count];
//        for(int i = 0; i < count; i++) {
//            result[i] = read(i + 1);
//        }
//        return result;
        return IntStream.rangeClosed(1, count)
                .mapToObj(this::read)
                .toArray(String[]::new);
    }
}
