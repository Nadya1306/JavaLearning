package com.company;


import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        JavaLearningAddNumbers javaLearningAddNumbers = new JavaLearningAddNumbers();

        int sum = javaLearningAddNumbers.sumOfNumbers(scanner.nextInt());

        System.out.println(sum);

    }
}























//        Scanner scanner = new Scanner(System.in);
//
//        int k;
//
//        int sum = 0;
//
//        int a = 3;
//
//        int b = 5;
//
//
//        System.out.println("Hello user, enter your number, please:");
//
//
//        k = scanner.nextInt();
//
//
//        for (int i=0; i <= k && (i%a==0 || i%b==0); ++i) {
//
//            sum += i;
//     }
//            System.out.println("Sum is :" + sum);
//        }














