import java.util.Scanner;
public class CyclicallyRotate
{
 public static void main(String []arg)
 {   
   int array[]={1,2,3,4,5};
      Scanner scan=new Scanner(System.in);
    System.out.println("Enter the no.of Rotation in clockwise: ");
      int rotate=scan.nextInt();
      
     while(rotate>0)
     { 
        int tem=array[array.length-1];
        int shift=array.length-2;
       while(shift>=0)
       {
         array[shift+1]=array[shift];   
         shift--;
       }
       array[0]=tem;
       rotate--;
     }
      int index=0;
     while(index<array.length)
     {
      System.out.println(array[index]);
      index++;
     }  
     
     
 }
}
