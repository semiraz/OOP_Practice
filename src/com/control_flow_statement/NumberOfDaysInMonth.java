package com.control_flow_statement;

import com.methods.LeapYear;

//Write method getDaysInMonth with two parameters month and year. Both of type int.
//If parameter month is < 1 or > 12 return -1.
//If parameter year is < 1 or > 9999 then return -1.
//This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1,-2020));

    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if (LeapYear.isLeapYear(year)) {
                    return 29;
                }
                return 28;
            default:
                return 30;
        }
    }
}
