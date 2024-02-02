/*Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements. */
import java.util.*;
public class ZerosAtEnd
{
 public static void zerosAtEnd(int []array)
 {
   int tempIndex=0;
     for(int index=0; index<array.length; index++)
     {
       if(array[index]!=0)
       {
        array[tempIndex++]=array[index];
       }
     } 
     for(int next=tempIndex;next<array.length;next++)
     {
       array[next]=0;
     }
      System.out.println(Arrays.toString(array)); 
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
     int array[]=arrayDeclare(scan);
     zerosAtEnd(array);  
 }
}


