import java.util.Scanner;
public class EqualityOfTwoArray 
{
  
 public static void equal(int array1[],int array2[])
 {
   int count=0;
  if(array1.length==array2.length)
  {
    for(int index=0;index<array1.length;index++)
    {
      count=(array1[index]==array2[index])?count+1:count;
    }
     System.out.println((count==array1.length)?" Equal..":"not equal!");
  }else
  {
    System.out.println("Its not equal!");
  }
 }
  public static int[] elementAdd(int [] arr)
  {
   Scanner scan= new Scanner(System.in);
    System.out.println("Enter the elements of array: ");
    for(int index=0;index<arr.length;index++)
    {
     System.out.println("Add : ");
       arr[index]=scan.nextInt();
    }
    return arr;
  }
  public static void main(String args[]) {
   Scanner scan= new Scanner(System.in);
       System.out.println("Enter a length of array1: ");
         int length1=scan.nextInt();
        int array1[]=new int[length1]; 
      System.out.println("Enter a length of array2: ");
       int length2=scan.nextInt();
      int array2[]=new int[length2]; 
     array1=elementAdd(array1);
     array2=elementAdd(array2);
     equal(array1,array2);
  }
}
