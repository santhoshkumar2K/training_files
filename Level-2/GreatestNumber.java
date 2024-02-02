import java.util.Scanner;
class GreatestNumber
{

public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter Your First Number: ");
  int number1=scan.nextInt();
  System.out.println("Enter Your Second Number: ");
  int number2=scan.nextInt();
  System.out.println("Enter Your Third Number: ");
  int number3=scan.nextInt();  
  
   int great=  (number1>number2)?(number1>number3)?number1:number3:(number2>number3)?number2:number3;
           System.out.println("The Greatest Number: "+great);
  
 }
}
