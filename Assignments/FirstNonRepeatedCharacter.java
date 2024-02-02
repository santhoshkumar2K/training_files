import java.util.*;
public class FirstNonRepeatedCharacter
{
 public static void find(String str)
 {
      boolean word; 
    for(int index=0;index<str.length();index++)
    {
      word=true; 
      for(int next=index+1;next<str.length();next++)
      {
        if(str.charAt(index)==str.charAt(next))
        {
          word=false;
          break;
        } 
      }
      if(word)
      {
        System.out.println(str.charAt(index));
        break;
      }  
    }
  
 }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
    System.out.println("Enter a string : "); 
     String str=scan.nextLine();
      find(str);
 }
}
