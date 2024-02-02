import java.util.Scanner;
public class AlphabeticalOrder
{
 public static void find(String []array)
 {
    String temp="";
   for(int index=0;index<array.length;index++)
   {
     for(int next=index+1; next<array.length;next++)
     {  
       if(array[index].compareTo(array[next])>0)
       {
          temp=array[index];
          array[index]=array[next];
          array[next]=temp;
       }
     }  
         System.out.println(" "+array[index]);
   }
 } 
 public static void main(String [] arg)
 {
   Scanner scan= new Scanner(System.in);
      System.out.println("Enter a length of array : ");
   String array[]=new String[scan.nextInt()];
        scan.nextLine();
      System.out.println("Enter the elements: ");
    for(int index=0;index<array.length;index++)
    {
      array[index]=scan.nextLine();
    }
       find(array); 
 }
}
