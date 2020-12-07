package com.adaidam;

import java.util.Arrays;

public class ArrMinMax {

    public static int minMaxDifference(int[] arr){
        //initialize variable to hold length
        //if statement to catch whether the array has length of at least 1
        //sort array, min will be arr[0] max will be arr[arr.length-1]
        //return max-min
        int length = arr.length;
        int result = 0;
        if(length < 1){
            return arr[0];
        } else {
            Arrays.sort(arr);
            result = arr[length-1] - arr[0];
            return result;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,3,7,6,9};
        int[] arr1 = {10,3,7,6,9};
        System.out.println(minMaxDifference(arr));
    }
}
