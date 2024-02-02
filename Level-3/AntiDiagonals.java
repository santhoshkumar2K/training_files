import java.util.*;
public class AntiDiagonals
{

 public static void main(String []arg)
 {   
      int [][]array={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
      
        System.out.println("["); 
       for(int row=0;row<array.length;row++)
       {
         System.out.print("[");
         for(int column=row,printRow=0; column>=0; column--,printRow++)
         {
          System.out.print(array[printRow][column]);
          System.out.print((column==0)?"":",");
         }
         System.out.print("],");
         System.out.println();
       }
       for(int row=1; row<array.length; row++)
       {
        System.out.print("[");
          for(int column=array.length-1,printRow=row; printRow<=array.length-1; column--,printRow++)
          {
            System.out.print(array[printRow][column]);
            System.out.print((printRow==array.length-1)?"":",");
          }
          System.out.print((row==array.length-1)?"]":"],");
          System.out.println();
       }
       System.out.println("]");
       
     
           
 }
}
