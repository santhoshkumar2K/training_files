import java.util.Scanner;
public class SumOfElements
{
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a length of array : ");
   int length=scan.nextInt();
   int array[]=new int[length];
      System.out.println("Enter the elements: ");
   int sum=0;   
    for(int index=0;index<length;index++)
    {
      sum+=scan.nextInt(); 
    }
    System.out.println(sum);
 }
}
