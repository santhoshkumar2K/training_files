import java.util.Scanner;
class Average
{
 
public static void main(String []arr)
 {
        int sum=0;
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter  5 Numbers: ");
      for(int input=1;input<=5;input++)
      {
         int number=scan.nextInt();
           sum=sum+number;
      }
       System.out.println("The sum of 5 numbers: "+sum);
        System.out.println("The Average is: "+sum/5);
 }
}
