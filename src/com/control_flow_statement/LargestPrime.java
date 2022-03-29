package com.control_flow_statement;
//Write a method named getLargestPrime with one parameter of type int named number.
//If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
//The method should calculate the largest prime factor of a given number and return it.

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));  //7  - 3*7 =21
        System.out.println(getLargestPrime(217)); //31  - 7*31 =217
        System.out.println(getLargestPrime(0));  //-1 doesn't have any prime numbers
        System.out.println(getLargestPrime(45));  //5  -  3*3*5 =45
        System.out.println(getLargestPrime(-1));//-1
    }

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        for (int i=2; i<number; i++) {
            if (number %i == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }

}
