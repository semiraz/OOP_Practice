package com.methods;
//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places.Otherwise, return false.
public class DecimalComparator {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        return (int) (num1 * 1000) == (int) (num2 * 1000);
    }

}
