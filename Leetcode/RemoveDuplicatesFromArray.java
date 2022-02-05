package com.Competitive.Leetcode;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        System.out.println("Array Elements");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int n = 0;
        for (int i=1;i<nums.length;i++){
            if (nums[n]!=nums[i]){
                nums[n+1]=nums[i];
                n++;
            }
        }
        return n+1;
    }
}
