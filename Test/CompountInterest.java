/*Develop a program that calculates the compound interest for a given principal amount, interest rate, and time period.*/
import java.util.Scanner;
public class CompountInterest
{
 public static void main(String []arg)
 {
  Scanner scan= new Scanner(System.in);
     System.out.println("Enter a Principal Amount: ");
  int  principal=scan.nextInt();
     System.out.println("Enter a Interest rate: ");
  int  rate=scan.nextInt();
     System.out.println("Enter a Time: ");
  int  time=scan.nextInt();
  double CI = principal *
                    (Math.pow((1 + rate / 100), time));
     System.out.println("Compount Interest is: "+ CI);
     
 }
}

