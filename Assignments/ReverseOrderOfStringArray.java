import java.util.Scanner;
public class ReverseOrderOfStringArray
{
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a length of array : ");
   String array[]=new String[scan.nextInt()];
        scan.nextLine();
      System.out.println("Enter the elements: "); 
    for(int index=0;index<array.length;index++)
    {
      array[index]=scan.nextLine();
    }
    //reverse order 
    for(int index=array.length-1;index>=0;index--)
    {
      System.out.println(array[index]);
    }
 }
}
