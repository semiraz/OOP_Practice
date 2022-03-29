package com.control_flow_statement;

import java.util.Scanner;

//REad the numbers from the console entered by the user and print the minimum and maximum number the user has entered
//Before the user enters the number, print the message "Enter Number: "
//If the user enter invalid number, break out of the loop and print the minimum and maximum number.
public class MinimumAndMaximum {

    public static void main(String[] args) {
        minAndMax();
    }

    public static void minAndMax() {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {

            System.out.println("Enter Number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                if (number < min) {
                   min = number;
                } else if (number > max) {
                    max = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Max = " + max + " Min = " + min);

        scanner.close();

    }

}
