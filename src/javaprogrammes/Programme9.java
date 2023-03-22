package javaprogrammes;
// 9. Same as above program-8 using switch statement.
import java.util.Scanner;
public class Programme9 {

    public static void main(String[] args) {
        String s[] = {"Ahmedabad", "Bombay", "Chennai", "Delhi", "Etah", "Firozpur"};
        Scanner t = new Scanner(System.in);
        //String n;
        System.out.println("Enter Alphabet to show city name :");
        String n = t.nextLine();

        switch (n) {

            case "a":
                System.out.println("City name is :" + s[0]);
                break;
            case "b":
                System.out.println("City name is :" + s[1]);
                break;
            case "c":
                System.out.println("City name is :" + s[2]);
                break;
            case "d":
                System.out.println("City name is :" + s[3]);
                break;
            case "e":
                System.out.println("City name is :" + s[4]);
                break;
            case "f":
                System.out.println("City name is :" + s[5]);
                break;
            default:
                System.out.println("Invalid city name:");
                break;
        }

        t.close();

    }
}


