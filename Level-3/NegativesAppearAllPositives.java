public class NegativesAppearAllPositives
{
 
 public static void main(String []arg)
 {   
      int array[]={3,6,4,-1,-5,7,0,2,9,-39,-5,-5,2};
              
               
       int temp=0,shift=0;
     for(int index=0;index<array.length;index++)
     {
         if(array[index]<0)
          {
             temp=array[index];
             for(shift=index-1; shift>=0; shift--)
             {
               array[shift+1]=array[shift];
             }
             array[shift+1]=temp;
          }
           
     }
     
   for(int index=0; index<array.length;index++)
      {
        System.out.println(array[index]);
      }  
        
 }
}
