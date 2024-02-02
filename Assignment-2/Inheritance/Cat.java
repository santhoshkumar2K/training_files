public class Cat extends Animal
{
  private String color;
  private int numLives;
  Cat(String name ,int age, String species,String color,int numLives)
  {
     super(name,age,species);
      this.color=color;
      this.numLives=numLives;
  }
	  public String getColor()
	  {
	      return this.color;
	  }
	  public int getColor()
	  {
	      return this.numLives;
	  }
public static void main(String[]arg)
{
  Cat c= new Cat("Dora",4,"cat","white",9);
  System.out.println(c.getAge());
}
}
