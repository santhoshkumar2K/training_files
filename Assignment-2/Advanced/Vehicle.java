public abstract class Vehicle
{ 
  int numOfWeels;
  boolean gear; 
   Vehicle()
   {
   }
   Vehicle(int weels,boolean gear)
   {
     this.numOfWeels=weels;
     this.gear=gear;
   }
   public void usage()
   {
      System.out.println("It is used to reduce travelling time.");
   }
   public abstract void fuelType();
   public abstract void mileage();
   
 public static void main(String[]arg)
 {
    Bike splendor= new Bike(2,2,true);
    splendor.fuelType();
 }
}
class Bike extends Vehicle
{
  int numOfSeats;
  Bike(int seats,int weels,boolean gear)
  {
     super(weels,gear);
     this.numOfSeats=seats;
  }
  public void fuelType()
  {
     System.out.println("petrol");
  }
  public void mileage()
  {
     System.out.println("97.2 cc");
  }
  
}
