import java.util.Scanner;
public class GreetsName
{
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter your name: ");
   String name=scan.nextLine();
      System.out.println("Hello.."+name);
 }
}
