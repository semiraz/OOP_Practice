package com.control_flow_statement;
//Write a method called printNumberInWord. The method has one parameter number which is the whole number.
// The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
// for any other number including negative numbers.
public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(5);
        printNumberInWord(99);
        printNumberInWord(8);
    }

    public static void printNumberInWord(int number) {

        String[] numbersInWord = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        switch (number) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                System.out.println(numbersInWord[number]);
                break;
            default:
                System.out.println("Other");
        }
    }

}
