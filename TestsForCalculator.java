package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestsForCalculator {

    JavaLearningCalculator javaLearningAddNumbers = new JavaLearningCalculator();

    @Test
    public  void testSumOfNumbers() throws Exception {
        JavaLearningCalculator javaLearningAddNumbers = new JavaLearningCalculator();

        int a = javaLearningAddNumbers.sumOfNumbers(2);

        Assert.assertEquals(3,a);
    }

    @Test(expected = Exception.class)
    public void testSumOfZero() throws Exception {

         javaLearningAddNumbers.sumOfNumbers(0);
    }

    @Test(expected = Exception.class)
    public void testSumOfNegativeNumber() throws Exception {

         javaLearningAddNumbers.sumOfNumbers(-2);
    }

    @Test
    public  void testSumOfNumberWithFirstZero() throws Exception {
        int sum = javaLearningAddNumbers.sumOfNumbers(02);
        Assert.assertEquals(3,sum);
    }

    @Test
    public  void testSumOfNumber() throws Exception {
        int sum = javaLearningAddNumbers.sumOfNumbers(100);
        Assert.assertEquals(5050, sum);
    }
}


