import java.util.Scanner;
public class Factorial
{
 private static int calculateFactorial(int n)
 {
       int factorial=1;
       for(int i=1;i<=n;i++)
       {
          factorial=factorial*i;
       }
       return factorial;
 }
 public static void main(String[]args)
 {
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter a number: ");
    System.out.println(calculateFactorial(scan.nextInt()));
 }
} 
