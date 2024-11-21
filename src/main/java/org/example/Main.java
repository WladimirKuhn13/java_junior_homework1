package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
        getAverage(numbers);
    }

    public static void getAverage (List<Integer> numbers) {

        int sum = numbers.stream()
                .filter(number -> number % 2 == 0).mapToInt(Integer::intValue)
                .sum();

        double count = numbers.stream()
                .filter(number -> number % 2 == 0).count();

        System.out.println("Среднее арифметическое четных чисел в списке =" + " "+sum / count);
    }
}
