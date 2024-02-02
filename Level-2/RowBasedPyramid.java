import java.util.Scanner;
class RowBasedPyramid
{
  
public static void main(String []arr)
 {

    Scanner scan= new Scanner(System.in);
     System.out.println("Enter a length of triangle: ");
       int input=scan.nextInt();
          
       for(int row=1;row<=input;row++)
       {
          for(int column=row;column<=input;column++)
          {
             System.out.print(" ");  
          }
          for(int remainterColumn=1;remainterColumn<=row;remainterColumn++)
          {
           System.out.print(row+" ");  
          }
         System.out.println();   
       }
 }
}
