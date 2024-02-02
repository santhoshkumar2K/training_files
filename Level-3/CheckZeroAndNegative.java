public class CheckZeroAndNegative
{
 
 public static void main(String []arg)
 {   
     int []array={1,2,-2,-1,9,7,3,4,5,6,6};
     boolean isThere=false;
       for(int index=0;index<array.length;index++)
        {
        
           if(array[index]==0 || array[index]==-1)
           {
            isThere=true;
            break;
           }
        }
     
      System.out.println(isThere);
    
        
 }
}
