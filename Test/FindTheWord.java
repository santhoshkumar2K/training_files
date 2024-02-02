import java.util.Scanner;
public class FindTheWord
{
 public static void find(char[][]array, String word1, String word2)
 {
    boolean right_left=false,  up_down=false;
     String str="";
      for(int row=0; row<array.length;row++)
      {     
          str=""; 
        for(int col=0;col<array.length;col++)
         {
             str=str+array[row][col]+"";
         if(word1.equals(str) || word2.equals(str))
         {
           right_left=true;
         }
        }
      } 
       for(int col=0; col<array.length;col++)
        {
          str="";
         for(int row=0;row<array.length;row++)
         {
              str=str+array[row][col]+"";
           if(word1.equals(str) || word2.equals(str))
           {
            up_down=true;
           }
         }
      } 
      System.out.println((right_left==true && up_down==true)?"yes":"no");
 }
 public static void main(String []arg)
 { 
         char[][]arr=  {{'F', 'A', 'C', 'I'},
		{'O', 'B', 'Q', 'P'},
		{'A', 'N', 'O', 'B'},
		{'M', 'A', 'S', 'S'}};
    Scanner scan= new Scanner(System.in);
       System.out.println("Enter first word: ");      	
         String word1=scan.nextLine();
       System.out.println("Enter second word: ");      
         String word2=scan.nextLine();		
      find(arr,word1,word2);
 }
}
