import java.util.Scanner;
public class ReverseString
{
  private static String reverseString(String str)
  {
       String reverse="";
       for(int index=str.length()-1;index>=0;index--)
       {
          reverse=reverse+str.charAt(index);
       }
       return reverse;
  }
 public static void main(String[]args)
 {
     Scanner scan= new Scanner(System.in);
    System.out.println("Enter a String: ");
     String str=scan.nextLine();
    System.out.println(reverseString(str));
 }
} 
