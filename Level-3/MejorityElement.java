import java.util.Scanner;
public class MejorityElement
{
 public static void duplicate(int []arr)
{
   int count=0;boolean check=false;
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
       if(count>1 && (arr.length/2)<count)
       {
         System.out.println("Mejority element is : "+arr[index]+" There are "+count+" Times");
         check=true;
       }
    }
    System.out.println(check);
 }
 public static void main(String []arg)
 {   
     int array[]={1,2,3,4,2,6,2,2,5,2,2,2};
     duplicate(array);   
     
 }
}
