public class NumberOfEvenAndOdds
{
 
 public static void main(String []arg)
 {   
     int []array={1,2,9,7,3,4,5,6,0};
    
      int odd=0;
      int even=0;
   
      for(int index=0;index<array.length;index++)
      {
        if(array[index]%2==0)
        {
          even++;
        }else
        {
         odd++;
        }
      }
    System.out.println("no.of Even numbers : "+even+"\n no.of Odd numbers: "+odd);
     
    
        
 }
}
