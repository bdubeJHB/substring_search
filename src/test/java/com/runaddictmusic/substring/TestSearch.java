package com.runaddictmusic.substring;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestSearch {
        @Test
        public void bruteForceFindsCorrectIndex() {
                assertEquals(Search.bruteForce("this",
                                               "Well, this is a useless text"),
                             6);
        }

        @Test
        public void bruteForceReturnsNegative1IfNotFound() {
                String  pattern = "this";
                String  text = "I think there is no text here, not from that pattern";

                assertEquals(Search.bruteForce(pattern, text), -1);
        }

        @Test
        public void bruteForceFindsMatchEvenIfLetterCaseDiffers() {
                String  pattern = "Boyer mooRe";
                String  text = "and brute force is slower than Boyer Moore algo";

                assertEquals(Search.bruteForce(pattern, text), 31);
        }
}

