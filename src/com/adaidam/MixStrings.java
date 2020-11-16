package com.adaidam;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two strings, a and b, create a bigger string made of
 * the first char of a, the first char of b, the second char of a,
 * the second char of b, and so on. Any leftover chars go at the end of the result.
 */

public class MixStrings {

    public static String mixStrings(String a, String b) {
        //create empty string to hold combined strings
        String temp = "";
        //determine with is the shorter string
        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            temp = temp + a.charAt(i) + b.charAt(i);
        }
        //idk what tis is doing?
        return temp + a.substring(min) + b.substring(min);
    }


    public static void main(String[] args) {
        System.out.println(mixStrings("abc", "xyz"));
        System.out.println(mixStrings("Hi", "There"));
        System.out.println(mixStrings("xxxx", "There"));
    }
}
