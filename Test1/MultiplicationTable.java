/*Develop a program that takes an integer as input and displays the multiplication table for that number using nested loops.*/
import java.util.Scanner;
public class MultiplicationTable
{
 public static void main(String []arg)
 {
  Scanner scan= new Scanner(System.in);
     System.out.println("Enter a number: ");
  int input=scan.nextInt();
     for(int out=0; out<=input; out++)
     {
       for(int number=out; number<=out; number++)
       {
         System.out.println(number+" * "+input+" = "+(input*number));
       }
     }  
 }
}

