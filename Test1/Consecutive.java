/*Write a Java program to find the length of the longest consecutive elements sequence from a given unsorted array of integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5] 
The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.  */
import java.util.*;
public class Consecutive
{
 public static void sort(int array[])
 { int temp=0;
  for(int index=0; index<array.length;index++)
  {
      for(int swap=index+1; swap<array.length; swap++)
      {
        if(array[index]>array[swap])
        {
            temp=array[index];
            array[index]=array[swap];
            array[swap]=temp;
        }
      }
  }
 }
 public static void consecutive(int []array)
 {
   sort(array);
    int count=1, longest=0;
   for(int index=0;index<array.length-1;index++)
   {                                      
      if((array[index]+1)==array[index+1])
      {
        count++;
      }else
      { 
       count=1;
      }
      longest=(count>longest)?count:longest;
   }
   System.out.println(longest);
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
     consecutive(array);    
 }
}


