public class Animal
{
    private String name;
    private int age;
    private String species;
  Animal(String name,int age,String species)
  {
   this.name=name;
   this.age=age;
   this.species=species;
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
	  public String getSpecies()
	  {
	    return this.species;
	  }
 public static void main(String[]arg)
 {
    Dog d= new Dog("subramani","poppy","rr","red",34);
     System.out.println(d.getAge());
 }
}
class Dog extends Animal
{
    private String breed;
    private String color;
  Dog(String name,String species,String breed,String color,int age)
  {
      super(name,age,species);
    this.breed=breed;
    this.color=color;
  }
	  public String getBreed()
	  {
	    return this.breed;
	  }
	  public String getColor()
	  {
	    return this.color;
	  }
}
