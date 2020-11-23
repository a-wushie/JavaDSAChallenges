package com.adaidam;

import java.util.HashSet;
//https://www.youtube.com/watch?v=Qr7l0aERUHI&feature=youtu.be

public class NoRepeatChar {

    /**
     * convert string to char array
     * iterate over the array and insert each char into a HashSet
     * Convert HashSet to a String
     * Return new string.length
     */

    public static int lengthOfSubstring(String s){
        //initialise empty string to hold the substring
        String longestSubstring = "";
        HashSet<Character> uniqueChars = new HashSet<>();
        //convert string to char array
        char[] sToChars = s.toCharArray();

        //iterate over the array to and add each char to a HashSet
        for (char c: sToChars) {
            uniqueChars.add(c);
        }
        //convert the HashSet to a string
        longestSubstring = uniqueChars.toString();
        return longestSubstring.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfSubstring("bbbb"));
        System.out.println(lengthOfSubstring("pwwkew"));
        System.out.println(lengthOfSubstring("abcabcbb"));
    }
}
