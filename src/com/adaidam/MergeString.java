package com.adaidam;

/**
 * Given 2 sorted arrays, A and B, where A is long enough to hold the contents of A and B,
 * write a function to copy the contents of B into A without using any buffer or additional memory.
 */
public class MergeString {

    public static int[] mergeArrays(int[] a,int[] b){


        //return the updated int[] a
        //use for loop to iterate over int[] b
        for (int i = 0; i < b.length - 1; i++) {

            //add each int to the end of int[] a within the loop
            int end = a.length-1;
            a[end] = b[i];
            end++;
        }

        //return the updated int[] a
        return a;
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,7,0,0,0,0};
        int[] b = {4,5,3,1};
        System.out.println((mergeArrays(a,b)).toString());
    }
}
