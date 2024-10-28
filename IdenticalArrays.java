package com.mycompany.identicalarrays;

import java.util.Scanner;   // Used for Java User Input

public class IdenticalArrays {

    public static void main(String[] args) {
        
        // Creating a new scanner object for user input. 
        Scanner input = new Scanner(System.in);
        
        // Declaring and Initalizing 2 new 2D 3 x 3 arrays
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        // Prompt the user to enter the first array
        System.out.println("Enter the first 3 by 3 array: ");

        // Nested for loops to iterate and fill the first 3 x 3 array with user input
        // i is used for the first array index, j is used for the second array index. 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = input.nextInt();
            }
        }

        // Prompt the user to enter the second array
        System.out.println("Enter the second 3 by 3 array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = input.nextInt();
            }
        }

        // Check if the two arrays are identical
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical.");
        } else {
            System.out.println("The two arrays are not identical.");
        }
    }


    /* This method checks if array size and contents are same*/
    public static boolean equals(int[][] m1, int[][] m2) {
        // Check if the two arrays have the same dimensions
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }

        // Check if the two arrays have the same contents
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }

        // If all elements are equal, the arrays are identical
        return true;
    }
}