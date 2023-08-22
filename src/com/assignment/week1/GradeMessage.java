package com.assignment.week1;

import java.util.Scanner;

//public class GradeMessage {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your grade (A, B, C, D, or F): ");
//        String grade = scanner.next().toUpperCase();
//
//        if (grade.length() == 1) {
//            char letterGrade = grade.charAt(0);
//            switch (letterGrade) {
//                case 'A':
//                    System.out.println("Excellent job!");
//                    break;
//                case 'B':
//                    System.out.println("Good job!");
//                    break;
//                case 'C':
//                    System.out.println("Average job.");
//                    break;
//                case 'D':
//                    System.out.println("Needs improvement.");
//                    break;
//                case 'F':
//                    System.out.println("Failed.");
//                    break;
//                default:
//                    System.out.println("Invalid grade.");
//                    break;
//            }
//        } else {
//            System.out.println("Invalid grade.");
//        }
//
//        scanner.close();
//    }
//}
import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (A, B, C, D, or F): ");
        String grade = scanner.next().toUpperCase();

        if (grade.length() == 1) {
            char letterGrade = grade.charAt(0);

            if (letterGrade == 'A') {
                System.out.println("Excellent job!");
            } else if (letterGrade == 'B') {
                System.out.println("Good job!");
            } else if (letterGrade == 'C') {
                System.out.println("Average job.");
            } else if (letterGrade == 'D') {
                System.out.println("Needs improvement.");
            } else if (letterGrade == 'F') {
                System.out.println("Failed.");
            } else {
                System.out.println("Invalid grade.");
            }
        } else {
            System.out.println("Invalid grade.");
        }

        scanner.close();
    }
}

