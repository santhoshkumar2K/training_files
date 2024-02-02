import java.util.Scanner;
public class FindThePairOfSumInRotatedArray
{
 public static void sumOfPair(int []array,int value,int maxIndex,int smallIndex)
 {
    int sum=0;
    while(maxIndex != smallIndex)
    {
      sum=array[maxIndex]+array[smallIndex];
      
      if(sum==value)
      {
        System.out.println(" Sum of pair is "+array[maxIndex]+" + "+array[smallIndex]+" = "+(sum));
        break;
      }else if(sum>value)
      {
        maxIndex=(maxIndex==0)?array.length-1:maxIndex-1;
      }else
      {
       smallIndex=(smallIndex==array.length-1)?0:smallIndex+1;
      }
    }
    
  }
   
 public static void main(String []arg)
 {   
   int array[]={11,15,26,38,9,10};
   Scanner scan= new Scanner(System.in);
   System.out.println("Enter specified Number: ");
   int number=scan.nextInt();
      int index=0;
     while(index<array.length-1)
     {
      if(array[index]>array[index+1])
      {
      break;
      }
      index++;
     } 
   sumOfPair(array,number,index,index+1);
  
 }
} 
