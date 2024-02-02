import java.util.Scanner;
public class FindTheIndex
{
  public static void findIndex(int element,int arr[])
  {
      boolean check=false;
    for(int index=0;index<arr.length;index++)
    {
      if(arr[index]==element)
      {
         check=true;
        System.out.println("Index of element is: "+index);
      }
   } 
     if(check!=true){
       System.out.println("No element "+-1);
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
    System.out.println("Specific element: ");
       int specificElement=scan.nextInt();
       
         findIndex(specificElement,arr);    
 }
}
