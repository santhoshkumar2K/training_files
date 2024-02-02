public class SecondSmallest
{
 
 public static void main(String []arg)
 {   
      int array[]={2,1,2,1,3,7,8,5,5,6,81,1,1,6,4,5};
               int frist,second;
               
          frist=second=Integer.MAX_VALUE;
     for(int index=0;index<array.length;index++)
     {
         if(array[index]<frist)
          {
            second=frist;
            frist=array[index]; 
          }else if(second>array[index] && frist!=array[index])
          {
             second = array[index];
          }
         
       
     }
     System.out.println("Second Smallest is:  "+second);
        
 }
}
