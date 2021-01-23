package com.runaddictmusic.substring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Search:  A collection of the substring search algorithms I have learnt of.
 *
 * @version 1.0 22 Jan 2021
 * @author  Benedict Dube
 */
public class Search {
        private final static Logger logger = LoggerFactory.getLogger(Search.class);

        static int bruteForce(String text, String pattern) {
                int     match = -1;
                boolean found = false;
                char    current;

                if(pattern == null || text == null || pattern.isEmpty()
                                   || text.isEmpty()
                                   || pattern.length() > text.length()) return -1;

                for(int i = 0; i < text.length() - pattern.length(); i++) {
                        current = text.charAt(i);

                        for(int j = 0; j < pattern.length(); j++) {
                                if(pattern.charAt(j) != text.charAt(i + j)) {
                                        found = false;
                                        match = -1;
                                        break;
                                }
                                found = true;
                                match = i;
                        }

                        if(found) break;
                }

                return match;
        }

        static int bruteForce(String text, String pattern, boolean ignoreCase) {
                if(pattern == null || text == null || pattern.isEmpty()
                                   || text.isEmpty()
                                   || pattern.length() > text.length()) return -1;

                return bruteForce(text.toLowerCase(), pattern.toLowerCase());
        }

        static int boyer(String text, String pattern) {
                if(pattern == null || text == null || pattern.isEmpty()
                                   || text.isEmpty()
                                   || pattern.length() > text.length()) return -1;

                return 0;
        }

        static int boyer(String text, String pattern, boolean ignoreCase) {
                if(pattern == null || text == null || pattern.isEmpty()
                                   || text.isEmpty()
                                   || pattern.length() > text.length()) return -1;

                return boyer(text.toLowerCase(), text.toLowerCase());
        }

        static int kmp(String text, String pattern) {
                if(pattern == null || text == null || pattern.isEmpty()
                                   || text.isEmpty()
                                   || pattern.length() > text.length()) return -1;

                return 0;
        }

        static int kmp(String text, String pattern, boolean ignoreCase) {
                if(pattern == null || text == null || pattern.isEmpty()
                                   || text.isEmpty()
                                   || pattern.length() > text.length()) return -1;

                return boyer(text.toLowerCase(), text.toLowerCase());
        }

        static int rabin(String text, String pattern) {
                if(pattern == null || text == null || pattern.isEmpty()
                                   || text.isEmpty()
                                   || pattern.length() > text.length()) return -1;

                return 0;
        }

        static int rabin(String text, String pattern, boolean ignoreCase) {
                if(pattern == null || text == null || pattern.isEmpty()
                                   || text.isEmpty()
                                   || pattern.length() > text.length()) return -1;

                return boyer(text.toLowerCase(), text.toLowerCase());
        }
}
