public class NextGreatestElementInRightSide
{
 public static void rightSideGreatest(int []array)
 {
     int maximum=-1;
     int temp=0;
    for(int index=array.length-1;index>=0;index--)
    {
       temp=array[index];
       array[index]=maximum;
      if(temp>maximum)
      {
       maximum=temp;
      }
      
    }
 }
 public static void main(String []arg)
 {   
   int array[]={19,17,10,4,3,5,2};
   rightSideGreatest(array);
   //display...
      for(int index=0;index<array.length;index++)
      {
       System.out.print(array[index]+" ");
      }   System.out.println();
 }
} 
