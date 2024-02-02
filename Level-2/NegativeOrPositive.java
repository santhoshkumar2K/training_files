import java.util.Scanner;
class NegativeOrPositive
{

public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter a Number: ");
  double number=scan.nextInt();
  
      System.out.println((number==0)?"Number is Zero":(number>0)?"Number is Positive":"Number is Negative");
            
  
 }
}
