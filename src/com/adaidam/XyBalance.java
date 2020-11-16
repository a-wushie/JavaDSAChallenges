package com.adaidam;

/**
 * We'll say that a String is xy-balanced if for all the 'x' chars in the string,
 * there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
 * but "xyx" is not. One 'y' can balance multiple 'x's.
 * Return true if the given string is xy-balanced.
 *
 * xyBalance("aaxbby") → true
 * xyBalance("aaxbb") → false
 * xyBalance("yaaxbb") → false
 */
public class XyBalance {

    public static boolean xyBalance(String str) {

        if(str.lastIndexOf("y")<str.lastIndexOf("x")){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
    }
}
