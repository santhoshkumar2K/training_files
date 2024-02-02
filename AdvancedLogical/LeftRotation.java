import java.util.Scanner;
public class LeftRotation
{
 public static void main(String []arg)
 {   
   int array[]={1,2,3,4,5};
      Scanner scan=new Scanner(System.in);
    System.out.println("Enter the no.of Rotation in clockwise: ");
      int rotate=scan.nextInt();
      
     while(rotate>0)
     { 
        int tem=array[0];
        int shift=1;
       while(shift<array.length)
       {
         array[shift-1]=array[shift];   
         shift++;
       }
       array[array.length-1]=tem;
       rotate--;
     }
      int index=0;
     while(index<array.length)
     {
      System.out.print(array[index]+" ");
      index++;
     }  System.out.println();
     
     
 }
}
