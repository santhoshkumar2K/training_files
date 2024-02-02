
public class SecondLargest
{
 
 public static void main(String []arg)
 {   
      int array[]={1,2,1,2,3,1,7,8,5,5,6,8,6,4,5};
              
         int frist,second;
               
          frist=second=Integer.MIN_VALUE;
     for(int index=0;index<array.length;index++)
     {
         if(array[index]>frist)
          {
            second=frist;
            frist=array[index]; 
          }else if(second<array[index] && frist!=array[index])
          {
             second = array[index];
          }
     }   
      System.out.println("Second Maximum is: "+second);
 }
}
