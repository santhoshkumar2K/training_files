import java.util.*;
public class Pyramid
{
 public static void pattern(int number)
  {
    int print;
    for(int row=1;row<=number;row++)
    {
      print=1;
      for(int column=1; column<=(number+(number-1)); column++)
      {
        if((number-row)>=column)
        {
          System.out.print(" ");
        }else if(((number-row)+1)<=column && column<=number)
        {
          System.out.print(print++);
           if(column==number)
           {
             print=print-2;
           }
        }else if(column>number && print>=1)
        {
          System.out.print(print--);
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
