package org.example;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {

        //create scanner
        Scanner scanner = new Scanner(System.in);

        //user to enter number
        System.out.println("Name a number between 0 and 100: ");
        int score = scanner.nextInt();

        //conditional statements
        if (score >= 90) {
            System.out.println("Your grade is an A");
        } else if (score >= 80) {
            System.out.println("Your grade is a B");
        } else if (score >= 70) {
            System.out.println("Your grade is a C");
        } else if (score >= 60) {
            System.out.println("Your grade is a D");
        } else {
            System.out.println("Your grade is a F");
            }
        }

    }

