import java.util.Scanner;
public class LeastCommonMultiple
{ 
  int gcd=1;
 public static void lcm(int number1,int number2)
 {       
     int gcd=1;
    for(int divisible=2; divisible<=number1 && divisible<=number2; divisible++)
    {
      if(number1%divisible==0 && number2%divisible==0)
      {
        gcd=divisible;
      }
    }
      System.out.println("LCM is: "+(number1*number2/gcd));
 } 
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a number1: ");
   int number1=scan.nextInt(); 
      System.out.println("Enter a number2: ");
   int number2=scan.nextInt(); 
      lcm(number1, number2);
 }
}
