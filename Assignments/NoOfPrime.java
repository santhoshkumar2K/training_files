import java.util.Scanner;
public class NoOfPrime
{
 public static int prime(int number)
 {
     if(number==1)
     {
      return 1;
     }
     for(int divisible=2;divisible<=(number/2);divisible++)
     {
          if(number%divisible==0)
          {
            return 0;
          }  
     }
        return 1;
 } 
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
         System.out.println("Enter a number : ");
   int input=scan.nextInt(); 
   int count=0;
   for(int number=1; true; number++)
   {
      if(prime(number)==1)
      {
         System.out.println(number);
         count++;
      }
      if(count==input)
      {
       break;
      }
   } 
 }
}
