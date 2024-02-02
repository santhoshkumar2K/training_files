import java.util.Scanner;
public class SumOfPairs
{
 
 public static void main(String []arg)
 {   
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the length of arry: ");
      int length=scan.nextInt();
      int array[]=new int[length];
      System.out.println("Enter the element of arry: ");
        for(int index=0;index<length;index++)
        {
         array[index]=scan.nextInt();
        } 
        
     for(int index=0;index<length;index++)
     {
        for(int next=index+1;next<length;next++)
        {
          if(input==array[index]+array[next])
          {
            System.out.println("Sum of this pair is equal : "+array[index]+" + "+array[next]);
          }
        }
     }
     
    
        
 }
}
