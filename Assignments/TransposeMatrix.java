import java.util.*;
public class TransposeMatrix
{
 public static void transpose(int [][]array, int[][]result)
 {
     for(int row=0; row<array.length; row++)
     {
       for(int column=0; column<array[0].length; column++)
       {
         result[row][column]=array[column][row];
          System.out.print(result[row][column]+" ");
       }
          System.out.println();
     } 
 }
 public static int[][] matrixDeclare(Scanner scan)
 {
          System.out.println("Enter a length of row : "); 
     int rowLength=scan.nextInt();
          System.out.println("Enter a length of column : "); 
     int columnLength=scan.nextInt();
     int matrix[][]=new int[rowLength][columnLength];
     for(int row=0; row<rowLength; row++)
     {
         System.out.println("Enter row"+(row+1)+" : "); 
       for(int column=0;column<columnLength;column++)
       { 
         matrix[row][column]=scan.nextInt();  
       } 
     } 
     return matrix;
  }
 public static void main(String []arg)
 {   
     Scanner scan= new Scanner(System.in);
     int array[][]=matrixDeclare(scan);
         System.out.println("Please declare second matrix: ");  
     int result[][]=new int[array.length][array[0].length];
      transpose(array ,result);  
 }
}
