import java.util.Scanner;
import java.util.Arrays;
public  class BinarySearch
{  
  
public static  boolean binarySearch(int [] array,int target)
{
    
   int min=0, max= array.length-1, mid=0;
   while(min<=max)
   {
     mid=(max+min)/2;                               
      
       if(array[mid]<target)
       {
          min=mid+1;
       }else if(array[mid]>target)
       {
         max=mid-1;
       }else
       {
         return true;
       }
       
   }
   return false;
} 
public static void main(String[]arg)
{ 
   Scanner scan= new Scanner(System.in);
   try
   {
     System.out.println("enter a length of array:");
	   int length=scan.nextInt();
	   int[] array=new int[length];
	    for(int index=0;index<array.length;index++)
	    { 
	      System.out.println("enter a element of array:");  
	      array[index]=scan.nextInt();
	    } 
     System.out.println("enter a search element:");
          int target= scan.nextInt();
       Arrays.sort(array);         System.out.println(Arrays.toString(array));
     System.out.println((binarySearch(array,target))?" Yes ":" No ");
   }catch(java.util.InputMismatchException obj)
   {
        System.out.println("                It is wrong input!..");
	      main(arg);
	      return;
   } 
   finally{ 
       scan.close();
       }
}
}

