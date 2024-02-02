import java.util.Scanner;
class TwoDesimalFloating
{
  
public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
   System.out.println("Enter Your First Number: ");
      float number1=scan.nextFloat();
   System.out.println("Enter Your Second Number: ");
      float number2=scan.nextFloat();
 
    float first=number1*100;
    float second=number2*100;  
  
           System.out.println(((int)first==(int)second)?"They are Same ":"They are Different");
  
 }
}
