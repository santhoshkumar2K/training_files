import java.util.Scanner;
public class MultiplicationTable
{
 public static void multiplication(int input)
 {
   for(int number=1;number<=20;number++)
   {
         System.out.println(number+" x "+input+" = "+(number*input));
   }
 } 
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a number: ");
     int input=scan.nextInt();
       multiplication(input); 
 }
}
