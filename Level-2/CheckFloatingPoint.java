import java.util.Scanner;
class CheckFloatingPoint
{

public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter a Number: ");
  double number=scan.nextInt();
  
       System.out.println((number==0)?"Number is Zero":(number>0)?"Number is Positive":"Number is Negative");
         double absoluteValue=(number*number)/number;
           System.out.println((absoluteValue<1)?(absoluteValue<1000000)?"Large":"":"Small");     
  
 }
}
