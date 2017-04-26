package com.company;



import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.println("Hello user, enter your name, please:");


        name = scanner.nextLine();

        if (name == "Alice") {
            System.out.println("Hello user " + name + "!");
        } else if (name == "Bob") {
            System.out.println("Hello user " + name + "!");
        } else {
            System.out.println("Hello user  !");


//        switch (name){
//
//            case "Alice":
//                System.out.println("Hello user " + name + "!");
//
//                break;
//
//            case "Bob":
//                System.out.println("Hello user " + name + "!");
//
//                break;
//
//            default:
//                System.out.println("Hello user  !");
//
//                break;
//
//        }


        }


    }
}

