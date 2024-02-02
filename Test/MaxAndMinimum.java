import java.util.Scanner;
public class MaxAndMinimum {
  
 public static void print(int array[])
{ 
   int temp;
  for(int index=0;index<array.length;index++)
 {
      if(index%2==0)
      {
         temp=array[array.length-1];
        for(int shift=array.length-1;shift>index;shift--)
        {
        array[shift]=array[shift-1];
        }
        array[index]=temp;  
      }
           
  }  
      for(int index=0; index<array.length;index++)
      {
        System.out.println(array[index]);
      }     
 }
  public static void main(String args[]) {
   Scanner scan= new Scanner(System.in);
    System.out.println("Enter a length : ");    
      int array[]=new int[scan.nextInt()]; 
    System.out.println("Enter the elements of array: ");
    for(int index=0;index<array.length;index++)
    {
     System.out.println("Add : ");
       array[index]=scan.nextInt();
     }
  
     print(array);
  }
}
