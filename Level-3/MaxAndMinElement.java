import java.util.Scanner;
public class MaxAndMinElement
{
  public static void maxAndMin(int arr[])
  {
    int min=arr[0],max=0;
    for(int index=0;index<arr.length;index++)
    {
      if(arr[index]>max)
      {
        max=arr[index];
      }else if(arr[index]<min)
      {
       min=arr[index];
      }
   }
       
        System.out.println("Maximun Value of Array: "+max+"\n Minimum Value of Array: "+min);
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
         maxAndMin(arr);    
 }
}
