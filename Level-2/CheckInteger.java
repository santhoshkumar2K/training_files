 import java.util.Scanner;
class CheckInteger
{

public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter Your First Number: ");
  double m=scan.nextInt();
  
  
   int n=  (m==0)?0:(m>0)?1:-1;
           System.out.println("The Value of m: "+m);
            System.out.println("The Value of n: "+n);
  
 }
}
