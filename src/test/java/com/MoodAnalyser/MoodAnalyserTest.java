package com.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void givenMsg_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is sad message");
        String mood = null;
        try{
            mood = moodAnalyser.analyseMood();
        }
        catch (MoodAnalysisException e){

        }
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMsg_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is happy message");
        String mood = null;
        try{
            mood = moodAnalyser.analyseMood();
        }catch (MoodAnalysisException e){

        }
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNull_MoodShould_BeHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            ExpectedException exceptionRule=ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

}
