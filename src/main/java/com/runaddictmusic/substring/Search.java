package com.runaddictmusic.substring;


/**
 * Search:  A collection of the substring search algorithms I have learnt of.
 *
 * @version 1.0 22 Jan 2021
 * @author  Benedict Dube
 */
public class Search {
        static int bruteForce(String pattern, String text) {
                int     match = -1;
                boolean found = false;
                char    current;

                for(int i = 0; i < text.length() - pattern.length(); i++) {
                        current = text.charAt(i);

                        for(int j = 0; j < pattern.length(); j++) {
                                if(pattern.charAt(j) != text.charAt(i + j)) {
                                        found = false;
                                        break;
                                }
                                found = true;
                                match = i;
                        }

                        if(found) break;
                }

                return match;
        }
}
