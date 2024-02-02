
/*Build a simple calculator program that allows the user to enter two numbers and perform basic arithmetic operations (addition, subtraction, multiplication, and division).*/
import java.util.Scanner;
public class SimpleCalculator
{
 public static void main(String []arg)
 {
  Scanner scan= new Scanner(System.in);
     System.out.println("Enter a First number: ");
  int number1=scan.nextInt();
     System.out.println("Enter a Second number: ");
  int number2=scan.nextInt();     
     System.out.println("Addition of your numbers: "+(number1+number2));
     System.out.println("Subtraction of your numbers: "+(((number1>number2)?number1:number2)-((number1<number2)?number1:number2)));
     System.out.println("Multiplication of your numbers: "+(number1*number2));
     System.out.println("Division of your numbers: "+(((number1>number2)?number1:number2)/((number1<number2)?number1:number2))); 
 }
}


