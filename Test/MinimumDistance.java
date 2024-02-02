import java.util.Scanner;
public class MinimumDistance
{
 public static void main(String []arg)
 {   
     String []str={"C","C++","java","phyton","css","html","js"};
          Scanner scan= new Scanner(System.in);
         System.out.println("Select a first word : ");     
                String word1=scan.nextLine();
         System.out.println("Select a second word : ");      
                String word2=scan.nextLine();
               int position1=0, position2=0;
               boolean unvalied=false;
     for(int index=0;index<str.length;index++)
     {
      
       if(str[index].equals(word1) || str[index].equals(word2))
       {
         if(str[index].equals(word1))
         {
           position1=index;
         }else
         {
           position2=index;
         }
         
       }
    }
      System.out.println("distance: "+(position2-position1));      
 }
}
