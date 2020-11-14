package com.homework42;

import java.util.Random;
import java.util.Scanner;

//4.2.2
//Create a matrix with dimensions 10x15
//initialize with random ints in range 10 - 99
//print it
//Get the row number from the console - row number
//Print the sum of the elements in row row number of that matrix
public class Homework422 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

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
        //ask console
        int row = 0;
        System.out.print("Enter the row number that you want add it up: ");
        row = scanner.nextInt();

        //sum
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += array[row][i];
        }

        //print sum

        System.out.println("The sum of " + row + " is "+ sum);
    }
}
