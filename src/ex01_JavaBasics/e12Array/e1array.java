package ex01_JavaBasics.e12Array;

import java.util.Arrays;

public class e1array {
    public static void main(String[] args) {
//Q - Find 2nd largest number in an array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
