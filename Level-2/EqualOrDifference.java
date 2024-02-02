import java.util.Scanner;
class EqualOrDifference
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
  
  System.out.println((number1==number2)?(number1==number3)?"All numbers are Equal":"number 1 and number 2 is Equal":(number2==number3)?"number 2 and number 3 is Equal":" They are differene");
         
  
 }
}
