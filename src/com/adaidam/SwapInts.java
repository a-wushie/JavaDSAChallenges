package com.adaidam;

/**
 * Given two integers,
 * write a function that swaps them without using any temporary variables.
 */
public class SwapInts {


    public static void swap1 (int x, int y) {
        //  5   7
        x = x + y;//12
        //  12  7
        y = x - y;//5
        // 12   5
        x = x - y;//7
    }

    public static void swap(int x, int y) {

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
    }

    public static void main(String[] args) {
        swap(3,2);
    }

}
