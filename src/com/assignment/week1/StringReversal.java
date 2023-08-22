package com.assignment.week1;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
    	  Scanner s= new Scanner(System.in);
          System.out.println("enter userinput");
           String input=s.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string using inbuilt method: " + reversed);
    }
}

