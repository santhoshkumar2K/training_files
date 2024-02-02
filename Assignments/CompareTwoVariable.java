import java.util.Scanner;
public class CompareTwoVariable
{
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter first value: ");
   int number1=scan.nextInt();
      System.out.println("Enter second value: ");
   int number2=scan.nextInt();
      System.out.println((number1==number2)?"number1 is equal to number2":(number1>number2)?"number1 is greater than number2":"number1 is less than number2");
 }
}
