package com.runaddictmusic.substring;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestSearch {
        @Test
        public void bruteForceFindsCorrectIndex() {
                assertEquals(6, Search.bruteForce("this",
                                                  "Well, this is a useless text"));
        }

        @Test
        public void bruteForceReturnsNegative1IfNotFound() {
                String  pattern = "this";
                String  text = "I think there is no text here, not from that pattern";

                assertEquals(-1, Search.bruteForce(pattern, text));
        }

        @Test
        public void bruteForceCanMatchStringsWithSpacesInBetween() {
                String  pattern = "boyer moore";
                String  text = "and brute force is slower than boyer moore algo";

                assertEquals(31, Search.bruteForce(pattern, text));
        }

        @Test
        public void bruteForceIgnoresLetterCasingWhenLastBooleanParameterSet() {
                String  pattern = "Boyer mooRe";
                String  text = "And brute force is slower than Boyer Moore algo";

                assertNotEquals(-1, Search.bruteForce(pattern, text, true));
                assertEquals(31, Search.bruteForce(pattern, text, true));
        }
}

