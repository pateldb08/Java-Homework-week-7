package javaprogrammes;

import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 *    not?
 */
public class Programme2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a year: ");
        int year = scanner.nextInt();
        if (((year % 4 == 0)&& (year % 100 != 0)) ||(year%400==0)) { // if else condition applied
            System.out.println(year + "," + "  is a leap year. ");
        }else{
            System.out.println(year + "," + "  is not a leap year.");
        }
    }

}
