import java.util.*;
public class HollowDiamond
{
public static void pattern(int number)
  {
    for(int row=1;row<=number;row++)
    {
      for(int column=number; column>=row; column--)
      {
         System.out.print(" ");
      }
      for(int recolumn=1;recolumn<=(row+(row-1));recolumn++)
      {
         if(recolumn==1 || recolumn==(row+(row-1)))
         {
           System.out.print("*");
         }else{
           System.out.print(" ");
         }
      }
      System.out.println();
    }
    for(int row=1;row<number;row++)
    {
      for(int column=0; column<=row; column++)
      {
         System.out.print(" ");
      }
      for(int recolumn=(number+(number-1));recolumn>row*2;recolumn--)
      {
         if(recolumn==(row*2)+1 || recolumn==(number+(number-1)))
         {
           System.out.print("*");
         }else
         {
           System.out.print(" ");
         }  
      }
      System.out.println();
    }
 }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
        System.out.println("Enter the no.of middle of Diamond : "); 
      int number=scan.nextInt();
     pattern(number);  
 }
}
