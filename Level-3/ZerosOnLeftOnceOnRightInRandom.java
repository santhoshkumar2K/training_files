public class ZerosOnLeftOnceOnRightInRandom
{
 public static void zeroAtend(int []array)
 {
 int index=0;
    for(int zero=0;zero<array.length;zero++)
    {
      if(array[zero]!=1)
      {
        array[index]=array[zero];
        index++;
      }
    }
    for(int number=index;number<array.length;number++)
    {
     array[number]=1;
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
