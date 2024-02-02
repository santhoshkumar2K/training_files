import java.util.Scanner;
public class Pattern
{
 public static void find(int n)
 {
      for(int row=0;row<=n;row++)
      {
        for(int col=1;col<=n-row;col++)
        {
          System.out.print(col);
        }
         System.out.println();
      } 

      for(int row=2; row<=n;row++)
      {
        for(int col=1;col<=row;col++)
        {
          System.out.print(col);
        }
        System.out.println();
      } 
     // System.out.println((one==true && two==true)?"yes":"no");
 }
 public static void main(String []arg)
 { 
   Scanner scan= new Scanner(System.in);
    System.out.println("Enter a number : "); 
     int number=scan.nextInt();  	
       find(number);
 }
}
