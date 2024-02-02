import java.util.Scanner;
public class Palindrome
{
 private static boolean isPalindrome(String str)
 {
        int count=0;
       for(int i=0,j=str.length()-1;i<str.length();i++,j--)
       {
          if( str.charAt(i)==str.charAt(j))
          {
              count++;
          }
       }
       return (count==str.length());
  }
 public static void main(String[]args)
 {
    Scanner scan= new Scanner(System.in);
         System.out.println("Enter a String: ");
	 String str=scan.nextLine();
         System.out.println(isPalindrome(str));
 }
} 
