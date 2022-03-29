package com.methods;
//Write a method printYearsAndDays with parameter of type long named minutes.
//The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
//If the parameter is less than 0, print text "Invalid Value".
//Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
//XX represents the original value minutes.
//YY represents the calculated years.
//ZZ represents the calculated days.
public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
//  1 hour = 60 minutes
//  1 day = 24 hours
//  1 year = 365 days
    public static void printYearsAndDays(long minutes) {

        int hour = (int) (minutes / 60);
        int day = hour / 24;
        int year = day / 365;
        int remainingDay = day % 365;

        if (minutes > 0) {
            System.out.println(minutes + " min = " + year + " y and " + remainingDay + " d");
        } else {
            System.out.println("Invalid Value");
        }
    }

}
















