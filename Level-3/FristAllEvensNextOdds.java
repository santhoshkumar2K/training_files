public class FristAllEvensNextOdds
{
 public static void shift(int []array)
 {
 int temp=0,count=0;
      for(int i=0;i<array.length;i++)
      {
        if(array[i]%2==0){
          count++;
        } 
      }  
 
    for(int index=0;index<count;)
    {
      if(array[index]%2==1)
      {
         temp=array[index];
        for(int shift=index; shift<array.length-1; shift++)
        {
          array[shift]=array[shift+1];
        }
        array[array.length-1]=temp;
        index=index;
      }else{
      index++;
      }
      
    }
 }
 public static void main(String []arg)
 {   
   int array[]={1,5,2,8,7,5,3,0,8,9,6,4,11};
   shift(array);
   //display...
      for(int index=0;index<array.length;index++)
      {
       System.out.println(array[index]);
      }   
 }
} 
