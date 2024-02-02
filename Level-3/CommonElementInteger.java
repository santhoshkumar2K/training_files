import java.util.*;
public class CommonElementInteger
{
  public static void duplicate(int []arr,int []arr2)
{
   int temp[]=new int[arr.length];
   int count;
    for(int index=0;index<arr.length;index++)
   {
      count=1;
       for(int next=index+1;next<arr.length;next++)
       {
         if(arr[index]==(arr[next]))
         {
           temp[next]=-1;
          count++;
         }
       } 
      if(temp[index]!=-1)
      {
          temp[index]=count;
          
          for(int index2=0;index2<arr2.length;index2++ )
          {
             if(arr[index]==(arr2[index2]) )
             {
              System.out.println("Common  Elements of two Arrays: "+arr[index]);
               break;
             }
          }
       }
         
     } 
 }
 public static void main(String []arg)
 {   
      int array1[]={1,2,1,2,3,1,6,8,6,4,0};
      int array2[]={1,2,2,6,4,0,1};
       
     duplicate(array1,array2);
        
      
      
 }
}
