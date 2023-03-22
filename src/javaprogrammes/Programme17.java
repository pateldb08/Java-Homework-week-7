package javaprogrammes;

import java.util.Arrays;

// 17. Write a Java program to sort a numeric array and a string array.

public class Programme17 {
    public static void main(String[] args) {
        int num[]={10,20,50,40,60};  //Numeric array declaration
        String s[]={"Apple","Yankee","Zoo","Mango","Tree"};// String array declaration

        // logic to sort Arrays and print them
        System.out.println("Print String array to sort:"+ Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("Print Number array to sort:"+Arrays.toString(num));
        Arrays.sort(num);

        System.out.println("Sorted String :"+Arrays.toString(s));
        System.out.println("Sorted Numbers:"+Arrays.toString(num));
    }
}






