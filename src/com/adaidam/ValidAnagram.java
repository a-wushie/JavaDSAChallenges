package com.adaidam;

import java.util.Arrays;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Input: s = "rat", t = "car"
 * Output: false
 */

public class ValidAnagram {

    public boolean validAnagram(String s, String t) {
        //check that both strings are of equal length and have same elements.

        //create if statement for condition 1
        //convert string to char array for comparison
        //create if statement for condition 2
        if (s.length() != t.length()){
            return false;
        }

        char[] sTemp = s.toCharArray();
        char[] tTemp = t.toCharArray();

        Arrays.sort(sTemp);
        Arrays.sort(tTemp);

        for (int i = 0; i < s.length(); i++) {
            if(sTemp != tTemp){
                return false;
            }
        }
        return true;
    }

}
