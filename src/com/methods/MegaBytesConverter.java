package com.methods;

public class MegaBytesConverter {
    //1MB = 1024KB
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabytes = kiloBytes / 1024;
        int remainingKB = kiloBytes % 1024;

        if (kiloBytes < 0 ) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKB + " KB");
        }
    }

}
