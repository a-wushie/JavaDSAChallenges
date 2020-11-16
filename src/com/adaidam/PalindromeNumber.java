package com.adaidam;

/**Determine whether an integer is a palindrome i.e.
 * reads the same forwards as it does backwards.
 * Bonus: do it without converting to string
 */
public class PalindromeNumber {
    static int x;
    static String numString = Integer.toString(x);
    static char forwards;
    static char backwards;

    public static char readForwards(String numString) {
        for (int i = 0; i < numString.length(); i++) {
            forwards = numString.charAt(i);
        }
        return forwards;
    }

    public static char readBackwards(String numString) {
        for (int j = numString.length() - 1; j >= 0; j--) {
            backwards = numString.charAt(j);
        }
        return backwards;
    }

    public static boolean isPalindrome(int x) {

        if (forwards == backwards) {
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        int a = 2343;
        int b = 2332;
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
    }

}

