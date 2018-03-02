package com.me;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //step 1
        int[] myIntegers = getIntegers(5); //need to do method for this step 2
        for(int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        //step 4 to print for method to get average
        System.out.println("The average is " + getAverage(myIntegers));

    }

    //step 2 method
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");  //\r makes for next line in printout for entering
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    //step 3 method for average
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;

    }


}

//result
/*
Enter 5 integer values.
3
6
7
8
9
Element 0, typed value was 3
Element 1, typed value was 6
Element 2, typed value was 7
Element 3, typed value was 8
Element 4, typed value was 9
The average is 6.6
 */
