/*Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
Sample array: [1,2,4,5,6] 
Target value: 6. */
import java.util.*;
public class TargetValue
{
 public static void find(int []array, int target)
  {
    int temp=0;
    for(int index=0;index<array.length;index++)
    {
        for(int next=index+1;next<array.length;next++)
        {
           if(target==(array[index]+array[next]))
           {
            System.out.print(array[index]+" + "+array[next]+" = "+ (array[index]+array[next]));
           } 
        }      
    }
 }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
            System.out.println("Enter a length of array : "); 
     int length=scan.nextInt();
     int array[]=new int[length];
       for(int index=0; index<length; index++)
       {
           System.out.println("Enter the element : "); 
         array[index]=scan.nextInt();  
       }
          System.out.println("Enter a target value: ");
     int target=scan.nextInt();
      find(array, target);       
      
 }
}
