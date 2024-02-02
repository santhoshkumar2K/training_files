import java.util.Scanner;
public class PositiveOrNegative
{
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a number: ");
   int number=scan.nextInt(); 
      System.out.println((number==0)?"The number is zero":(number>0)?"The number is positive":"The number is negative");
 }
}
