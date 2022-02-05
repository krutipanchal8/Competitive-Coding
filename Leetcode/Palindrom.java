package com.Competitive.Leetcode;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int x){
        // Here we just need to check till the middle of digit so we can save time as well as space
        // as it will reduce the time complexity by d/2
        if (x<0)    return false;
        if (x<=9 && x>=0)    return true;
        int rev = 0;
        while (x>rev){
            rev = (rev*10) + x%10;
            x = x/10;
        }
        return rev==x || (x == rev/10);
    }

}
