/*Build a program that takes a string as input and checks if it is a palindrome.*/
import java.util.Scanner;
public class Palindrome
{
 public static void main(String []arg)
 {
  Scanner scan= new Scanner(System.in);
     System.out.println("Enter a String: ");
  String str=scan.nextLine(); 
  String palindrome="";
     for(int index=0;index<str.length();index++)
     {
      palindrome=str.charAt(index)+palindrome; 
     }
       System.out.println((palindrome.equals(str))?"This string is palindrome":"This is not palindrome"); 
 }
}


