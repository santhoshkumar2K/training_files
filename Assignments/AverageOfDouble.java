import java.util.Scanner;
public class AverageOfDouble
{
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a length of array : ");
   int length=scan.nextInt();
   double array[]=new double[length];
      System.out.println("Enter the elements: ");
   double sum=0;   
    for(int index=0;index<length;index++)
    {
      array[index]=scan.nextDouble();
      sum+=array[index];
    }
      System.out.println("Average is: "+(sum/length)); 
 }
}
