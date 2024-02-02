public class ZerosAtEnd
{
 
 public static void main(String []arg)
 {   
     int []array={0,1,2,0,0,3,0,0,0,4,5,6,0};
     int temp; 
   for(int check=0;check<2;check++)
   {
     for(int checkIndex=0; checkIndex<array.length; checkIndex++ )
     {  
        if(array[checkIndex]==0)
        {
          for(int next=checkIndex; next<array.length-1; next++)
          {
           temp=array[next];
           array[next]=array[next+1];
           array[next+1]=temp;
          }
        }
         
      } 
     }
      
      for(int index=0;index<array.length;index++)
      {
       System.out.println(array[index]);
      }
 }
} 
