package org.example;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        //create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        //prompt the user
        System.out.println("Enter a number greater than 212:");
        int number = scanner.nextInt();

        //check if number is greater than or equal to 212;
        if (number >= 212) {
            System.out.println("Water is boiling!");
        }

    }
}
