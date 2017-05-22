package com.company;

import com.company.JavaLearning;
import com.company.JavaLearningAddNumbers;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Tests {

    JavaLearningAddNumbers javaLearningAddNumbers = new JavaLearningAddNumbers();

    @Test
    public void testDeviedSentences() {
        JavaLearning javaLearning = new JavaLearning();

        String a = javaLearning.devideSentences("Helllo, world.What a nice day!It is going to rain.");

        Assert.assertEquals("Helllo, world",a);
    }

    @Test
    public  void testSumOfNumbers() throws Exception {
        JavaLearningAddNumbers javaLearningAddNumbers = new JavaLearningAddNumbers();

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


