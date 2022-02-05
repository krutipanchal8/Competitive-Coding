package com.Competitive.Leetcode;

public class PlusOne {
    public static void main(String[] args) {
        int digits[] = {9,9,9,9};
        int[] arr = plusOne(digits);
        for (int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        int p = digits.length-1;
        for (int i=p;i>=0;i--){
            if (digits[i]<9){
                digits[i]+=1;
                break;
            }
            digits[i]=0;
        }
        if (digits[0]==0){
            digits = new int[p+2];
            digits[0] =1;
        }
        return digits;
    }
}
