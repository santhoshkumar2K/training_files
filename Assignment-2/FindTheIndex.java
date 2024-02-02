import java.util.Scanner;
public class FindTheIndex
{
 private static int index(int [] arr,int target)
 {
       for(int index=0;index<arr.length;index++)
       {
          if(arr[index]==target)
          {
              return index;
          }
       }
       return -1;
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
     System.out.println(" Enter a value: ");
     System.out.println(index(array,scan.nextInt()));
 }
} 
