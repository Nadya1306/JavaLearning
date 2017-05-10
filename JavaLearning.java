package com.company;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaLearning {

    public String devideSentences(String st) {

        String[] sentences = st.split("[.!]");

        String longestSentence = null;
        int longestSentenceLength = 0;

        ArrayList<SentenceInfo> sentencesInfo = new ArrayList<SentenceInfo>();

        for (String sentence : sentences) {

           // int longestWordLength = 0;

            int sentenceLength = sentence.split("[ ]").length;

            sentencesInfo.add(new SentenceInfo(sentenceLength, sentence));

            if (longestSentenceLength<sentenceLength) {

                longestSentenceLength = sentenceLength;

            }

                    longestSentence = new SentenceInfo(longestSentenceLength,sentence).getSentence();

                }

//            for (String word : words) {
//
//                int wordLength = word.length();
//
//                if (longestWordLength < wordLength) {
//
//                    longestWordLength = wordLength;

//                    sentenceWithLongestWord = new SentenceInfo(longestWordLength, sentence).getSentence();
//                }
//            }

//            sentencesInfo.add(new SentenceInfo(longestSentence, sentence));
//        }

//        int longestWordLength = 0;
//       // String sentenceWithLongestWord = null;
//
//        for (SentenceInfo sentenceInfo : sentencesInfo) {
//
//            if (sentenceInfo.getWordLength() > longestWordLength) {
//
//                longestWordLength = sentenceInfo.getWordLength();
//
//                sentenceWithLongestWord = sentenceInfo.getSentence();
//            }



        return longestSentence;
    }
}
