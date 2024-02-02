/*Build a program that calculates the area of a circle, given the radius entered by the user.*/
import java.util.Scanner;
public class Circle
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

