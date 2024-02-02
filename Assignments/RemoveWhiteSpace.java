import java.util.*;
public class RemoveWhiteSpace
{
 public static void removeSpace(String str)
 {
      String word=""; 
    for(int index=0;index<str.length();index++)
    {
        if(str.charAt(index)!=' ')
        {
          word=word+str.charAt(index);
        } 
    }
    System.out.println(word);
 }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
    System.out.println("Enter a string : "); 
     String str=scan.nextLine();
      removeSpace(str);
 }
}
