package ClassAndObjects;
import java.util.Scanner;
import java.util.Date;
public class Employee
{
   private String name;
   private double salary;
   private Date hireDate;
  Employee(String name,double salary, Date hireDate)
  {
    this.name=name;
    this.salary=salary;
    this.hireDate=(Date)hireDate.clone();
  }
	  public String getName()
	  {
	    return this.name;
	  }
	  public void setName(String name)
	  {
	     this.name=name;
	  }
	  public double getSalary()
	  {
	    return this.salary;
	  }
	  public void setSalary(int salary)
	  {
	     this.salary=salary;
	  }
	  public Date getHireDate()
	  {
	    Date date=(Date)this.hireDate.clone();       
	     return date;
	  }
 public static void main(String[]args)
 {
    Scanner scan= new Scanner(System.in);
     Date d = new Date(10000000);
     Employee e = new Employee("Vdtvb", 24555, d);
     System.out.println(e.getHireDate());
     d.setTime(122345567677889l);
     System.out.println(e.getHireDate());
 }
} 
