import java.util.Scanner;
class Sum
{
  public static void sumAndDisplay(int num)
  {
  int sum=0;
    System.out.println("Input number"+num);
    System.out.println("The first n natural numbers are: ");
     if(num>0)
     {
          for(int naturalNumber=1;naturalNumber<=num;naturalNumber++)
          {
           System.out.println(naturalNumber);
           sum=sum+naturalNumber;
          }
     }else{
          System.out.println("It is not a Natural number");
     }  
     System.out.println("The sum of natural number\n"+sum);
  
  }
public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter a Number: ");
   int number=scan.nextInt();
      sumAndDisplay(number);
  
 }
}
