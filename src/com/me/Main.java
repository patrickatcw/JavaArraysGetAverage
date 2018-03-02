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
