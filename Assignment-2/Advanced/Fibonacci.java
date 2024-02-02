import java.util.Scanner;
public class Fibonacci
{
 public static void fibonacci(int num,int first,int second)
 {
    if(num==0)
    {
    System.out.println("Ans: "+first);
       return;
    }
    //
        first=first+second;
      fibonacci(num-1,second,first);
 }
public static void main(String[]arg)
{
  Scanner scan = new Scanner(System.in);
   System.out.println("Enter a number:");
   int input=0;
      try
	 {
	     input=scan.nextInt();
         }catch(java.util.InputMismatchException e)
	 {
	      System.out.println("                         Invalied Input please enter a number:");
	      main(new String[]{"",""});
	      return; 
	 }
    fibonacci(input,0,1);
    scan.close();
}
}

