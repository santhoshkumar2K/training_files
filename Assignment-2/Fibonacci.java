import java.util.Scanner;
public class Fibonacci
{
  private static void fibonacci(int n)
  {
        int first=0,second=1, third=0;
       for(int i=0;i<=n;i++)
       {
          System.out.print(third+" ");
          third=first+second;
          second=first;
          first=third;
       }
  }
 public static void main(String[]args)
 {
    Scanner scan= new Scanner(System.in);
    	System.out.println("Enter a number: ");
          int number=scan.nextInt();
          fibonacci(number);
        System.out.println();   
 }
} 
