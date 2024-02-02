import java.util.Scanner;
public class CheckPrimeNo
{
 public static int prime(int number, int divisible)
 {
   if(divisible==1)
   {
      return 1;
   }
   if(number%divisible==0)
   {
     return 0; 
   }
   return prime(number,divisible-1);
 } 
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
    System.out.println("Enter a number: ");
   int number=scan.nextInt(); 
    System.out.println((prime(number,number/2)==1)?"It is prime number ":" Its not prime!");
 }
}
