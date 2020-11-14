package com.homework42;

import java.util.Random;

//4.2.5
//Create a matrix with dimensions 10x15
//initialize with random ints in range 10 - 99
//print it
//Rotate it in 270* clockwise
public class Homework425 {
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
                System.out.print(array[i][i1] + " ");
            }
            System.out.println();
        }
        //rotate
        int[][] arrayRotate = new int[15][10];

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                arrayRotate[i][j] = array[10 - 1 - j][i];
            }
        }
        System.out.println();
        //print
        for (int i = 0; i < 15; i++) {
            for (int i1 = 0; i1 < 10; i1++) {
                System.out.print(arrayRotate[i][i1] + " ");
            }
            System.out.println();
        }

    }
}
