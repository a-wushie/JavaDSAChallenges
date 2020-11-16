package com.adaidam;

//Write a method that finds all the duplicates in the array

import java.lang.reflect.Array;

public class FindDuplicates {

    //create method that takes in an int array and returns an int array
    public static int[] findDuplicates(int[] numbers){

        //loop through the array from index 0
        for (int i = 0; i < numbers.length; i++) {
                //compare each index with the one directly after it
            for (int j = 0; j < numbers.length; j++) {
                //if they match remove the first index
                if (numbers[i] == numbers[j]) {
                    numbers[i] = numbers[i + 1];
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) {

        int[] ages = {23,34,34,56,7,7,8,9};
        int[] years = {1994, 1768, 2305, 1768};

        System.out.println(findDuplicates(ages));
        System.out.println(findDuplicates(years));

    }
}
