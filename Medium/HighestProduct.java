import java.util.Scanner;
public class HighestProduct
{
 public static void highProduct(int []arr)
{  
          int large=0,no1=0,no2=0,no3=0;
   for(int index=0;index<arr.length;index++)
   {
     for(int next1=index+1;next1<arr.length;next1++)
     {
      for(int next2=next1+1; next2<arr.length; next2++)
      {
         if((arr[index]*arr[next1]*arr[next2])>large)
         {
          large=arr[index]*arr[next1]*arr[next2];
           no1=index;
           no2=next1;
           no3=next2;
         }
      }
     }     
   }    
   
       System.out.println(arr[no1]+"  "+arr[no2]+"  "+arr[no3]+" = "+(large));
 }
 public static void main(String []arg)
 {   
      int []array={-10,-10,10,3,5,7,30};
    
      highProduct(array);
      
           
 }
}
