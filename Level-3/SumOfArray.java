import java.util.Scanner;
public class SumOfArray
{
 public static void main(String []arg)
 {   
      Scanner scan=new Scanner(System.in);
    System.out.println("Enter a Length of Array: ");
      int length=scan.nextInt();
      int arr[]=new int[length];
    System.out.println("Enter the Elements of Array: ");
    
       int sum=0;
      for(int index=0;index<length;index++)
      {
      arr[index]=scan.nextInt();
      sum+=arr[index];
      }
      System.out.println("Sum of Array is: "+sum);
      
 }
}
