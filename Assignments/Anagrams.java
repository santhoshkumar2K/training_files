import java.util.*;
public class Anagrams
{
 public static void anagrams(String str1,String str2)
 {
      int count=0;
    if(str1.length()==str2.length())
   {
      for(int index=0;index<str1.length();index++)
      {
        for(int next=0;next<str2.length();next++)
        {
           if(str1.charAt(index)==str2.charAt(next))
           {      
             count++;
             break;
           }
        }
      }
      System.out.println((count==str1.length())?"It is Anagram":"It is not Anagrams");
   }else
   {   
     System.err.println("It is not Anagrams");
   }    
 }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
    System.out.println("Enter a string1 : "); 
     String str1=scan.nextLine();
    System.out.println("Enter a string2 : "); 
     String str2=scan.nextLine();  
      anagrams(str1,str2);
 }
}
