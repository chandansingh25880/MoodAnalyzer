package com.moodanalyzer.bridgelab;

public class MoodAnalyAser {
    public String analyaseMood(String message) {
        if(message.contains("happy"))
            return "happy" ;
        else
            return "sad";

    }
}