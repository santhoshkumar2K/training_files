public class ArrayBecomesDecreasingOrder
{
  public static boolean checkPossibility(int[] nums) {
        int count=0;int checkIndex=0;
         for(int in =nums.length-1; in >0; in--)
         {
            if(nums[in]<nums[in-1])
            {
              count++;
              checkIndex=in-1;
            }
         }
        return (count==1)?(checkIndex==0)?true:(nums[checkIndex-1]>1)?false:true:false;
    }
 public static void main(String []arr)
 {
  int array[]={10,5,1};
   System.out.println((checkPossibility(array))?" yes ":" No ");
 }
}
