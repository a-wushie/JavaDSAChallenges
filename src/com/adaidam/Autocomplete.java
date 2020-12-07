package com.adaidam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write an autocomplete class that returns all dictionary words with a given prefix
 */

public class Autocomplete {


    public static ArrayList<String> autocomplete1(){

        String[] dictionary = {"apple", "awushie","banana", "cherry"};
        ArrayList<String> temp = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        char input = scan.nextLine().charAt(0);

        for (String word: dictionary) {

           if(word.charAt(0) == input){
            temp.add(word);
           }
        }
        return temp;
    }

    public static void main(String[] args) {

        System.out.println(autocomplete1().toString());

    }
}
