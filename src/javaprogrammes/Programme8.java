package javaprogrammes;
/*
  8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
     any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        String s[] = {"Ahmedabad", "Bombay", "Chennai", "Delhi", "Etah", "Firozpur"};
        String s1;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter Alphabet to show city name :");
        s1 = t.next();
        if (s1.equals("a") || s1.equals("b") || s1.equals("c") || s1.equals("d") || s1.equals("e") || s1.equals("f")) {
        }
        if (s1.equals("a")) {
            System.out.println("City is :" + s[0]);
        } else if (s1.equals("b")) {
            System.out.println("City is :" + s[1]);
        } else if (s1.equals("c")) {
            System.out.println("City is :" + s[2]);
        } else if (s1.equals("d")) {
            System.out.println("City is :" + s[3]);
        } else if (s1.equals("e")) {
            System.out.println("City is :" + s[4]);
        } else if (s1.equals("f")) {
            System.out.println("City is :" + s[5]);

        } else {
            System.out.println("Invalid Alphabet :");
        }
        t.close();
    }
}





