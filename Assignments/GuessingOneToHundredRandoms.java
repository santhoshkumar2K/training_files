import java.util.*;
public class GuessingOneToHundredRandoms
{
 public static void main(String [] arg)
 {
   Random random= new Random();
       int randomNumber=random.nextInt(100)+1; 
   Scanner scan= new Scanner(System.in);
     System.out.println("Enter your guessing between 1 to 100 : ");
       int guess=scan.nextInt(); 
       int count=1;
   while(guess!=randomNumber)
   {
       if(guess>randomNumber)
      {
        System.out.println("Your guess is too high! ");
         guess=scan.nextInt();  
          count++;
      }else
      {
        System.out.println("Your guess is too low! ");
         guess=scan.nextInt();  
          count++;
      }
   }
   System.out.println("Your correct.."+count+" Time guessings");
 }
}
