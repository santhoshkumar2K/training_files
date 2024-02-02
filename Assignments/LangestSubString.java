import java.util.*;
public class LangestSubString
{
 public static void subString(String str)
  {
    String sub=""; int longestSubString=0, count=0;
   for(int index=0;index<str.length();index++)
   {
       if(contains(str.charAt(index),sub))
       {
         count=0;
         sub=sub.substring(sub.indexOf(str.charAt(index))+1);
       }else
       {
         sub=sub+str.charAt(index);
         count++;   
       }  longestSubString=(count>longestSubString)?count:longestSubString;
   }
      System.out.println(longestSubString);
 }
 public static boolean contains(char char1, String sub)
 {
   boolean isThere=false;
   for(int index=0;index<sub.length(); index++)
   {
     if(char1==sub.charAt(index))
     {
       isThere=true;
       break;
     }
   }
   return isThere;
 }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
    System.out.println("Enter a string : "); 
     String str=scan.nextLine();
          subString(str);
 }
}
