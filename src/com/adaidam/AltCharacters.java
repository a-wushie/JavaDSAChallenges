package com.adaidam;

public class AltCharacters {
    //https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings

    static int altCharacters(String s){
        //initialize number of deletions
        int deletions = 0;

        //create a for loop to increase number of deletions if two chaars are the same
        for (int i = 1; i <= s.length()-1 ; i++) {
            if(s.charAt(i-1) == s.charAt(i)){
                deletions++;
            }
        }
        return deletions;
    }

    public static void main(String[] args) {

    //create a string s
        String s = "AABBAA";
        //create int variable to hold number of deletions from string s
        int result = altCharacters(s);
        System.out.println(result);
    }
}
