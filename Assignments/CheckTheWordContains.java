import java.util.Scanner;
public class CheckTheWordContains
{
  public static boolean contains(String sentence, String word)
  {
     String contains=""; boolean find=false;
   for(int character=0;character<sentence.length();character++)
   {  
      if(sentence.charAt(character)==word.charAt(0))
      {
          contains="";
        for(int next=character; next<sentence.length(); next++)
        {
          contains+=sentence.charAt(next); 
           if(contains.equals(word))
           {
             find=true; 
           }
        }
      }
   }
   return find;
  }
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a String: ");
    String sentence=scan.nextLine(); 
       System.out.println("Enter a checking word: ");
    String word=scan.nextLine();   
      System.out.println((contains(sentence,word))?"\"The string contains "+word+".\"":"\"The string does not contain "+word+".\"");
 }
}
