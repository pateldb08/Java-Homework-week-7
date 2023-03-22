package javaprogrammes;
//6. Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Programme6 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please insert a number:");
    int a = scanner.nextInt();
    scanner.close();
    //if else condition
    if (a % 2 == 0) {
        System.out.println(a + " is an even number.");
    } else {
        System.out.println(a + " is an odd number.");
    }
}
}
