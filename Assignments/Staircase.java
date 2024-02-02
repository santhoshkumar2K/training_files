import java.util.*;
public class Staircase
{
 public static void pattern(int number)
  {
    for(int row=1;row<=number;row++)
    {
      for(int column=1; column<=row; column++)
      {
         System.out.print("*");
      }
      System.out.println();
    }
 }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
        System.out.println("Enter the no.of row : "); 
      int number=scan.nextInt();
     pattern(number);  
 }
}
