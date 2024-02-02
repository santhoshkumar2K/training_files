public class ZerosOnLeftOnceOnRight
{
 public static void zeroAtend(int []array)
 {
 int index=0;
    for(int number=0;number<array.length;number++)
    {
      if(array[number]!=1)
      {
        array[index]=array[number];
        index++;
      }
    }
    for(int zero=index;zero<array.length;zero++)
    {
     array[zero]=1;
    }
 }
 public static void main(String []arg)
 {   
   int array[]={0,1,1,0,0,0,1,1,1,0,1,0};
   zeroAtend(array);
   //display...
      for(int index=0;index<array.length;index++)
      {
       System.out.println(array[index]);
      }
    
     
    
        
 }
} 
