public class Person
{
   private String name;
   private int age;
   private Address address;
  Person(String name,int age,int doorNo, String street, String city)
  {
       this.name=name;
       this.age=age;
       this.address= new Address(doorNo,street,city);
  }
		  public String getName()
		  {
		    return this.name;
		  }
		  public void setName(String name)
		  {
		    this.name=name;
		  }
		  public int getAge()
		  {
		    return this.age;
		  }
		  public void setAge(int age)
		  {
		    this.age=age;
		  }
		  public Address getAddress()
		  {  
		     return new Address(this.address.getDoorNo(),this.address.getStreet(),this.address.getCity());
		  }
		   public void setAddress(int doorNo, String street, String city)
		  {
		       this.address.setDoorNo(doorNo);
		       this.address.setStreet(street);
		       this.address.setCity(city);
		  }
 public static void main(String[]arg)
 {
    Student mani= new Student("mani",21,144,"east","srivi",5,"cms");
    Address address=mani.getAddress();
    System.out.println(address.getStreet());
     
 }
}
class Student extends Person
{
       private int grade;
       private String school;
  Student(String name,int age,int doorNo, String street, String city,int grade,String school)
  {
      super(name,age,doorNo,street,city);
        this.grade=grade;
        this.school=school;
  }
	  public int getGrade()
	  {
	    return this.grade;
	  }
	  public void setGrade(int grade)
	  {
	    this.grade=grade;
	  }
	  public String getSchool()
	  {
	    return this.school;
	  }
	  public void setSchool(String school)
	  {
	    this.school=school;
	  }
}
class Address{
     private  int doorNo;
     private String street;
     private String city;
    Address(int doorNo,String street,String city)
    {
        this.doorNo=doorNo;
        this.street=street;
        this.city=city;
    }
	  public int getDoorNo()
	  {
	      return this.doorNo;
	  }
	  public void setDoorNo(int doorNo)
	  {
	    this.doorNo=doorNo;    
	  }
	  public String getStreet()
	  {
	      return this.street;
	  }
	  public void setStreet(String street)
	  {
	    this.street=street;    
	  }
	  public String getCity()
	  {
	      return this.city;
	  }
	  public void setCity(String city)
	  {
	    this.city=city;    
	  }
}    


