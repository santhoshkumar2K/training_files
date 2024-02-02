import java.util.*;
public class CommonElements
{
 public static void commonElements(int []array1, int [] array2)
 {
   int min[]=null;
   int max[]= null;
   if(array1.length>array2.length){
          max=array1;
          min=array2;
   }else{
       max=array2;
       min=array1;
   }    
     for(int index=0; index<max.length; index++)
     {
       for(int next=0; next<min.length; next++)
       {
        if(max[index]==min[next])
        {
          System.out.println("Common element is: "+min[next]);
          break;
        }
       }
     } 
 }
 public static int[] arrayDeclare(Scanner scan)
 {
         System.out.println("Enter a length of array : "); 
     int length=scan.nextInt();
     int array[]=new int[length];
     for(int index=0; index<length; index++)
     {
        System.out.println("Enter the element : "); 
      array[index]=scan.nextInt();  
     } 
     return array;
  }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
     int array1[]=arrayDeclare(scan);
       System.out.println("Please declare second array: ");  
     int array2[]=arrayDeclare(scan);
     commonElements(array1, array2);  
 }
}
