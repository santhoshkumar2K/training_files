public class Shape
{
   private int numSides;
   private double area;
  Shape(int numSides,double area)
  {
   this.numSides=numSides;
   this.area=area;
  }
	  public int getNumSides()
	  {
	    return this.numSides;
	  }
	  public double getArea()
	  {
	    return this.area;
	  }
 public static void main(String[]arg)
 {
     Rectangle dsec= new Rectangle(4,2,4);
     System.out.println(d.getArea());
 }
}
class Rectangle extends Shape
{
   private double length;
   private double width;
  Rectangle(int numSides,double length,double width)
  {
      super(numSides,length*width);
        this.length=length;
        this.width=width;
  }
	  public double getLength()
	  {
	    return this.length;
	  }
	  public void setLength(double length)
	  {
	     this.length=length;
	  }
	  public double getWidth()
	  {
	    return this.width;
	  }
	  public void setWidth(double width)
	  {
	     this.width=width;
	  }
}
