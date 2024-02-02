public class Shape
{
	  public void draw()
	  {
	    System.out.println("\"Drawing a shape\"");
	  }
public static void main(String[]arg)
{
  Rectangle rect= new Rectangle();
  rect.draw();
  Circle circle= new Circle();
  circle.draw();
  
}
}
class Rectangle extends Shape
{
	  public void draw()
	  {
	    System.out.println("\"Drawing a rectangle\"");
	  }
}
class Circle extends Shape
{
	  public void draw()
	  {
	    System.out.println("\"Drawing a circle\"");
	  }
}
