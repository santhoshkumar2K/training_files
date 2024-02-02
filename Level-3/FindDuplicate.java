import java.util.Scanner;
public class FindDuplicate
{
 public static void duplicate(int []arr)
{
   int count=0;
   for(int index=0;index<arr.length;index++)
   {
      count=1;
       for(int next=index+1;next<arr.length;next++)
       {
         if(arr[index]==arr[next] && arr[index]!=-1)
         {
          arr[next]=-1;
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
      int arr[]=new int[length];
    System.out.println("Enter the Elements of Array: ");
   
      for(int index=0;index<length;index++)
      {
      arr[index]=scan.nextInt();
      }
     duplicate(arr);   
 }
}
