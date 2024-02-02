import java.util.Scanner;
public class Age
{
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter your age: ");
   int age=scan.nextInt(); 
      System.out.println((age>=18)?"\"You are an adult.\"":"\"You are not yet an adult.\"");
 }
}
