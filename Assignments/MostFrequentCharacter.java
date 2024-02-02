import java.util.*;
public class MostFrequentCharacter
{
 public static void frequent(String str)
  {
    int freq[]=new int[str.length()];
    int count,  max=0, mostchar=0;
    for(int index=0;index<str.length();index++)
    {
      count=1;
      for(int next=index+1;next<str.length();next++)
      {
         if(str.charAt(index)==str.charAt(next))
         { 
           freq[next]=-1;     
           count++;
         }
      }
      if(freq[index]!=-1)
      {
        freq[index]=count; 
        if(freq[index]>max)
        {
          max=freq[index];
          mostchar=index;
        }
      }
       
    }
     System.out.println(str.charAt(mostchar));
 }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
    System.out.println("Enter a sentence : "); 
     String str=scan.nextLine();
      frequent(str);
 }
}
