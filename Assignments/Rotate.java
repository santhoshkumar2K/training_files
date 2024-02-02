import java.util.*;
public class Rotate
{
 public static void rotate(int []array, int number)
  {
    int temp=0;
    for(int rotate=1;rotate<=number;rotate++)
    {
        temp=array[array.length-1];
          for(int index=array.length-1;index>0;index--)
          {
             array[index]=array[index-1];
          }
        array[0]=temp;  
    }
    System.out.println(Arrays.toString(array));
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
        System.out.println("Enter the no.of rotation: "); 
     int number=scan.nextInt();
     rotate(array, number);  
 }
}
