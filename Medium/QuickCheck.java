import java.util.Scanner;
public class QuickCheck
{
 public static boolean quickSearch(int []array,int target)
 {
   int minimum=0, maximum=array.length-1;
  while(minimum<=maximum) 
  {
     int avg=(minimum+maximum)/2;
    if(array[avg]==target)
    {
      return true;
    }else if(array[avg]>target)
    {
      maximum=avg-1;
    }else
    {
     minimum=avg+1;
    }
  } 
  return false; 
 }
public static void main(String []  arr)
{
  int array[]={1,2,3,4,5,6,7,8};
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter your target value:  ");
    int target=scan.nextInt();
    
   System.out.println((quickSearch(array,target))?"Yes ":" No"); 
    
  
}
}
