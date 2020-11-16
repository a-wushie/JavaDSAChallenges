package com.adaidam;

public class FirstTwo {
    public static String firstTwoLetters(String str){
        //check string size
        //iterate through the string to get first two letters
        //use if-statement for condition of empty string or string shorter than length 2
        //return the first


        if(str.isEmpty()){
            return "String is empty";
        } else if(str.length()<2){
            return str;
        } else {
            return str.substring(0,2);
        }
    }

    public static void main(String[] args) {
        String name = "Awushie";
        String season = "Winter";
        String conjunction = "Or";
        String noWords = "";
        String article = "A";

        System.out.println(firstTwoLetters(name));
        System.out.println(firstTwoLetters(season));
        System.out.println(firstTwoLetters(conjunction));
        System.out.println(firstTwoLetters(noWords));
        System.out.println(firstTwoLetters(article));
    }
}
