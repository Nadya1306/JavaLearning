package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class JavaLearningCalculator {

    public int sumOfNumbers( int number) throws Exception {

        if (number <= 1){
            throw new Exception("Number should be bigger then 0.");
        }

        int sum=0;

        for(int i =1; i<= number;i++){

            sum = sum+i;
        }

        return sum;
    }
}
