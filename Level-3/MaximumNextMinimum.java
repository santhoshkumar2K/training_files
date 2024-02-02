public class MaximumNextMinimum
{
 
 public static void main(String []arg)
 {   
      int array[]={1,2,3,4,5,6};
              
               
       int temp=0;
     for(int index=0;index<array.length;index++)
     {
         if(index%2==0)
          {
              temp=array[array.length-1];
            for(int shift=array.length-1;shift>index;shift--)
            {
             array[shift]=array[shift-1];
            }
            array[index]=temp;  
          }
           
     }
      
      for(int index=0; index<array.length;index++)
      {
        System.out.println(array[index]);
      } 
        
 }
}
