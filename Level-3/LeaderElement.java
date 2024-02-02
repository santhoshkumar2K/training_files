public class LeaderElement
{
 
 public static void main(String []arg)
 {   
     int array[]={8,2,1,9,6,4,3,5,2,2};
     int leader=array[array.length-1];
      System.out.print(leader+" ");
     for(int reverseIndex=array.length-1; reverseIndex>=0; reverseIndex--)
     {
      if(leader<array[reverseIndex])
      {
       leader=array[reverseIndex];
       System.out.print(leader+" ");
      }
     } System.out.println();
     
 }
}
