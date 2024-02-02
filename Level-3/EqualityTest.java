public class EqualityTest
{
 public static void equals(int arr1[],int arr2[])
 {
   if(arr1.length!=arr2.length)
   {
     System.out.println("Both are not same! ");
   }else
   {
         int count=0;
     for(int index=0;index<arr1.length;index++)
     {
       if(arr1[index]==arr2[index])
       {
        count++;
       }
     }
     if(count==arr1.length)
     {
       System.out.println("Both are Same .");
     }else
     {
       System.out.println("Both are not Same!");
     }
   }
 }
 public static void main(String []arg)
 {   
     int array1[]={1,3,5,7,9};
     int array2[]={2,1,3,8,0};
     int array3[]={1,3,5,7,9,0};
     int array4[]={1,3,5,7,9};
     
   equals(array1,array4);

        
 }
}
