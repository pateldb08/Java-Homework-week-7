package javaprogrammes;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Programme10 {
    static char symbol;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a first number: ");
        int n1 = scanner.nextInt();
        System.out.println("Please enter a second number: ");
        int n2 = scanner.nextInt();
        System.out.println("Please enter the operator  +, -, *, / :");
        symbol = scanner.next().charAt(0);

        if (symbol == '+') {
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        } else if (symbol == '-') {
            System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        } else if (symbol == '/') {
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        } else if (symbol == '*') {
            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        } else {
            System.out.println("Invalid Symbol Selected");
        }

    }
}
