import java.util.*;
public class FindTheSmallAndLargestElement
{
 public static void findTheElement(int []array)
  {
    int max=0, min=Integer.MAX_VALUE;
    for(int index=0;index<array.length;index++)
    {
       if(array[index]>max)
       {
         max=array[index];
       }
       if(array[index]<min)
       {
         min=array[index]; 
       }
    }
    
    System.out.println("Maximum value is: "+max+" Minimum value is: "+min);
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
     findTheElement(array);  
 }
}
