package javaprogrammes;
// 18. Write a Java program to sum values of an array.

public class Programme18 {

    public static void main(String[] args) {
        int a[]={20,40,60,80};  // Array declaration

        int total = 0;  //assigning local variable
        for(int i =0;i<a.length;i++){  // for loop for taking all the stored values of Array and adding them
            total=total+a[i];
        }
        System.out.println("Total of Array numbers: "+total);
    }

}


