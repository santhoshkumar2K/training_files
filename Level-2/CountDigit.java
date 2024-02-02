import java.util.Scanner;
class CountDigit
{

public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter a Number: ");
  int number=scan.nextInt();
        int digit=0;
     while(number>0)
     {
      int r=number%10;
      number=number/10;
      digit++;
     }
      System.out.println("Number of digits in number: "+digit);
            
  
 }
}
