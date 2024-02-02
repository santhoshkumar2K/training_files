import java.util.*;
public class Consecutive
{
 public static int[] consecutiveLength(int []arr)
{  
        int temp;
   for(int index=0;index<arr.length;index++)
   {
     for(int next=index;next<arr.length;next++)
     {
        if(arr[index]>arr[next])
        {
           temp=arr[index];
           arr[index]=arr[next];
           arr[next]=temp;
        }   
     }    
   }
       return arr; 
 }
 public static void main(String []arg)
 {   
      int []array={1,3,4,2,8,9,5,7,11,12};
      int a[]= consecutiveLength(array);
      
           int count=1,max=0;
    
       for(int index=0,next=1; next<a.length;index++,next++)
       {
        if((a[index]+1)==(a[next]))
        {  
         count++;
          if(count > max)
          {
          	max = count;
          }
        }else
        {
           count=1;
        }
       }
    System.out.println(max);
 }
}
