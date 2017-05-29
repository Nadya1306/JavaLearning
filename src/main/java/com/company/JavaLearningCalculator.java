package com.company;


public class JavaLearningCalculator {


    public boolean isMultiplicity(int a, int b) {

        return a % b == 0;
    }


    public int addNumbers(int number) throws Exception {

        if (number <= 1) {
            throw new Exception("Number should be bigger then 0.");
        }

        int sum = 0;

        for (int i = 1; i <= number; i++) {

            if (isMultiplicity(i, 3)|| isMultiplicity(i, 5)) {

                sum = sum + i;

            }
        }
        return sum;
    }
}

