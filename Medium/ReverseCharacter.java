import java.util.*;
public class ReverseCharacter
{
 public static void reverse(char []array)
 {
    String word="";
   for(int index=0;index<array.length;index++)
   {
    word=array[index]+word;
   }
     array=word.toCharArray();
    System.out.println(Arrays.toString(array));
 }
public static void main(String []  arr)
{
  Scanner scan= new Scanner(System.in);
   
  System.out.println("Enter the elements of Character Array: ");
   char [] array=scan.next().toCharArray();
   
   reverse(array);
}
}
