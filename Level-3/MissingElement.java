import java.util.Scanner;
public class MissingElement
{
 
 public static void main(String []arg)
 {   
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the length of arry: ");
      int length=scan.nextInt();
      int array[]=new int[length];
      System.out.println("Enter the element of arry: ");
       
        for(int index=0;index<length;index++)
        {
         array[index]=scan.nextInt(); 
        } 
          int difference=array[1]-array[0];
          difference=(difference==0)?1:difference;
          int miss=0;
     for(int index=0,value=array[0];index<length;index++,value=value+difference)
     {
        if(value!=array[index])
        {
          miss=value;
          break;
        }
     }
     System.out.println("Missing Element is: "+miss);
     
    
        
 }
}
