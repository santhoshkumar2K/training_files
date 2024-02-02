import java.util.Scanner;
class Diamond
{
  
public static void main(String []arr)
 {

    Scanner scan= new Scanner(System.in);
     System.out.println("Enter a length of Diamond (half): ");
       int input=scan.nextInt();
          
       for(int row=1;row<=input;row++)
       {
          for(int space=row;space<input;space++)
          {
             System.out.print(" ");  
          }
          for(int Column=1;Column<=row*2-1;Column++)
          {
           System.out.print("*");  
          }
         System.out.println();   
       }
       // half Diamond printed
       int print=input-1;
       for(int row=1;row<=input-1;row++)
       {
          for(int space=1;space<=row;space++)
          {
             System.out.print(" ");  
          }
          for(int column=1;column<=(print*2)-1;column++)
          {
           System.out.print("*");
           
          } print--; 
         System.out.println();   
       }
 }
}
