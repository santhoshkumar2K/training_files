import java.util.*;
public class FirstLetterCapital
{
 public static void change(String str)
 {
      String word=""; 
    for(int index=0;index<str.length();index++)
    {
        if(str.charAt(index)==' ')
        {
         word=word+str.charAt(index)+capital(str.charAt(index+1));
         index++;
        }else if(index==0)
        {
          word=word+capital(str.charAt(index));
        }else
        {
         word=word+str.charAt(index);
        } 
    }
    System.out.println(word);
 }
 public static char capital(char c)
 {
  char caps='\u0000';
   if(c>='a' && c<='z')
   {
     caps=(char)((int)c-32);
   }else
   {
    caps=c;
   }
   return caps;
 }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
    System.out.println("Enter a string : "); 
     String str=scan.nextLine();
      change(str);
     //  System.out.println((char)((int)'a'-32));
 }
}
