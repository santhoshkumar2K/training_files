/*Write a program that takes an array of integers and returns the sum of all even numbers in the array.*/
import java.util.Scanner;
public class SumOfEvens
{
 public static void sum(int array[])
 {
    int sum=0;
   for(int index=0;index<array.length;index++)
   {
     if(array[index]%2==0)
     {
      sum+=array[index]; 
     }
   }
   System.out.println("Sum of All even numbers in your array is: "+sum);  
 }
 public static void main(String []arg)
 {
  Scanner scan= new Scanner(System.in);
     System.out.println("Enter a length of array: ");
  int length=scan.nextInt(); 
  int array[]=new int[length];
     for(int index=0;index<length;index++)
     {
      System.out.println("Enter : ");
      array[index]=scan.nextInt(); 
     }
       sum(array);
 }
}

