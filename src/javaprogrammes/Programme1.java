package javaprogrammes;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        //int n;
        String result;
        result = (number%2==0) ? "Even Number" : "Odd Number"; // ternary operator
        System.out.println(result);

    }
}
