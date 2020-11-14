package com.homework42;

import java.util.Random;
import java.util.Scanner;

//4.2.6
//Create a matrix with dimensions 5x5
//initialize with random ints in range 10 - 99
//print it
//Display a menu
//———————- MENU —————-
//For rotating 90*
//For rotating 180*
//For rotating 270*
//For Exit
//————————————————
//In any other case than 4 programm should NOT stop !!!
public class Homework426 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        int[][] matrixRotate = new int[5][5];

        //initialize
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = random.nextInt(90) + 10;
            }
        }
        //print
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");;
            }
            System.out.println();
        }

        System.out.println();
        //menu
        int input = 0;

            System.out.println("———————- MENU —————-");
            System.out.println("1 For rotating 90*");
            System.out.println("2 For rotating 180*");
            System.out.println("3 For rotating 270*");
            System.out.println("4 For Exit");

            input = scanner.nextInt();


        switch (input) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        matrixRotate[i][j] = matrix[j][4 - i];
                    }
                }
                //print
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(matrixRotate[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        matrixRotate[i][j] = matrix[4 - i][4 - j];
                    }
                }
                //print
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(matrixRotate[i][j] + " ");
                    }
                    System.out.println();
                }

                break;
            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        matrixRotate[i][j] = matrix[4 - j][i];
                    }
                }
                //print
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(matrixRotate[i][j] + " ");
                    }
                    System.out.println();
                }

                break;
            case 4:
                System.out.println("Have a nice day!");
                break;
        }


    }
}
