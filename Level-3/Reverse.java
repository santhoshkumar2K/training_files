import java.util.Scanner;
public class Reverse
{
 public static void reverse(int []arr)
 {
   int temp[] =new int[arr.length];
   int length =arr.length-1,newIndex=0;
   for(int index=length; index>=0; index--)
   {
    temp[newIndex]=arr[index];
    newIndex++;
   }
    arr=temp;
    //display..........
    for(int index=0; index<=length; index++)
   {
    System.out.println(arr[index]);
   }
 } 
 public static void main(String []arg)
 {   
      Scanner scan=new Scanner(System.in);
    System.out.println("Enter a Length of Array: ");
      int length=scan.nextInt();
      int arr[]=new int[length];
    System.out.println("Enter the Elements of Array: ");
    
      for(int index=0;index<length;index++)
      {
      arr[index]=scan.nextInt();
      }
       reverse(arr);
      
 }
}
