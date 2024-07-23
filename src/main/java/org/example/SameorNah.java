package org.example;

import java.util.Scanner;

public class SameorNah {
    public static void main(String[] args) {

        //create scanner
        Scanner scanner = new Scanner(System.in);

        //prompt user to enter first word
        System.out.println("Enter a word:");
        String word1 = scanner.nextLine();

        //prompt user to enter second word
        System.out.println("Enter another word:");
        String word2 = scanner.nextLine();

        //conditional statement
        if (word1.equals(word2)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }












    }
}
