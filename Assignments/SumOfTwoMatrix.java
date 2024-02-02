import java.util.*;
public class SumOfTwoMatrix
{
 public static void sum(int [][]array1, int[][] array2,int[][]result)
 {
     for(int row=0; row<array1.length; row++)
     {
       for(int column=0; column<array1[0].length; column++)
       {
         result[row][column]=array1[row][column]+array2[row][column];
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
     int array1[][]=matrixDeclare(scan);
         System.out.println("Please declare second matrix: ");  
     int array2[][]=matrixDeclare(scan);
     int result[][]=new int[array1.length][array1[0].length];
      sum(array1, array2, result);  
 }
}
