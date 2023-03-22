package javaprogrammes;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 *  salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
import java.util.Scanner;

public class Programme5 {

    /*HRA = basic salary 10%
    DA = Basic salary 8%
    TA = Basic salary 9%
    PF= Basic salary 20%
    Gross salary = basic salary + HRA + TA + DA –PF*/
    public static class SalarySlip {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter empID :");
            int empID = s.nextInt();
            System.out.print("Enter Employee Name:");
            String empName = s.next();
            System.out.println("Enter Employee Salary :");
            int salary = s.nextInt();
            int HRA = salary * 10 / 100;
            int DA = salary * 9 / 100;
            int TA = salary * 8 / 100;
            int PF = salary * 20 / 100;
            int Gr = salary + HRA + TA + DA - PF;
            System.out.println("_______________________________");
            System.out.println("|         Salary Slip          |");
            System.out.println("|______________________________|");
            System.out.println("| Employee Id :   " + empID + "        |");
            System.out.println("| Employee Name : " + empName + "      |");
            System.out.println("|______________________________|");
            System.out.println("| Basic Salary : " + salary + "        |");
            System.out.println("| HRA 10% :      " + HRA + "           |");
            System.out.println("| TA 8% :        " + TA + "            |");
            System.out.println("| DA 9% :        " + DA + "            |");
            System.out.println("| PF 20%:        " + PF + "            |");
            System.out.println("|______________________________|");
            System.out.println("| Gross Salary :  " + Gr + "           |");
            System.out.println("|===========================|");
            s.close();
        }
    }


}
