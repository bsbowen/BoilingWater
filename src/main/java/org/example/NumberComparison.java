package org.example;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {

        //create scanner
        Scanner scanner = new Scanner(System.in);

        //prompt user to enter a number
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        //prompt user to enter another number
        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        //compare the two numbers and print the appropriate message
        if (a == b) {
            System.out.println("Numbers are the same");
        } else if (a > b) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }
    }
}
