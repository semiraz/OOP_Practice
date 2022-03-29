package com.control_flow_statement;
//Write a method named getEvenDigitSum with one parameter of type int called number.
//The method should return the sum of the even digits within the number.
//If the number is negative, the method should return -1 to indicate an invalid value.

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int num) {

        if (num < 0) {
            return -1;
        }
        int sum = 0;
        while (num > 0) {
            if (num %2 == 0) {
                sum += num % 10;
            }
            num /= 10;
        }
        return sum;
    }

}
