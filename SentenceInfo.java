package com.company;

public class SentenceInfo {

    private int sentenceLength;

    private String sentence;


    public SentenceInfo(int sentenceLength, String sentence) {

        this.sentenceLength = sentenceLength;

        this.sentence = sentence;
    }

    public int getWordLength() {

        return this.sentenceLength;
    }

    public String getSentence() {

        return this.sentence;
    }
}




