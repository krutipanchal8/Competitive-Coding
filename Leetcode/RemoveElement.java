package com.Competitive.Leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {11,2,4,43,2,24};
        System.out.println(removeElement(arr,2));
    }

    public static int removeElement(int[] nums, int val){
        if(nums.length==0) return nums.length;
        if(nums.length==1 && (nums[0]==val)) return 0;
        if(nums.length==1) return 1;

        int ptr=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val) nums[ptr++]=nums[i];
        }
        return ptr;
    }
}
