package javaprogrammes;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 *    then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
import java.util.Scanner;
public class Programme7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Sales id :");
        int sID = s.nextInt();
        System.out.println("Enter Sellers Name:");
        String name = s.next();
        System.out.println("Enter Salary:");
        int Es = s.nextInt();
        int amount;
        if (Es >= 50000) {
            amount = Es * 35 / 100;
            System.out.println("Sales Commission:"+amount);
        } else if (Es >= 30000) {
            amount = Es * 20 / 100;
            System.out.println("Sales Commission:"+amount);
        } else if (Es >= 20000) {
            amount = Es * 10 / 100;
            System.out.println("Sales Commission:"+amount);
        } else if (Es>=10000) {
            amount=Es*5/100;
            System.out.println("Sales Commission:"+amount);
        } else if (Es<=10000)
        {amount=Es*2/100;
            System.out.println("Sales Commission:"+amount);}
        s.close();
    }
}





