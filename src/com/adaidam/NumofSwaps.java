package com.adaidam;

public class NumofSwaps {

    static int minimumSwaps(int[] arr){
        //initialize num of swaps
        int swap =0;
        







        //create for loop to run through array
        for (int i = 0; i < arr.length; i++) {

            //if statement to see if value at i != i+1
            if(arr[i] != i+1){

                //create var j to hold index i
                int j = i;

                //while j != i+1 we will increase j
                while(arr[j] != i+1){
                    j++;
                }

                //create temporary variable to hold j
                int temp = arr[j];

                //set j equal to i
                arr[j] = arr[i];

                //increase number of swaps
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
