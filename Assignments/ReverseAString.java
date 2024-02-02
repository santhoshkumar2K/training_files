import java.util.*;
public class ReverseAString
{
 public static String[] split(String str)
  {
    String array[]=new String[str.length()]; 
   int i=0;   String word=""; 
    for(int index=0;index<str.length();index++)
    {
        if(str.charAt(index)==' ')
       { 
         array[i++]=word;
         word="";
       }else{
        word=word+str.charAt(index);
       } 
    }
    array[i]=word;
 return array;
 }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
    System.out.println("Enter a sentence : "); 
     String str=scan.nextLine();
        String[]array= split(str);     
     for(int index=array.length-1;index>=0;index--)
     { 
       if(array[index]!=null)
       {
         System.out.print(array[index]+" "); 
       }
       
     }
      
 }
}
