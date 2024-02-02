public class FindTargetValue
{
 public static void targetValue(int []arr,int value)
{  
        int temp;
   for(int index=0;index<arr.length;index++)
   {
     for(int next=index+1;next<arr.length;next++)
     {
        if(arr[index]+arr[next]==value)
        {
          System.out.println(arr[index]+" + "+arr[next]+" = "+(arr[index]+arr[next]));
        }   
     }    
   }
       
 }
 public static void main(String []arg)
 {   
      int []array={1,3,4,2,8,9,5,7,11,10,12};
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter a target value: ");
      int target=scan.nextInt();
      targetValue(array,target);
      
           
 }
}
