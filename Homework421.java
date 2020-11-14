package com.homework42;

import java.util.Random;

//4.2.1
//Create a matrix with dimensions 10x15
//initialize with random ints in range 10 - 99
//print it
//find and print the minimum value
public class Homework421 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[10][15];
        //initialize
        for (int i = 0; i < 10; i++) {
            for (int i1 = 0; i1 < 15; i1++) {
                array[i][i1] = random.nextInt(90) + 10;
            }
        }
        //print
        for (int i = 0; i < 10; i++) {
            for (int i1 = 0; i1 < 15; i1++) {
                System.out.print( array[i][i1] + " ");;
            }
            System.out.println();
        }
        System.out.println();

        //find min
        int min = array[0][0];
        for (int i = 0; i < 10; i++) {
            for (int i1 = 0; i1 < 15; i1++) {
                if(array[i][i1] < min) {
                    min = array[i][i1];
                }
            }
        }
        System.out.println("Min value in the array is " + min);

    }
}
