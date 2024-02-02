import java.util.*;
public class Car
{
 String carName;
 String carNo;
 String carColor;
 String fuelType;
 double mileage;
 double price;
 int seatCapacity;
 int tankCapacity;
Car(String carName, String carNo, String carColor, String fuelType, double mileage, double price,int seatCapacity, int tankCapacity)
{
    this.carName=carName;
    this.carNo=carNo;
    this.carColor=carColor;
    this.fuelType=fuelType;
    this.mileage=mileage;
    this.price=price;
    this.seatCapacity=seatCapacity;
    this.tankCapacity=tankCapacity;
}
private void carDetails()
{
 System.out.println("------------------------------CAR---------------------------------------");
 System.out.println("Modal :"+this.carName+"\n Mileage :"+this.mileage+"\n Fuel type: "+this.fuelType+"\n Color"+this.carColor+"\n Price :$"+this.price);
 System.out.println("------------------------------------------------------------------------");
} 
private static void tankCapacity(ArrayList<Car>cars)
{
  for(Car car: cars)
  {
    System.out.println("Modal :"+car.carName+"\n  Mileage :"+car.mileage+"\n  Fuel type: "+car.fuelType+"\n  Tank size: "+car.tankCapacity);
  }
}
 public static void main(String []arg )
 {
 Scanner scan = new Scanner(System.in); 
  Car marutiGrandVitara =new Car("Maruti Grand Vitara","2000","Blue","Petrol/CNG",19.38,10_70_000,5,48);
  Car HyundaiAura       =new Car("Hyundai Aura ","1928","Red","Petrol",28.00,19_45_000,6,60);
  Car ToyotaUrban       =new Car("Toyota Urban","1091","OliveGreen","Petrol",20.38,8_23_000,5,44);
  Car MarutiSuzuki      =new Car("Maruti Suzuki","5687","Gray","Petrol/CNG",19.38,5_80_000,4,50);
  Car Ferrari           =new Car("Ferrari","1990","Block","Petrol",18.57,20_60_000,7,60);
  Car TataPunchCNG      =new Car("Tata Punch CNG","3436","White","CNG",16.38,11_78_000,6,40);
    ArrayList<Car> cars= new ArrayList<Car>();
    cars.add(marutiGrandVitara);
    cars.add(HyundaiAura  );
    cars.add(ToyotaUrban );
    cars.add( MarutiSuzuki);
    cars.add( Ferrari );
    cars.add(TataPunchCNG );
     tankCapacity(cars);
 }
}
