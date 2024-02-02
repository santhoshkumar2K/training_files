import java.util.Scanner;
public class RemoveAll
{
  private static String replaceAll(String str, char c)
  {
        String temp="";
       for(int i=0;i<str.length();i++)
       {
          if(str.charAt(i)!=c)
          {
             temp=temp+str.charAt(i); 
          }
       }
       return temp;
  }
    
 public static void main(String[]args)
 {
    Scanner scan= new Scanner(System.in);
     System.out.println("Enter a String: ");
        String str=scan.nextLine();
     System.out.println("Enter a character: ");
         char character=scan.nextLine().charAt(0);
     System.out.println(replaceAll(str,character));
 }
} 
