import java.util.Scanner;
public class SpiralPrint {
  
 public static void print(int array[][])
 {
   int maxRow=array.length-1,  maxCol=array.length-1;
   int minRow=0,  minCol=0, count=0;
   while(count<(array.length*array.length))
   {
    for(int column=minCol;column<=maxCol;column++)
    {
      System.out.println(array[minRow][column]);
      count++;
    }
    for(int row=minRow+1;row<=maxRow;row++)
    {
     System.out.println(array[row][maxCol]);
     count++;
    }
    for(int column=maxCol-1;column>=minCol;column--)
    {
     System.out.println(array[maxRow][column]);
     count++;
    }
    for(int row=maxRow-1;row>=minRow+1;row--)
    {
     System.out.println(array[row][minCol]);
     count++;
    }
    maxRow--; maxCol--; minRow++; minCol++;
   }
 }
  public static void main(String args[]) {
  
  Scanner scan= new Scanner(System.in);
    System.out.println("Enter no.of row : ");  
    int noOfRow =scan.nextInt(); 
     System.out.println("Enter no.of column : ");   
    int noOfColumn=scan.nextInt();
      int array[][]=new int[noOfRow][noOfColumn]; 
  
  for(int row=0;row<array.length;row++)
      {
        for(int col=0;col<array.length;col++)
        {
         System.out.println("Enter the elements of array: ");
         array[row][col]=scan.nextInt();
        }
         System.out.println();
      } 
     print(array);
  }
}
