import java.util.Scanner;
public class FindAvgExceptLargeSmall
{
 
 public static void main(String []arg)
 {   
     int []array={1,2,9,7,3,4,5,6,67};
     
       int temp;
       int sum=0;
    
       for(int index=0;index<array.length;index++)
       {
         for(int next=index+1;next<array.length;next++)
         {
           if(array[index]>array[next])
           {
            temp=array[index];
            array[index]=array[next];
            array[next]=temp;
           }
         }
         sum+=array[index];
       }
      
     double exceptSum=sum- (array[array.length-1]+array[0]);
     double exceptAvg= exceptSum/(array.length-2);
   
     
    System.out.println("Average of except large and small is : "+exceptAvg);
     
    
        
 }
}
