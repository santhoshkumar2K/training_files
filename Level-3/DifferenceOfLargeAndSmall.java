public class DifferenceOfLargeAndSmall
{
 
 public static void main(String []arg)
 {   
     int []array={1,2,9,7,3,4,5,6,67};
     
       int temp;
     if(array.length>1)
     {
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
        }
      }
   
     
    System.out.println("Difference between large and small is : "+(array[array.length-1]-array[0]));
     
    
        
 }
}
