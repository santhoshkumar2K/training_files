/*Write a Java program to sum values of an array. */
import java.util.Scanner;
public class SumOfValue
{

 public static int sumOfValue(Scanner scan)
 {
     int sum=0;
         System.out.println("Enter a length of array : "); 
     int length=scan.nextInt();
     int array[]=new int[length];
      for(int index=0; index<length; index++)
      {
        System.out.println("Enter the element : "); 
        array[index]=scan.nextInt();  
        sum+=array[index];
      } 
     return sum;
  }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
    System.out.println(sumOfValue(scan));
 }
}
