public class ContainsTwoNumber
{
 
 public static void main(String []arg)
 {   
     int []array={0,12,65,17,76,77};
        int number1=65,number2=77;
        
        boolean isThere=false;
       for(int index=0;index<array.length;index++)
        {
           for(int next=index+1;next<array.length;next++)
           {
              if(array[index]==number1 && array[next]==number2)
              {
                isThere=true;
              } 
           }    
        }
         
           System.out.println(isThere);
          
        
 }
}
