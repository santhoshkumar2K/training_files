/*Build a program that sorts an array of strings in alphabetical order using the bubble sort algorithm.*/
import java.util.Scanner;
public class Sort
{
 public static void sort(String []array)
 {
  String temp="";
  for(int index=0;index<array.length;index++)
  {
    for(int next=index+1;next<array.length; next++)
    {
      if(array[index].compareTo(array[next])>0)
      {
        temp=array[index];
        array[index]=array[next];
        array[next]=temp;
      } 
    }
      System.out.println(array[index]);
  }
 
 }
 public static void main(String []arg)
 {
  Scanner scan= new Scanner(System.in);
     System.out.println("Enter a length: ");
  int length=scan.nextInt();
    scan.nextLine();
  String array[]=new String[length];
  for(int index=0;index<length; index++)
  {   
    array[index]=scan.nextLine(); 
  }  
    sort(array);
 }
}

