package com.adaidam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//When given a string called str, create a method that returns the reversed version of that String.
public class ReverseString {

    public static String reverseStr(String str){
        StringBuilder tempString = new StringBuilder(str);
        StringBuilder reversedString = tempString.reverse();
        return reversedString.toString();
    }

    public static String reverseStrNoBuilder(String str){
        String strInReverse = "";
        //iterate backwards through string
        for (int i = str.length()-1; i > 0; i--) {

            //initialize char arrayList to hold each char of String str in reverse
            List<Character> tempArr = new ArrayList<>();
            tempArr.add(str.charAt(i));

            //decrement i
            i--;

            //create new variable to hold reversed string
            // convert array to string
            strInReverse = Arrays.toString(tempArr.toArray());
        }
        return strInReverse;
    }

    public static void main(String[] args) {
        String holiday = "Hannuka";
        String weather = "Cloudy";

        System.out.println(reverseStr(holiday));
        System.out.println(reverseStr(weather));
        System.out.println(reverseStrNoBuilder(holiday));
        System.out.println(reverseStrNoBuilder(weather));
    }
}
