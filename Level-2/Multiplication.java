import java.util.Scanner;
class Multiplication
{
  
public static void main(String []arr)
 {

    Scanner scan= new Scanner(System.in);
     System.out.println("Enter a Number: ");
       int input=scan.nextInt();
          
       for(int number=0;number<=input;number++)
       {
       System.out.println(input+" x "+number+" = "+input*number);
       }
 }
}
