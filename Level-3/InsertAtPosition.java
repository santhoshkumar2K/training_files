import java.util.Scanner;
public class InsertAtPosition
{
  public static void insert(int arr[],int value,int position)
  {
      arr=reSize(arr);
      if(arr.length>position)
      {
        
         for(int shift=arr.length-1;shift>position;shift--)
         {
           arr[shift]=arr[shift-1];
         } 
         arr[position]=value; 
        // display...........
        for(int index=0;index<arr.length;index++)
        {
        System.out.println(arr[index]);
        }
      }else
      {
        System.out.println("This index is Unvalied...");
      }
  }
  public static int[] reSize(int arr[])
  {
      int temp[]= new int[arr.length+1]; 
     for(int index=0;index<arr.length;index++)
      {
         temp[index]=arr[index];
      }
       return temp;
      
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
    System.out.println("Element for insert: ");
       int specificElement=scan.nextInt();
    System.out.println("Enter Specific index: ");
       int position=scan.nextInt();   
       
         insert(arr,specificElement,position);    
 }
}
