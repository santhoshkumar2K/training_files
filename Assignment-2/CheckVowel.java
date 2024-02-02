import java.util.Scanner;
public class CheckVowel
{
 private static boolean checkVowels(String str)
 {
        boolean vowel=false;
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
           {
              vowel=true;
              break;
           }
       }
       return vowel;
 }
 public static void main(String[]args)
 {
    Scanner scan= new Scanner(System.in);
     System.out.println("Enter a String: ");
       String str= scan.nextLine();
     System.out.println(checkVowels(str));
 }
} 
