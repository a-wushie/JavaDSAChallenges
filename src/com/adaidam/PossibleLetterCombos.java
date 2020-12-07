//package com.adaidam;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Given a string containing digits from 2-9 inclusive,
// * return all possible letter combinations that the number could represent.
// * A mapping of digit to letters (just like on the telephone buttons)
// * is given below. Note that 1 does not map to any letters.
// */
//
//public class PossibleLetterCombos {
//
//    //map each digit to the letters it could represent possibly using char array
//    //create method to take two ints and return the combined arrays as a string
//
//    //check what ints are provided to select which two array to mer
//
//   static Map<Integer, String> digitsAndLetters = new HashMap<>(){{
//        put(2,"abc");
//        put(3,"def");
//        put(4,"ghi");
//        put(5,"jkl");
//        put(6,"mno");
//        put(7,"pqrs");
//        put(8,"tuv");
//        put(9,"wxyz");
//    }};
//
//    static String[] possibleCombos = new String[9];
//
//    public static String[] getPossibleCombos(int a, int b){
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getPossibleCombos(2,3)));
//    }
//}
