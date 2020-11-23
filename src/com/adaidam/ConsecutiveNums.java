package com.adaidam;

import java.util.HashSet;

public class ConsecutiveNums {

public static int longestSequence(int[] arr){
    HashSet<Integer> intSet = new HashSet<>();
    //sort array

    for (int i = 0; i < arr.length; i++) {

        if((arr[i] + 1) == arr[i] ){

            intSet.add(arr[i]);
        }

    }
    return intSet.size();
}

    public static void main(String[] args) {
        int[] numbers = {2,6,8,2,3,4,5,1};
        System.out.println(longestSequence(numbers));
    }

    // 4, 2, 1, 6, 5 -->
    // 4, 5, 6
    // 1, 2

}
