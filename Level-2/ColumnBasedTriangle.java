import java.util.Scanner;
class ColumnBasedTriangle
{
  
public static void main(String []arr)
 {

    Scanner scan= new Scanner(System.in);
     System.out.println("Enter a length of triangle: ");
       int input=scan.nextInt();
          
       for(int row=1;row<=input;row++)
       {
          for(int column=1;column<=row;column++)
          {
             System.out.print(column);
          }
         System.out.println();   
       }
 }
}
