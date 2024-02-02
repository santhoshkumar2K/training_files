import java.util.Scanner;
class CubeNumbers
{
  
public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter a Number: ");
   int input=scan.nextInt();
             int cube;
       for(int number=1;number<=input;number++)
       {
       cube=number*number*number;
       System.out.println("Number is "+number+" and cube of "+number+" is "+cube);
       }
 }
}
