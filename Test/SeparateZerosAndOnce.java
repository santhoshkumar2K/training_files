import java.util.Scanner;
public class SeparateZerosAndOnce {
  
 public static void shift(int array[])
 {
   int countOfOne=0,start=0;
  
    for(int index=0;index<array.length-1;index++)
    {
      if(array[index]==1){
         array[start++]=1;
         countOfOne++;
      }
    }
    for(int index=countOfOne;index<array.length;index++)
      array[index]=0;
     
    for(int index=0;index<array.length;index++)
    {
       System.out.print(array[index]);
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
  
     shift(array);
  }
}
