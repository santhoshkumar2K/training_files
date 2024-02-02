import java.util.Scanner;
public class FibonacciSequence
{
 public static void fibonacci(int number)
 {
   int first=0,second=1,sum=0;
    for(int index=0;index<=number;index++)
    {
      if( index==0)
      {
        sum=0; 
      }else
      {
         sum=first+second;
         second=first;
         first=sum;
      }    
      System.out.println(sum);
    }
 } 
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a limit of fibonacci sequence: ");
   int number=scan.nextInt(); 
    fibonacci(number); 
 }
}
