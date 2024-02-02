import java.util.Scanner;
public class FindTheWordFromTheMatrix
{
 public static void findTwoWords(char array[][],String word1,String word2)
 {
          String word=""; boolean find1,find2;
         find1=find2=false;
   for(int column=0; column<array.length; column++)
   {
     for(int row=0; row<array.length; row++)
     {
       word=word+array[row][column];
     }
        if(word.equals(word1))
        {
          find1=true;
        }
        word="";
   }
   //left-to-right check...
     word="";
   for(int row=0; row<array.length; row++)
   {
     for(int column=0; column<array.length; column++)
     {
       word=word+(array[row][column]);
     }
        if(word.equals(word2))
        {
          find2=true;
        }
        word="";
   }
     System.out.println((find1==true && find2==true)?true:false);
 }
 public static void main(String []arg)
 {   
   char array[][]={{'F','A','C','T'},{'O','B','Q','P'},{'A','N','O','B'},{'M','A','S','S'}};
   Scanner scan= new Scanner(System.in);
   System.out.println("Ender frist words : ");
   String word1=scan.nextLine();
   System.out.println("Ender second words : ");
   String word2=scan.nextLine();
   
   findTwoWords(array,word1,word2);
  
 }
} 
