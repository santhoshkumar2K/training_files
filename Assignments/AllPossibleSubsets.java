import java.util.Scanner;
public class AllPossibleSubsets
{ 
 public static void subset(String word, int index, String concat)
 {
    int length=word.length();
   if(index==length)
   {
     System.out.println(concat);
     return ;
   }
    subset(word, index+1, concat+word.charAt(index)); 
    subset(word,  index+1, concat);                     
 } 
  
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a word: ");
   String word=scan.nextLine();
     subset(word, 0 , "");
 }
}
