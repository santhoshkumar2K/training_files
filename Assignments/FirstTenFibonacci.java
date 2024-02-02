public class FirstTenFibonacci
{
 public static void fibonacci(int number)
 {
   int first=1,second=1,sum=0;
    for(int index=1;index<=number;index++)
    {
      if(index==1)
      {
       sum=1; 
      }else
      {
        sum=first+second;
         second=first;
          first=sum;
      }    
           System.out.println(sum);
    }
 } 
 public static void main(String [] arg)
 {
   int number=10; 
   fibonacci(number); 
 }
}
