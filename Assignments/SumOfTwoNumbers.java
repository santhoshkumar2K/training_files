import java.util.Scanner;
public class SumOfTwoNumbers
{
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter first value: ");
   int number1=scan.nextInt();
      System.out.println("Enter second value: ");
   int number2=scan.nextInt();
      System.out.println("Result: "+(number1+number2));
 }
}
