import java.util.Scanner;
public class Palindrome
{
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
       System.out.println("Enter a String: ");
    String sentence=scan.nextLine(); 
    String palindrome="";
     for(int index=0;index<sentence.length();index++)
     {
      palindrome=sentence.charAt(index)+palindrome; 
     }
       System.out.println((palindrome.equals(sentence))?"This string is palindrome":"This is not palindrome"); 
 }
}
