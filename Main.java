package com.company;

import java.util.Scanner;

public class Main {

    public static void sumNumbersSystemOut(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        JavaLearningCalculator javaLearningAddNumbers = new JavaLearningCalculator();

        int sum = javaLearningAddNumbers.sumOfNumbers(scanner.nextInt());

        System.out.println(sum);
    }
}
