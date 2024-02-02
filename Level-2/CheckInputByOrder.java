import java.util.Scanner;
class CheckInputByOrder
{

public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter a first Number: ");
  double number1=scan.nextInt();
  System.out.println("Enter a second Number: ");
  double number2=scan.nextInt();
  System.out.println("Enter a third Number: ");
  double number3=scan.nextInt();
  
     System.out.println((number1<number2)?(number2<number3)?"Increasing Order":"no Order":(number1>number2)?(number2>number3)?"Decreasing Order":"no Order":"No  Order");
         
  
 }
}
