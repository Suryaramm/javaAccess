package com.assignment.week1;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       System.out.println("enter userinput");
        String inputString=s.nextLine();
        String reversedString = reverseString(inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
           
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        return new String(charArray);
    }
}

