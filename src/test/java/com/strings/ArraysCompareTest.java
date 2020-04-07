package com.strings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysCompareTest {

    @Test
    public void arraySort_RandomArray() {
        int[] numbers = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test(expected = NullPointerException.class)
    public void arraySort_NullArray() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    @Test(timeout = 1000)
    public void arraySort_Performance() {
        int[] array = {12, 23, 4};
        for (int i = 1; i < 1000000; i++) {
            array[0] = i;
            Arrays.sort(array);
        }
    }

}
