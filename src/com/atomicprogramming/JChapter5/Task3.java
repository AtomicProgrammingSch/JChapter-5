package com.atomicprogramming.JChapter5;

import java.util.Scanner;

public class Task3 {

    public static void passed(int score) {
        if (score >= 50) {

            if (score >= 80) {
                System.out.println("You passed, well done!");
            }
            else {
                System.out.println("You passed!");
            }
        }
        else if (score < 0) {
            System.out.println("You can not have a negative score!");
        }
        else {
            if (score <= 20) {
                System.out.println("You need to try harder!");
            }
            else {
                System.out.println("You failed");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the score as an integer:");
        if (!scanner.hasNextInt()) {
            System.out.println("You must enter the score as an integer!");
            System.exit(1);
        }
        int score = scanner.nextInt();
        passed(score);
    }
}
