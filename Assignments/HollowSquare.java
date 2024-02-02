import java.util.*;
public class HollowSquare
{
 public static void square(int rowLength, int columnLength)
  {
    for(int row=1;row<=rowLength;row++)
    {
      for(int column=1; column<=columnLength; column++)
      {
        if(row==1 || column==1 || row==rowLength ||column==columnLength)
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
        System.out.println("Enter the no.of row : "); 
      int row=scan.nextInt();
        System.out.println("Enter the no.of column : "); 
      int column=scan.nextInt();
     square(row, column);  
 }
}
