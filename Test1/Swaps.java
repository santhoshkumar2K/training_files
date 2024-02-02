/*Write a program that takes two numbers as input and swaps them without using a temporary variable.*/
import java.util.Scanner;
public class Swaps
{
 public static void main(String []arg)
 {
  Scanner scan= new Scanner(System.in);
     System.out.println("Enter a First number: ");
  int number1=scan.nextInt();
     System.out.println("Enter a Second number: ");
  int number2=scan.nextInt(); 
   number1=number1+number2;
   number1=number1-number2;
   number2=number1-number2;
      
     System.out.println(number1+" "+number2);
 }
}

