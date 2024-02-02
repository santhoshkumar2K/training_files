import java.util.Scanner;
public class WaysOfTopLeftTOBottomRight
{
  public static int possibilityWays(int m,int n) {
        int array[][]=new int[m][n];
        for(int row=0;row<m;row++)
        {
         array[row][0]=1;
        }
        for(int column=0;column<n; column++)
        {
         array[0][column]=1;
        }
        
        for(int row=1;row<m;row++)
        {
          for(int column=1;column<n;column++)
          {
           array[row][column]=(array[row-1][column])+(array[row][column-1]);
          }
        }
        
        return array[m-1][n-1];
    }
 public static void main(String []arr)
 {
  Scanner scan= new Scanner(System.in);
  System.out.println("Enter number of M: ");
  int m=scan.nextInt();
  System.out.println("Enter number of N: ");
  int n=scan.nextInt();
  
   System.out.println(possibilityWays(m,n));
 }
}
