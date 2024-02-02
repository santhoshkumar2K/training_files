import java.util.Date;
public class Vehicle
{
    private String make;
    private String model;
    private Date year;
  Vehicle(String make,String model,int year,int month,int date)
  {
     this.make=make;
     this.model=model;
     this.year=new Date((year-1900),month-1,date);
  }
	  public String getMake()
	  {
	    return this.make;
	  }
	  public String getModel()
	  {
	    return this.model;
	  }
	  public Date getYear()
	  {
	   Date yr=(Date)this.year.clone();
	    return yr;
	  }
 public static void main(String[]arg)
 {
    Car pmw= new Car("India","pmw",2020,3,21,"red",5);
    
 }
}
class Car extends Vehicle
{
    private String color;
    private int numDoors;
  Car(String make,String model,int year,int month,int date,String color,int numDoors)
  {
      super(make,model,year,month,date);
        this.color=color;
        this.numDoors=numDoors;
  }
	  public String getColor()
	  {
	    return this.color;
	  }
	  public void setColor(String color)
	  {
	     this.color=color;
	  }
	  public int getNumDoors()
	  {
	    return this.numDoors;
	  }
}
