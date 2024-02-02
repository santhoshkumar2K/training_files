import java.util.Scanner;
public class Doublicate
{
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
       System.out.println("Enter a sentence: ");
        String str=scan.nextLine();         
     for(int index=0;index<str.length();index++)
     {
       for(int next=index+1;next<str.length();next++)
       {
       
          if(str.charAt(index)==str.charAt(next) && str.charAt(index)!=' ')
          {
            System.out.println(str.charAt(index));
            break;
          }  
       }
     }       
 }
}
