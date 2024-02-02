import java.util.Scanner;
public class FindYourNumber
{
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a number between 1 to 100: ");
   int number=scan.nextInt(); 
      System.out.println((number<=0 || number>100)?"\"Invalid number.\"":(number<=50)?"\"The number is in the lower half.\"":"\"The number is in the upper half.\"");
 }
}
