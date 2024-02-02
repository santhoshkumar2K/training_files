import java.util.Scanner;
public class CommonElementString
{
  public static void duplicate(String []arr,String []arr2)
{
   int temp[]=new int[arr.length];
   int count;
   for(int index=0;index<arr.length;index++)
   {
      count=1;
       for(int next=index+1;next<arr.length;next++)
       {
         if(arr[index].equals(arr[next]))
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
             if(arr[index].equals(arr2[index2]) )
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
     
      String array1[]={"theni","chennai","palani","thenkasi","madurai","srivi","sivakasi",};
      String array2[]={"sivagiri","chennai","thiruchenthoor","chennai","srivi"};
          duplicate(array1,array2);
      
 }
}
