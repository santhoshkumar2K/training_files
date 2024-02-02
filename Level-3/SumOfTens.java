public class SumOfTens
{
 
 public static void main(String []arg)
 {   
     int []array={1,2,-2,10,10,-1,9,7,10,3,4,5,10,6,6};
        int sum=0;
       for(int index=0;index<array.length;index++)
        {
           if(array[index]==10)
           {
            sum+=array[index];
           }
        }
         
           System.out.println((sum==30)?true:false);
          
        
 }
}
