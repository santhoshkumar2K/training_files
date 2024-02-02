import java.util.Scanner;
public class WithoutDivision
{
 public static void nonDivision(int []arr)
{  
          int count, sum=1;
   for(int index=0;index<arr.length;index++)
   {
      sum=sum*arr[index];
   } 
      for(int index=0;index<arr.length;index++)
      {
         count=0;
        for(int total=sum;total>=arr[index];)
        {
          total=total-arr[index];
          count++;
        }
        arr[index]=count;
          System.out.print(arr[index]+" ");
      }       
   
       System.out.println();
 }
 public static void main(String []arg)
 {   
      int []array={1,2,3,4,5};
    
      nonDivision(array);
      
           
 }
}
