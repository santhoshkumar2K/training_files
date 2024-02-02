import java.util.Scanner;
public class AverageOfNumbers
{
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in); 
     int sum=0, count=0, number=1;
       while(number!=0)
       {
       System.out.println("Enter the numbers (Enter a zero When you stop): ");
         number=scan.nextInt();
          sum+=number;
          count++;
       }
       System.out.println("Average : "+(sum/(count-1))); 
 }
}
