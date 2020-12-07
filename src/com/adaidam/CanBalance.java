package com.adaidam;

public class CanBalance {

    public static boolean canBalance(int[] nums) {
        int rightSum = 0;
        for (int i=0; i<nums.length; i++) {
            rightSum += nums[i];
        }
        int leftSum = 0;
        for (int i=0; i<nums.length; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];
            if (leftSum == rightSum) return true;
        }
        return false;
    }

    public static boolean canBalance1(int[] nums) {

        //split array at each location in the array
        for(int i = 1; i < nums.length; i++){

            //add up sums on the left and right sides of the split
            int sumLeft = 0;
            int sumRight = 0;

            for(int n = 0; n < i; n++){
                sumLeft += nums[n];
            }

            for(int m = i; m < nums.length; m++){
                sumRight += nums[m];
            }

            if(sumLeft == sumRight)
                return true;

        }

        return false;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,1};
        int[] nums1 = {2,1,1,2,1};
        int[] nums2 = {10,10};



        System.out.println(canBalance(nums));
        System.out.println(canBalance(nums1));
        System.out.println(canBalance(nums2));
    }

}
