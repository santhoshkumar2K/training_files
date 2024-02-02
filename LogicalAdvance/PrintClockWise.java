import java.util.Scanner;
public class PrintClockWise
{
  public static void clockWise(int[][]nums,int rowNo,int columnNo)
  {
       
      int minRow=0, minCol=0, maxRow=rowNo-1, maxCol=columnNo-1;
       int count=0, length=rowNo*columnNo;
    while(count<length)
    {   
       for(int column=minCol;column<=maxCol;column++)
       {
        System.out.println(nums[minRow][column]);
        count++;
       } 
       for(int row=minRow+1;row<=maxRow;row++)
       {
        System.out.println(nums[row][maxCol]);
        count++;
       } 
       for(int column=maxCol-1;column>=minCol;column--)
       {
        System.out.println(nums[maxRow][column]);
        count++;
       } 
       for(int row=maxRow-1;row>=minRow+1;row--)
       {
        System.out.println(nums[row][minCol]);
        count++;
       } 
        minRow++;minCol++;maxRow--;maxCol--;
    }    
  }
 public static void main(String []arr)
 {
  Scanner scan= new Scanner(System.in);
  System.out.println("Enter number of row: ");
  int row=scan.nextInt();
  System.out.println("Enter number of columr: ");
  int column=scan.nextInt();
  int matrix[][]=new int [row][column];
   for(int rowIndex=0; rowIndex < row; rowIndex++)
   {
       for(int columnIndex=0; columnIndex < column; columnIndex++)
       {
            System.out.println("Enter element : ");
         matrix[rowIndex][columnIndex]=scan.nextInt();
       }  
   } 
     clockWise(matrix,row,column);
 
 }
 }
