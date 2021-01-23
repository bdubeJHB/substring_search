package com.runaddictmusic.substring;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestSearch {
        @Test
        public void bruteForceFindsCorrectIndex() {
                assertEquals(6, Search.bruteForce("Well, this is a useless text",
                                                  "this"));
        }

        @Test
        public void bruteForceReturnsNegative1IfNotFound() {
                String  pattern = "this";
                String  text = "I think there is no match here, not from that pattern";

                assertEquals(-1, Search.bruteForce(text, pattern));
        }

        @Test
        public void bruteForceCanMatchStringsWithSpacesInBetween() {
                String  pattern = "boyer moore";
                String  text = "and brute force is slower than boyer moore algo";

                assertEquals(31, Search.bruteForce(text, pattern));
        }

        @Test
        public void bruteForceIgnoresLetterCasingWhenLastBooleanParameterSet() {
                String  pattern = "Boyer mooRe";
                String  text = "And brute force is slower than Boyer Moore algo";

                assertNotEquals(-1, Search.bruteForce(text, pattern, true));
                assertEquals(31, Search.bruteForce(text, pattern, true));
        }

        @Test
        public void boyerFindsCorrectIndex() {
                String  pattern = "this";
                String  text = "Well, this is a useless text";

                assertEquals(6, Search.boyer(text, pattern));
        }

        @Test
        public void boyerReturnsNegative1IfPatternIsNotMatched() {
                String  pattern = "this";
                String  text = "I think there is no match here from that pattern";

                assertEquals(-1, Search.boyer(text, pattern));
        }

        @Test
        public void boyerCanMatchStringsWithSpacesInBetween() {
                String  pattern = "brute force";
                String  text = "and boyer moore is faster than brute force search";

                assertEquals(31, Search.boyer(text, pattern));
        }

        @Test
        public void boyerIgnoresLetterCasingWhenLastBooleanParameterIsTrue() {
                String  pattern = "bRuTe forCE";
                String  text = "And boyer moore is faster than BrUte Force";

                assertNotEquals(-1, Search.boyer(text, pattern, true));
                assertEquals(31, Search.boyer(text, pattern, true));
        }
}

