package ClassAndObjects;
import java.util.Scanner;
public class Rectangle
{
   private double length;
   private double width;
  Rectangle(double length, double width)
  {
    this.length=length;
    this.width=width;
  }
  public double getArea()
  {
      return length * width ;
  }
  public double getPerimeter()
  {
      return (length*2)+(width*2);
  }
 public static void main(String[]args)
 {
    Scanner scan= new Scanner(System.in);
     
 }
} 
