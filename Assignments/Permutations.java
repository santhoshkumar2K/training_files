import java.util.Scanner;
public class Permutations
{ 
 public static void permutation(String word, int firstIndex, int lastIndex)
 {
   if(firstIndex==lastIndex)
   {
     System.out.println(word);
     return ;
   }
   for(int index=firstIndex; index<=lastIndex; index++)
   {
       word=swap(word, firstIndex, index);        
       permutation(word, firstIndex+1, lastIndex);
   }
 } 
  public static String swap(String str,int start, int end)
  {
    char [] array=str.toCharArray();
      char temp=array[start];
      array[start]=array[end];
      array[end]=temp;
      return new String(array);                
  }
  
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a word: ");
   String word=scan.nextLine();
      permutation(word, 0 , word.length()-1);
 }
}
