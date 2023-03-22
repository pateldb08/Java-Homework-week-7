package javaprogrammes;
 //19. Write a Java program to calculate the average value of array elements.

public class Programme19 {

  public static void main(String[] args) {

   int a[]={10,20,30,40,50};  // array declaration
   int sum =0; //assigning local variable
   double avg;
   for(int i=0; i<a.length; i++){  //finding total of array
    sum=sum+a[i];
   }
   avg = sum / a.length;  // Calculating average value
   System.out.println("Average Value of Array : " + avg );
  }
 }


