package com.company;


public class JavaLearningArrays {

    public int findBiggestNumberInArray(int[] numbers){

        int biggestNumber = 0;

        for (int number:numbers){

            if( biggestNumber < number) {

                biggestNumber = number;
            }

        } return biggestNumber;


    }
}
