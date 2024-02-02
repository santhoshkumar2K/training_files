class SumOfPositiveAndNegativeCloseToZero
{
 
 public static void main(String []arg)
 {   
     int array[]={1,60,10,-70,-80,85,82,-71};
     
      int index=0,sum=0;
      int minimumSum=Integer.MAX_VALUE;
      int min_number1=0,min_number2=0;
     while( index<array.length )
     { 
        int next=index+1;
       while(next<array.length)
      {
         sum=array[index]+array[next];
         if(Math.abs(minimumSum)>Math.abs(sum))
        {
        minimumSum=sum;
        min_number1=index;
        min_number2=next;
        }
        next++;
      } 
       index++;
     } 
     
      System.out.println("Positive element and Negative element sum is close to 0 : "+array[min_number1]+" + "+array[min_number2]+" = "+minimumSum);
          
 }
}
