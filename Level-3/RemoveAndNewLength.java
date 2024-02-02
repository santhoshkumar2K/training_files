public class RemoveAndNewLength
{
 public static int duplicate(int []arr)
{
     int newLength=arr.length;
   for(int index=0; index<arr.length; index++)
   {
     for(int next=index+1; next<arr.length; next++)
     {
       if( arr[index]!=-1 && arr[index]==arr[next])
       {
         arr[next]=-1;  
       }
     }
     if(arr[index]==-1)
     { 
      for(int shift=index;shift<arr.length-1;shift++)
      {
       arr[shift]=arr[shift+1];
       arr[arr.length-1]=0;
      }
      newLength--;
     }
   }
    return newLength;
 }
 public static void main(String []arg)
 {   
      int []array={1,2,9,3,4,3,5,6,1,2,1,1,1,8,1,1,2,0};
       
    System.out.println("New length of Unique Array: "+duplicate(array));
 }
}
