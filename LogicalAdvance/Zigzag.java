import java.util.Scanner;
public class Zigzag
{
  public static void print(String word,int number) {
        String newWord="";
          boolean down=true;
            String array[][]=new String[number][word.length()];
       for(int row=0,column=0;column<word.length();column++)
       {
         array[row][column]=""+word.charAt(column);
         if(row==number-1)
         {
             down=false;
         }else if(row==0)
         {
          down =true;
         }
           if(down)
           {
            row++;
           }else{
            row--;
           }
       }  
       //display...
       for(int row=0;row<array.length; row++)
       {
         for(int column=0;column<word.length();column++)
         {
           if(array[row][column]==null){
               System.out.print(" ");
           }else{
                System.out.print(array[row][column]);
             newWord=newWord+array[row][column];   
           }
         }
          System.out.println();
       }
         System.out.println(newWord); 
    }
 public static void main(String []arr)
 {
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter a String: ");
   String word=scan.nextLine();
   System.out.println("Enter a number: ");
   int no=scan.nextInt();
     print(word,no);
   
 }
}
