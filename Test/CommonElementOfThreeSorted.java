/*Write a Java program to find common elements from three sorted (in non-decreasing order) arrays. */
import java.util.Scanner;
public class CommonElementOfThreeSorted
{
 public static void commonElements(int []array1, int [] array2,int [] array3)
 {
   int max[]= (array1.length>array2.length)? array1: array2;
   int min[]= (array1.length<array2.length)? array1:array2;
     for(int index=0; index<max.length; index++)
     {
       for(int next=0; next<min.length; next++)
       {
        if(max[index]==min[next])
        {
          for(int index3=0;index3<array3.length;index3++)
          {
            if(min[next]==array3[index3])
            {
             System.out.println("Common element is: "+min[next]);
             break;
            } 
          }
        }
       }
     } 
 }
 public static int[] arrayDeclare(Scanner scan)
 {
         System.out.println("Enter a length of array : "); 
     int length=scan.nextInt();
     int array[]=new int[length];
     for(int index=0; index<length; index++)
     {
        System.out.println("Enter the element : "); 
      array[index]=scan.nextInt();  
     } 
     return array;
  }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
     int array1[]=arrayDeclare(scan);
       System.out.println("Please declare second array: ");  
     int array2[]=arrayDeclare(scan);
       System.out.println("Please declare third array: ");  
     int array3[]=arrayDeclare(scan);
     commonElements(array1, array2, array3);  
 }
}


