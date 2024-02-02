/*Develop a program that takes the user's input in meters and converts it to feet, inches, and centimeters.*/
import java.util.Scanner;
public class MeterToInches
{
 public static void main(String []arg)
 {
  Scanner scan= new Scanner(System.in);
     System.out.println("Enter a meter: ");
  int meter=scan.nextInt();
     System.out.println(meter+" to centimeter = "+(meter*100));
     System.out.println(meter+" to inches= "+((meter*100)/2.5));
     System.out.println(meter+" to feet= "+((meter*100)/2.5)/12);
 }
}

