public class CombinationOfFourElement
{
 public static void targetValue(int []arr,int value)
{  
       
   for(int index=0;index<arr.length;index++)
   {
     for(int next1=index+1;next1<arr.length;next1++)
     {
      for(int next2=next1+1; next2<arr.length; next2++)
      {
       for(int next3=next2+1;next3<arr.length;next3++)
       {
       
         if(arr[index]+arr[next1]+arr[next2]+arr[next3]==value)
         {
          System.out.println(arr[index]+" + "+arr[next1]+" + "+arr[next2]+" + "+arr[next3]+" = "+(arr[index]+arr[next1]+arr[next2]+arr[next3]));
         }
       }
      }     
     }    
   }
       
 }
 public static void main(String []arg)
 {   
      int []array={1,3,4,2,8,9,1,2,5,7,10};
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter a target value: ");
      int target=scan.nextInt();
      targetValue(array,target);
      
           
 }
}
