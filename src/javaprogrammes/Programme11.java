package javaprogrammes;
/*
  11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
      and 5 separately.
 */
public class Programme11 {

    public static void main(String[] args) {
        System.out.println("Divide by 3:");
        for (int i = 1; i <= 100; i++) {  // using for loop method
            if (i % 3 == 0) {
                System.out.println(i + ",");
            }
        }
        System.out.println("Divide by 5:");
        for (int j = 1; j <= 100; j++) {  // for loop method
            if (j % 5 == 0) {
                System.out.println(j + ",");
            }

        }
    }
}


