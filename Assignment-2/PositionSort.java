import java.util.Scanner;
import java.util.Arrays;
public class PositionSort
{
 private static void sort(int []array)
 {
       for(int i=0;i<array.length;i++)
       {
          for(int j=i;j<array.length;j=j+2)
          {
              if(j%2==0)
              {
                   if(array[i]<array[j])
                   {
                     swap(i,j,array);
                   }
              }else{
                   if(array[i]>array[j])
                   {
                     swap(i,j,array);
                   }
              }
          }
       }
 }
 private static void swap(int i,int j,int []array)
 {
         array[i]= array[i]+array[j];
         array[j]=array[i]-array[j];
         array[i]=array[i]-array[j];
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
    sort(array);
    System.out.println(Arrays.toString(array));
 }
} 
