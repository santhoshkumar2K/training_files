public class AddTwoMatrix
{
 
 public static void main(String []arg)
 {   
      int array1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       int array2[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sumMatrix[][]=new int[array1.length][array1.length];
               
          
     for(int row=0;row<array1.length;row++)
     {
        for(int column=0;column<array1.length;column++)
        {
          sumMatrix[row][column]=array1[row][column]+array2[row][column];
          System.out.print(sumMatrix[row][column]+" ");
         }
         System.out.println();
     }
     
    
        
 }
}
