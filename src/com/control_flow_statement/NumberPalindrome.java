package com.control_flow_statement;
//Write a method called isPalindrome with one int parameter called number.
//The method needs to return a boolean.
//It should return true if the number is a palindrome number otherwise it should return false.
public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int num) {

        if (num < 0) {
            num *= -1;
        }
        int num1 = num;
        int reverse = 0;
        int lastDigit;

        while (num1 > 0) {   //152
            lastDigit = num1 % 10;  //last = 2 , 5 , 1
            reverse *= 10;   //   reverse = 0 , 20 , 250
            reverse += lastDigit;   // reverse=  2  , 25  , 251
            num1 /= 10; //num = 15  , 1 , 0
        }

        return num == reverse;

    }

}


















