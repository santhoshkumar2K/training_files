import java.util.Scanner;
public class DistinctNumber
{
 private static void distinct(int []arr)
 {
       System.out.print("{");
        boolean unique=false;
       for(int index=0;index<arr.length;index++)
       {  
           unique=true;
          for(int next=index+1;next<arr.length;next++)
          {
              if(arr[index]==arr[next])
              {
                  unique=false;
                  arr[next]=-1;
              }      
          }
           if(unique && arr[index]!=-1)
           {
               System.out.print(arr[index]+" ");
           }
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
     distinct(array);
     	
 }
} 
