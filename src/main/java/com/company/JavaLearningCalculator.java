package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class JavaLearningCalculator {


    public boolean multiplicity(int a, int b) {

        return a % b == 0;
    }


    public int sumOfNumbers(int number) throws Exception {

        if (number <= 1) {
            throw new Exception("Number should be bigger then 0.");
        }

        int sum = 0;

        for (int i = 1; i <= number; i++) {

            if (multiplicity(i, 3)||multiplicity(i, 5)) {

                sum = sum + i;

            }
        }
        return sum;
    }
}

