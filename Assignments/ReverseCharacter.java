import java.util.Scanner;
public class ReverseCharacter
{
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
       System.out.println("Enter a String: ");
    String sentence=scan.nextLine(); 
    String reverse="";
     for(int index=0;index<sentence.length();index++)
     {
      reverse=sentence.charAt(index)+reverse; 
     }
       System.out.println(reverse); 
 }
}
