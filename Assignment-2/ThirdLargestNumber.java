import java.util.Scanner;
import java.util.Arrays;
public class ThirdLargestNumber
{
 private static int thirdLargestElement(int []array)
 {
    if(array.length<3)
    {
      return -1;
    }
    for(int i=0;i<array.length;i++)
     {
          for(int j=i;j<array.length;j++)
          {
               if(array[i]>array[j])
               {
                   array[i]= array[i]+array[j];   
                   array[j]=array[i]-array[j];   
                   array[i]=array[i]-array[j];   
                   
               }
             
           }
     }
   
     return array[array.length-3];
  }            
 public static void main(String[]args)
 {
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter a length of array: ");
    int []array=new int[scan.nextInt()];
     for(int i=0;i<array.length;i++)
     {
        System.out.println("Enter "+i+" th element: ");
        array[i]=scan.nextInt();
     }
     System.out.println(thirdLargestElement(array));
 }
} 
