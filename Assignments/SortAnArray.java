import java.util.*;
public class SortAnArray
{
 public static void sort(int []array, boolean order)
  {
    int temp=0;
    for(int index=0;index<array.length;index++)
    {
        for(int next=index+1;next<array.length;next++)
        {
          if(order)
          {
              if(array[index]>array[next])
              {
                temp=array[index];
                array[index]=array[next];
                array[next]=temp;
              }
          }else
          {    
              if(array[index]<array[next])
              {
                temp=array[index];
                array[index]=array[next];
                array[next]=temp;
              }
          }
        }
         System.out.print(array[index]+" ");
    }
 }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
        System.out.println("Enter a length of array : "); 
     int length=scan.nextInt();
     int array[]=new int[length];
     for(int index=0; index<length; index++)
     {
       System.out.println("Enter the element : "); 
      array[index]=scan.nextInt();  
     }
       System.out.println("Enter the Order(ascending = true or descending = false)");
     boolean order=scan.nextBoolean();
         sort(array, order);  
 }
}
