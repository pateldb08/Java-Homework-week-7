package javaprogrammes;
// 12. Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Programme12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any value: ");
        char ch = scanner.next().charAt(0);
        // Using Character class combined with Nested if else to determine inserted value is Alphabet,Number or Symbol
        if (Character.isAlphabetic(ch)) {
            System.out.println(ch + " is an ALPHABET.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a NUMBER");
        } else {
            System.out.println(ch + " is a SYMBOL");
            {
                scanner.close();
            }
        }
    }
}

