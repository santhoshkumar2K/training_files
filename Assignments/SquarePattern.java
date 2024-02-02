import java.util.*;
public class SquarePattern
{
 public static void square(int rowLength, int columnLength)
  {
    for(int row=1;row<=rowLength;row++)
    {
      for(int column=1; column<=columnLength; column++)
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
      int row=scan.nextInt();
        System.out.println("Enter the no.of column : "); 
      int column=scan.nextInt();
     square(row, column);  
 }
}
