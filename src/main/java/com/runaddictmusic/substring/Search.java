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

        static int bruteForce(String pattern, String text) {
                int     match = -1;
                boolean found = false;
                char    current;

                if(pattern == null || pattern.isEmpty()
                                || pattern.length() > text.length()) return -1;

                for(int i = 0; i < text.length() - pattern.length(); i++) {
                        current = text.charAt(i);

                        logger.debug("Checking '{}' at position '{}'",
                                     current, i);

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

        static int bruteForce(String pattern, String text, boolean ignoreCase) {
                if(pattern == null || text == null || pattern.isEmpty()
                                   || text.isEmpty()
                                   || pattern.length() > text.length()) return -1;

                return bruteForce(pattern.toLowerCase(), text.toLowerCase());
        }
}
