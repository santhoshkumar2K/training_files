import java.util.*;
public class CompatibleDimensions
{
 public static void sum(int [][]array1, int[][] array2,int[][]result)
 {
     for(int row=0; row<array1.length; row++)
     {
       for(int column=0; column<array2[0].length; column++)
       {
         for(int cross=0;cross<array2.length;cross++)
         {
            result[row][column]=result[row][column]+array1[row][cross]*array2[cross][column];
         } 
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
     int result[][]=new int[array1.length][array2[0].length];
     if(array1[0].length == array2.length)
     {
      sum(array1, array2, result);  
     }else
     {
      System.err.println("Please check no.of column of array-1 must be same as no.of row of array-2..");
     } 
 }
}
