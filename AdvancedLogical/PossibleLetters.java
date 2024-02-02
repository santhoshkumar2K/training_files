import java.util.*;
public class PossibleLetters
{
  public static void possibles(String phone[],int number ,String concat) 
  {       
   if(number==0 || number==1){
   System.out.println(concat);
     return ;
   } 
   String str =phone[number%10];
   for(int index=0;index<str.length();index++)
   {
     possibles(phone,number/10,str.charAt(index)+concat);
      // System.out.println(concat);
   }
       
  }
 public static void main(String []arr)
 {                //0   1   2     3     4      5    6      7     8      9  
   String phone[]={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter a number: ");
   int  number=scan.nextInt();
   possibles(phone,number,"");
  
   
 }
}
