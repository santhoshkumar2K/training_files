import java.util.Scanner;
class LeapYear
{

public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter Year: ");
  int year=scan.nextInt();
      
      String nameOfYear=(year%4==0)?" is a Leap year":" is a Normal Year";
           System.out.println(year+nameOfYear);
  
 }
}
