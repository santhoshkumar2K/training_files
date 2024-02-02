import java.util.Scanner;
public class FindDuplicateString
{
  
 public static void duplicate(String []arr)
{
   int count;
   for(int index=0;index<arr.length;index++)
   {
      count=1;
       for(int next=index+1;next<arr.length;next++)
       {
         if(arr[index].equals(arr[next]) && !arr[index].equals("null"))
         {
          arr[next]="null";
          ++count;
         }
       }
       if(count>1)
       {
         System.out.println("Duplicate element is : "+arr[index]+" There are "+count+" Times");
       }
    }
 }
 public static void main(String []arg)
 {   
      Scanner scan=new Scanner(System.in);
    System.out.println("Enter a Length of Array: ");
      int length=scan.nextInt();
     String array[]=new String[length];
       scan.nextLine();
    System.out.println("Enter the Elements of String Array: ");
   
      for(int index=0;index<length;index++)
      {
      array[index]=scan.nextLine();
      }
      
     duplicate(array);  
      
 }
}
