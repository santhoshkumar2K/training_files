import java.util.Scanner;
public class Factorial
{
 public static int factorial(int number)
 {
   if(number==1)
   {
     return 1;
   }
  return number*factorial(number-1);
 } 
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
    System.out.println("Enter a number: ");
   int number=scan.nextInt(); 
    System.out.println(factorial(number));
 }
}
