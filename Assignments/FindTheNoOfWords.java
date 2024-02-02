import java.util.*;
public class FindTheNoOfWords
{
 public static void split(String str)
  {
   int count=0; 
    for(int index=0;index<str.length()-1;index++)
    {
        if(str.charAt(index)==' ' && str.charAt(index+1)!=' ')
       { 
         count++;
       }else if(str.charAt(index)==' ' && index==0)
       {
          count=0;;
       }else if(str.charAt(index)!=' ' && index==0)
       {
        count++;
       } 
    }
    
    System.out.println(count);
 }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
        System.out.println("Enter a sentence : "); 
     String str=scan.nextLine();
     split(str);  
 }
}
