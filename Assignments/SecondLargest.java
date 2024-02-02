import java.util.*;
public class SecondLargest
{
 public static void findTheElement(int []array)
  {
    int max=0, secondMax=0;
    for(int index=0;index<array.length;index++)
    {
       if(array[index]>max)
       {
         secondMax=max;
         max=array[index];
       }
    }
    
    System.out.println(secondMax);
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
