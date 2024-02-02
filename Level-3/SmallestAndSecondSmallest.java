public class SmallestAndSecondSmallest
{
 
 public static void main(String []arg)
 {   
     int array[]={8,12,37,23,46,51,59,20};
     int small,secondSmall;
      small=secondSmall=Integer.MAX_VALUE;
     for(int index=0;index<array.length;index++)
     {
         if(array[index]<small)
          {
            secondSmall=small;
            small=array[index]; 
          }else if(secondSmall>array[index] && small!=array[index])
          {
             secondSmall = array[index];
          } 
     }
     System.out.println("Smallest element is: "+small+" \n SecondSmallest is: "+secondSmall);
 }
}
