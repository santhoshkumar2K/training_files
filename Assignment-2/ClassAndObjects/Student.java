package ClassAndObjects;
import java.util.Scanner;
public class Student
{
  private String name;
  private int age;
  private int grade;
  Student(String name, int age,int grade)
  {
    this.name=name;
    this.age=age;
    this.grade=grade;
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
	  public int getGrade()
	  {
	    return this.grade;
	  }
	  public void setGrade(int grade)
	  {
	     this.grade=grade;
	  }
 public static void main(String[]args)
 {
    Scanner scan= new Scanner(System.in);
     
 }
} 
