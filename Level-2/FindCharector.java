import java.util.Scanner;
class FindCharector
{

public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter a Charector: ");
  String input=scan.nextLine();
        
          char letter=input.charAt(0);
         
     if(input.length()==1  && letter>65 && letter<91 || letter>=97 && letter<=122)
     { 
          if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A'||  letter=='E'||letter=='I'||letter=='O'||letter=='U')
         {
             System.out.println("Input Letter is Vowel");
         }else
         {
             System.out.println("Input Letter is Consonant");
         }
     }else
     {
      System.out.println("Unvalied charector... ");
     }  
  
  
             
 }
}
