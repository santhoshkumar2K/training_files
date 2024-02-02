import java.util.Scanner;
class OnlyPositiveOrNegative
{

 public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter Your Number: ");
  int number=scan.nextInt();
     
     System.out.println((number>0)?"Your Number is Passitive":"Your Number is Negative");
  
 }
}
