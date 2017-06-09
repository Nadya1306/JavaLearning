package com.company;


import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.reverse;
import static javafx.scene.input.KeyCode.T;

public class JavaLearningArrays<T> {

    public int findBiggestNumberInArray(int[] numbers) {

        int biggestNumber = 0;

        for (int number : numbers) {

            if (biggestNumber < number) {

                biggestNumber = number;
            }

        }
        return biggestNumber;

    }

    public int[] reverseArrayOfNumbers(int[] arreyOfNumbers) {

        int[] reversed = new int[arreyOfNumbers.length];

        for (int i = 0; i < arreyOfNumbers.length; i++) {

            reversed[i] = arreyOfNumbers[arreyOfNumbers.length - 1 - i];
        }

        return reversed;
    }

    public int[] reverseArrayOfNumbersWithArrayUtils(int[] arrayOfNumbers) {

        ArrayUtils.reverse(arrayOfNumbers);

        return arrayOfNumbers;
    }

    public String[] reverseArrayOfStrings(String[] arrayOfStrings) {

        for (int i = 0; arrayOfStrings.length / 2 > i; i++) {

            String tmp = arrayOfStrings[i];

            arrayOfStrings[i] = arrayOfStrings[arrayOfStrings.length - i - 1];

            arrayOfStrings[arrayOfStrings.length - i - 1] = tmp;
        }

        return arrayOfStrings;
    }

    public T[] reverseArray(T[] arrayOfObjects) {

        for (int i = 0; arrayOfObjects.length / 2 > i; i++) {

            T tmp = arrayOfObjects[i];

            arrayOfObjects[i] = arrayOfObjects[arrayOfObjects.length - i - 1];

            arrayOfObjects[arrayOfObjects.length - i - 1] = tmp;
        }

        return arrayOfObjects;
    }

    public boolean verifyThatElementInArrayIsExist(T[] arrayOfElements, T element){

        for (T elementOfArray: arrayOfElements){

            if(elementOfArray == element){

                return true;
            }
            
        } return false;
    }
}
