package com.methods;

public class SpeedConverter {

    //1 mile per hour = 1.609 kilometres per hour

    public static long toMilesPerHour(double kilometresPerHour) {
        return (kilometresPerHour < 0) ? -1 : Math.round(kilometresPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

}
