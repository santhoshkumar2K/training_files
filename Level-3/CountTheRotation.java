public class CountTheRotation
{
 public static void main(String []arg)
 {   
   int array[]={5,6,7,8,1,2,3,4};
   int small=Integer.MAX_VALUE;int reRotate=0,smallIndex=0;
      for(int index=0;index<array.length;index++)
      {
        if(array[index]<small)
        {
          small=array[index];
          smallIndex=index  ; 
        }
      }
      reRotate=smallIndex;
       System.out.println("no.of rotation : "+reRotate);
     while(reRotate>0)
     { 
        int shift=1;
        int tem=array[0];
       while(shift<=array.length-1)
       {
         array[shift-1]=array[shift];   
         shift++;
       }
       array[array.length-1]=tem;
       reRotate--;
     }
      int index=0;
     while(index<array.length)
     {
      System.out.println(array[index]);
      index++;
     }  
     
     
 }
}
