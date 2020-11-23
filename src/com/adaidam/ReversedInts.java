package com.adaidam;

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
        int[] reversed = {nums[2],nums[1],nums[0]};

        //return the new array
        return reversed;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,6};
        System.out.println(reverse3(nums));
    }
}
