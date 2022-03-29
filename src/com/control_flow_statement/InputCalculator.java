package com.control_flow_statement;
//Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
//When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
//XX represents the sum of all entered numbers of type int.
//YY represents the calculated average of all numbers of type long.

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAnsAverage();

    }

    public static void inputThenPrintSumAnsAverage() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");

        int sum = 0;
        long avg = 0;
        int count = 0;
        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
                avg = sum / count;
                avg = Math.round(avg);
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();


    }
}
