package src;

import java.util.Scanner;

/**
 * Author: Aaron Canchola
 * Date: 02/18/2025
 */
public class Maximum {

    public static void main(String[] args) {
        // Declare variables
        Scanner scan = new Scanner(System.in);
        int numA, numB, numC, max;
        System.out.println("This program finds the maximum of three numbers.");
        // Read the first number
        System.out.print("Enter the 1st integer: ");
        numA = scan.nextInt();
        // Read the second number
        System.out.print("Enter the 2nd integer: ");
        numB = scan.nextInt();
        // Read the third number
        System.out.print("Enter the 3rd integer: ");
        numC = scan.nextInt();
        // Find the maximum of the three numbers
        max = Math.max(numA, Math.max(numB, numC));
        System.out.println("The maximum is " + max);
    }
}
