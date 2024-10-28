package com.mycompany.identicalarrays;

import java.util.Scanner;

public class IdenticalArrays {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first array
        System.out.println("Enter the first 3 by 3 array: ");
        
        // Declaring and Initalizing a new 2D 3 x 3 array
        int[][] m1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = input.nextInt();
            }
        }

        // Prompt the user to enter the second array
        System.out.println("Enter the second 3 by 3 array: ");
        int[][] m2 = new int[3][3];
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

    /**
     * Returns true if the two-dimensional arrays m1 and m2 are identical.
     *
     * @param m1 The first two-dimensional array.
     * @param m2 The second two-dimensional array.
     * @return true if m1 and m2 are identical, false otherwise.
     */
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