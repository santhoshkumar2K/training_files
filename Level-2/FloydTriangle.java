import java.util.Scanner;
class FloydTriangle
{
  
public static void main(String []arr)
 {

    Scanner scan= new Scanner(System.in);
     System.out.println("Enter a length of triangle: ");
       int input=scan.nextInt();
          
       for(int row=0;row<input;row++)
       {
          for(int column=0;column<=row;column++)
          {
             System.out.print((1+row+column)%2);          // +1 for printing 1 instead of 0
             
          }
         System.out.println();   
       }
 }
}
