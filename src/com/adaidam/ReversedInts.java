package com.adaidam;

import java.util.Arrays;

/**
 *Given an array of ints length 3, return a new array with the elements in reverse order,
 * so {1, 2, 3} becomes {3, 2, 1}.
 */

public class ReversedInts {

    public static int[] reverse3(int[] nums) {
//        int[] reversed = new int[3];
//        int n = 0;
//        for(int i = 2; i>= 0; i--){
//            int element = nums[i];
//            reversed[n] = element;
//            n++;
//        }
        //initialize an int array to hold reversed array.
        //return the new array
        return new int[] {nums[2],nums[1],nums[0]};
    }

    public static void main(String[] args) {
        int[] nums = {1,3,6};
        System.out.println(Arrays.toString(reverse3(nums)));
    }
}
