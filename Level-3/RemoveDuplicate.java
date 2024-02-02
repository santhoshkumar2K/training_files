
public class RemoveDuplicate
{
 
 public static void main(String []arg)
 {   
      int array[]={1,2,1,2,3,1,5,5,6,8,6,4,5};
      
       
   
        array[array.length-1]=0;
     for(int index=0;index<array.length;index++)
     {
        for(int next=index+1;next<array.length;next++)
        {
          if(array[index]==array[next])
          {
            for(int shift=next;shift<array.length-1;shift++ )
             {
                   array[shift]=array[shift+1] ;
             }
           }
         }
     }
     //display......
     for(int index=0;index<array.length;index++)
     {
     System.out.println(array[index]);
     }
        
      
      
 }
}
