public class CommonOfThreeSorted
{
 
 public static void main(String []arg)
 {   
     int []array1={1,2,3,4,5,6};
     int []array2={1,2,3,8};
     int []array3={1,3,8};
     for(int index1=0,index2=0,index3=0;index1<array1.length && index2<array2.length && index3<array3.length;)
     {
        if(array1[index1]==array2[index2] && array2[index2]==array3[index3])
        {
            System.out.println("Common Element is: "+array1[index1]);
            index1++;
            index2++;
            index3++;
        }else if(array1[index1]>array2[index2])
        {
         index2++;
        }else if(array1[index1]>array3[index3])
        {
         index3++;
        }else
        {
         index1++;
        }
     }
      
 }
}
