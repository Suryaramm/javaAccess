package com.assignment.week1;

import java.util.Scanner;

public class OddNumberChecker {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a  integer: ");
        try {
        	int number = scanner.nextInt();
            checkIfEven(number);
           
        } catch (OddNumberException ex) {
        	ex.printStackTrace();
        }
    }

    public static void checkIfEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException(number + " is an odd number.");
        }
        else {
        	System.out.println(number + " is an even number.");
        }
    }
}

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

