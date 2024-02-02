import java.util.Scanner;
public class Average
{
  private static double calculateAverage(int []arr)
  {
       int sum=0;
       for(int index=0;index<arr.length;index++)
       {
          sum=sum+arr[index];
       }
        return sum/arr.length;
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
    System.out.println(calculateAverage(array)); 
 }
} 
