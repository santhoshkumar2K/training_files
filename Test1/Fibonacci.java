/*Build a program that prints the Fibonacci series up to a given number using a while loop.*/
import java.util.Scanner;
public class Fibonacci
{
 public static void main(String []arg)
 {
  Scanner scan= new Scanner(System.in);
     System.out.println("Enter a number: ");
  int number=scan.nextInt();
  int first=0,  second=1, sum=0, rotate=1;
   if(number>=0)
   {
      System.out.print(1+" "); 
      while(rotate<=number)
      {
        sum=first+second;
        first=second;
        second=sum;
       System.out.print(sum+" ");
        rotate++;
      }
   }      
 }
}


