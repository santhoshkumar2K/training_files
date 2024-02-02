import java.util.Scanner;
public class GreatestCommonDivisor
{ 
 public static int gcd(int small,int big)
 {
    int remainter=big%small;  
   if(remainter==0)
   {                            
      return small;   
   }
   return  gcd(remainter, small);
 } 
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a number1: ");
   int number1=scan.nextInt(); 
      System.out.println("Enter a number2: ");
   int number2=scan.nextInt(); 
   int big=(number1>number2)?number1:number2;
   int small=(number1<number2)?number1:number2;
      System.out.println(gcd(small, big));
 }
}
