import java.util.*;
public class LeftTriangle
{
 public static void pattern(int number)
  {
    for(int row=1;row<=number;row++)
    {
      for(int column=1; column<=number; column++)
      {
         if(column<=(number-row))
         {
            System.out.print(" ");
         }else
         {
             System.out.print("*");
         }   
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
