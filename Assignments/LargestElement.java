import java.util.Scanner;
public class LargestElement
{
 public static void find(int []array)
 {
  int maximum=Integer.MIN_VALUE;
    for(int index=0;index<array.length;index++)
    {
       if(array[index]>maximum)
       {
        maximum=array[index];
       }
    }
   System.out.println("Maximum is: "+maximum);
 } 
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a length of array : ");
   int length=scan.nextInt();
   int array[]=new int[length];
      System.out.println("Enter the elements: ");
    for(int index=0;index<length;index++)
    {
      array[index]=scan.nextInt();
    }
   find(array); 
 }
}
