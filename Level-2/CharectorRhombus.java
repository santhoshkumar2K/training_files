import java.util.Scanner;
public class CharectorRhombus
{
 public static void main(String []arg)
 {
  Scanner scan= new Scanner(System.in);
  System.out.println("Enter a length of Triangle: ");
   int length= scan.nextInt();
     
     for(int row=1;row<=length;row++)
     {
       for(int column=1;column<=row;column++){
         if(column==row)
         {
           for(int remaind=row;remaind>=1;remaind--)
           {
             System.out.print((char)(remaind+64));  
           }
         }else{
         System.out.print((char)(column+64));  
         }
       }
     System.out.println();  
     }
     for(int row=1;row<=length-1;row++)
     {
       for(int column=1;column<=length-row;column++)
       {
        if(column==(length-row)) 
         {
          for(int reminder=column;reminder>=1;reminder--)
          {
            System.out.print((char)(reminder+64));  
          }
         }else{
         System.out.print((char)(column+64));  
         }
       }
       System.out.println();  
     }
 
 }
}
