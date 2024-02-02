import java.util.*;
class Pascals
{
 
public static void main(String []arr)
 {

    Scanner scan= new Scanner(System.in);
     System.out.println("Enter a length of triangle: ");
       int input=scan.nextInt();
           int pascal[][]=new int[input][input];
           
       for(int row=0;row<input;row++)
       { 
         
          for(int column=0;column<=row;column++)
          {
             if(column==0||column==row)
             {
              pascal[row][column]=1;
             }else
             {
                pascal[row][column]=pascal[row-1][column-1]+pascal[row-1][column]; 
             }
             System.out.print(pascal[row][column]); 
          }
         System.out.println();   
       }
      
      
 }
}
