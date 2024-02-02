import java.util.Scanner;
public class CopyArray
{
  public static void display(int copy[])
  {
      System.out.println(" Elements copied & put in another Array:");
     for(int index=0;index<copy.length;index++)
      {
        System.out.println(copy[index]);
      }
  }
 public static void main(String []arg)
 {   
      Scanner scan=new Scanner(System.in);
    System.out.println("Enter a Length of Array: ");
      int length=scan.nextInt();
      int arr[]=new int[length];
     // int copy[]=new int[arr.length];
    System.out.println("Enter the Elements of Array: ");
     for(int index=0; index<length; index++)
     {
       arr[index]=scan.nextInt();
     }
    
      int []copy=arr;
       display(copy);  
 }
}
