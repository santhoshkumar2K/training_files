import java.util.Scanner;
class Rhombus
{
  
public static void main(String []arr)
 {

    Scanner scan= new Scanner(System.in);
     System.out.println("Enter a length of triangle: ");
       int input=scan.nextInt();
          
       for(int row=1;row<=input;row++)
       {
          for(int column=row;column>=1;column--)
          {
             if(column==1)
             {
               for(int reminderColumn=1;reminderColumn<=row;reminderColumn++)
                {
                  System.out.print(reminderColumn);
                }
             }else{
             System.out.print(column);
             }
          }
         System.out.println();   
       }
        for(int row=1;row<=input;row++)
       {
          for(int column=input-row;column>=1;column--)
          {
             if(column==1)
             {
               for(int reminderColumn=1;reminderColumn<=input-row;reminderColumn++)
                {
                  System.out.print(reminderColumn);
                }
             }else{
                 System.out.print(column);
             }
          }
         System.out.println();   
       }
 }
}
