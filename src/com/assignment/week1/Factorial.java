package com.assignment.week1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        try {
            int number = scanner.nextInt();
            if (number < 0) {
                throw new IllegalArgumentException("Input must be a positive integer.");
            }

            int factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
