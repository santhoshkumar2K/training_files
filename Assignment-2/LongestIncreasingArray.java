import java.util.Scanner;
public class LongestIncreasingArray
{
 private static void subArray(int [] arr)
 {
        int count=0,end=0, max=0, start=0;
       for(int index=0;index<arr.length-1;index++)
       {    
            
              if(arr[index]<arr[index+1])
              {
                  count++;
              }else{
                  if(max<count)
                  {
                      max=count;
                      start=end;
                      end=index;
                  }
                  count=0;
              }
         
       }
       if(end==0)
       {
         end=arr.length-1;
       }
       display(start,end,arr);
 }
 private static void display(int start,int end,int []arr)
 {
        System.out.print("{");
        for(int i=start; i<=end;i++)
        {
            System.out.print((i==end)?arr[i]+"":arr[i]+" ,");
        }
        System.out.print("}");
  }  
 public static void main(String[]args)
 {
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter a length of array: ");
    int []array=new int[scan.nextInt()];
     for(int i=0;i<array.length;i++)
     {
        System.out.println("Enter "+i+" th element: ");
        array[i]=scan.nextInt();
     }
      subArray(array);
 }
} 
