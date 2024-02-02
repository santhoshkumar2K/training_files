import java.util.Scanner;
class LargeAndSmall
{

public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter a Number: ");
  double number=scan.nextInt();
       double absolute=number*(-1); 
      System.out.println((number==0)?"Zero":(number>0)?(number>1000000)?"Large Positive":"small Positive": (absolute>1000000)?"Large Negative":"Small Negative");
      
  
 }
}
