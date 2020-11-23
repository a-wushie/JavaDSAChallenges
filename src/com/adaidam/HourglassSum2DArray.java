package com.adaidam;

import java.util.ArrayList;
import java.util.Collections;

public class HourglassSum2DArray {

        public static void main(String[] args) {
            int[][] arr = {{-9, -9, -9, 1, 1, 1},
                            {0, -9, 0, 4, 3, 2},
                            {-9, -9, -9, 1, 2, 3},
                            {0, 0, 8, 6, 6, 0},
                            {0, 0, 0, -2, 0, 0},
                            {0, 0, 1, 2, 4, 0}};
            System.out.println(hourglassSum(arr));
        }

        public static int hourglassSum(int[][] arr) {
            // create new empty ArrayList
            ArrayList<Integer> sums = new ArrayList<>();
            // create nested for loop
            // first for loop loops through the number of arrays
            for (int i = 0; i <= 3; i++) {
                // second for loop loops through the ints in each array
                for (int j = 0; j <= 3; j++) {
                    // hourglassSum is equal to first three indices of first array plus index 1 of second
                    // array plus first three indices of third array
                    int hourglassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] +
                            arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    // add each hourglassSum to arraylist
                    sums.add(hourglassSum);
                    // could combine the previous two steps by putting sums.add(arr[i][j] + ....);
                    // separated here so its easier to understand/follow
                }
            }
            // sort arraylist from smallest to largest hourglassSum
            Collections.sort(sums);
            // get the largest hourglassSum from arraylist
            // since its sorted, the largest hourglassSum will be at the last index of arraylist
            return sums.get(sums.size() - 1);
        }
}
