import java.util.Scanner;
public class Temperature
{
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a celsius: ");
   int celsius=scan.nextInt(); 
   int fahrenheit=(celsius*9/5)+32;
      System.out.println("Celsius: "+celsius+" to  Fahrenheit: "+fahrenheit);
 }
}
