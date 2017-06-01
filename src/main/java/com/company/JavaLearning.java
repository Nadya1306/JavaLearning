package com.company;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaLearning {

    public String devideSentences(String st) {

        String[] sentences = st.split("[.!]");

        String sentenceWithMaxComma = null;

        int maxNumberOfCommas = 0;

        for (String sentence : sentences) {

            int numberOfCommas = countCommas(sentence);

            if (maxNumberOfCommas < numberOfCommas) {

                maxNumberOfCommas = numberOfCommas;

                sentenceWithMaxComma = sentence;
            }
        }

        return sentenceWithMaxComma;
    }

    private int countCommas(String string){

        char[] Array = string.toCharArray();

        int numberOfCommas = 0;

        for (char c : Array) {
            if (c == ',') {
                numberOfCommas++;
            }
        }
        return  numberOfCommas;
    }


}
