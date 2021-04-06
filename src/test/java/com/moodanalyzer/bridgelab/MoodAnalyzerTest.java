package com.moodanalyzer.bridgelab;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessgae_whenSad_shouldReturnHappy() {
        MoodAnalyAser moodAnalyAser = new MoodAnalyAser();
        String mood = moodAnalyAser.analyaseMood("this is happy mood");
        Assert.assertEquals("happy", mood);

    }

    @Test
    public void givenMessgae_whenSad_shouldReturnSad() {
        MoodAnalyAser moodAnalyAser = new MoodAnalyAser();
        String mood = moodAnalyAser.analyaseMood("this is sad mood");
        Assert.assertEquals("sad", mood);

    }
}
