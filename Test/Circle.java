/*Build a program that calculates the area of a circle, given the radius entered by the user.*/
import java.util.Scanner;
public class Circle
{
 public static void main(String []arg)
 {
  Scanner scan= new Scanner(System.in);
     System.out.println("Enter a Radius: ");
  int radius=scan.nextInt();
     System.out.println("Circle: "+(2*22/7*radius));
 }
}

