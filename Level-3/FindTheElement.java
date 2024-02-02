import java.util.Scanner;
public class FindTheElement
{
  public static void isThere(int element,int arr[])
  {
    int checking=0;
    for(int index=0;index<arr.length;index++)
    {
      if(arr[index]==element)
      {
        System.out.println("Yes There is a Element..");
      }else
      {
       checking++;
      }
   }
       if(checking==arr.length)
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
    System.out.println("Specific element: ");
       int specificElement=scan.nextInt();
       
         isThere(specificElement,arr);    
 }
}
