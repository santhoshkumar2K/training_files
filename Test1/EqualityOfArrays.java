/*Write a Java program to test the equality of two arrays. */import java.util.Scanner;
public class EqualityOfArrays
{
 public static void equality(int []array1, int [] array2)
 {
     int count=0;
   if(array1.length==array2.length)
   {  
     for(int index=0; index<array1.length; index++)
     {
        if(array1[index]==array2[index])
        {
          count++;
        }
     }
     System.out.println((count==array1.length)?"Its equal..":"Not equal!"); 
   }else
   {
     System.out.println("Not equal!");
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
     equality(array1, array2);  
 }
}
