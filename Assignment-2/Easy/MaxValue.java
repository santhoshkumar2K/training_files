import java.util.*;
public class MaxValue
{
 private static int findMax(int []array)
 {
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
     }System.out.println(Arrays.toString(array));
     return array[array.length-1];
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
     System.out.println(findMax(array));
 }
} 
