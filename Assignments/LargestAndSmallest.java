import java.util.Scanner;
public class LargestAndSmallest
{
 public static void find(int []array)
 {
  int minimum=Integer.MAX_VALUE;
  int maximum=Integer.MIN_VALUE;
    for(int index=0;index<array.length;index++)
    {
       if(array[index]>maximum)
       {
        maximum=array[index];
       }else if(array[index]<minimum)
       {
         minimum=array[index];
       }
    }
   System.out.println("Maximum is: "+maximum+" Minimum is: "+minimum);
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
