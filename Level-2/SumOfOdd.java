import java.util.Scanner;
class SumOfOdd
{
  
public static void main(String []arr)
 {

    Scanner scan= new Scanner(System.in);
     System.out.println("Enter a Number: ");
       int input=scan.nextInt();
            int sum=0,odd=-1,number=input;
       while(number>0)
       {
       odd=odd+2;
       sum+=odd;
       System.out.println(odd);
       number--;
       }
       System.out.println("The Sum of odd Natural Number upto "+input+" terms is "+sum);
 }
}
