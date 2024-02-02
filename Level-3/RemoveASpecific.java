import java.util.Scanner;
public class RemoveASpecific
{
  public static void remove(int element,int arr[])
  {
     boolean checking=false;
    for(int index=0;index<arr.length;index++)
    {
      if(arr[index]==element)
      {
        checking=true;
         for(int shift=index+1;shift<arr.length;shift++)
         {
           arr[shift-1]=arr[shift];
         } 
       } 
      System.out.println(arr[index]);
   }  
      arr[arr.length-1]=0;
       if(!checking)
        System.out.println("No find this element!");
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
    System.out.println("Element for remove: ");
       int specificElement=scan.nextInt();
       
         remove(specificElement,arr);    
 }
}
