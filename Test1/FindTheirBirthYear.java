
/*Develop a program that prompts the user to enter their age and calculates their birth year using the current year.*/
import java.util.Scanner;
public class FindTheirBirthYear
{
 public static void main(String []arg)
 {
  Scanner scan= new Scanner(System.in);
     System.out.println("Enter your age: ");
  int age=scan.nextInt();
     System.out.println("Your Birth Year is: "+(2023-age));
 }
}



