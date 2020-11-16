package com.adaidam;

public class NumofSwaps {

    static int minimumSwaps(int[] arr){
        //initialize num of swaps
        int swap =0;
        
        //create for loop to run through array
        //if statement to see if value at i != i+1
        //create var j to hold index i
        //while j != i+1 we will increase j
        //create temporary variable to hold j
        //set j equal to i
        //increase number of swaps
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                int j = i;
                while(arr[j] != i+1){
                    j++;
                }
                int temp = arr[j];
                arr[j] = arr[i];
                swap++;
            }
        }
        return swap;
    }

    public static void main(String[] args) {
        //create int array
        int[] array ={4,3,1,2};
        
        //call minimumSwaps method
        System.out.println(minimumSwaps(array));
    }
}
