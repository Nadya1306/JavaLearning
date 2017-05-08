package com.company;

public class SentenceInfo {

    private int wordLength;

    private String sentence;


    public SentenceInfo(int wordLength, String sentence) {

        this.wordLength = wordLength;

        this.sentence = sentence;
    }

    public int getWordLength() {

        return this.wordLength;
    }

    public String getSentence() {

        return this.sentence;
    }
}




