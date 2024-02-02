import java.util.*;
public class Staircase
{
 public static int solution(int number, int[] X) 
 {
        int[] base = new int[number + 1];
        base[0] = 1;
        base[1] = 1;
        System.out.println(Arrays.toString(base));
        return noOfWays(number, X, base);
 }

  public static int noOfWays(int number, int[] X, int[] base)
  {
        if (base[number] != 0) 
        {
            return base[number];
        }
        int ways = 0;
        for (int index = 0; index < X.length && (number - X[index] >= 0); index++) 
        {
            base[number - X[index]]  =   noOfWays(number- X[index], X, base);
              ways += base[number - X[index]];
            
             System.out.println(Arrays.toString(base));
        }
        return ways;

    }

   public static void main(String[] args) {
   
   Scanner scan= new Scanner(System.in);
    System.out.println("Enter no.of steps: ");
     String steps=scan.nextLine();
       int length=steps.length();
         int[] X = new int[length];
         for(int i=0;i<X.length;i++)
         {
           X[i]=Integer.parseInt(steps.charAt(i)+"");
         }
       System.out.println("Enter number: "); 
          int N = scan.nextInt();
            int result = solution(N, X);
             System.out.println(result);

       
    }

   
}
