public class Animal
{
	  public void speak()
	  {
	    System.out.println("\"The Animal says roar\"");
	  }
public static void main(String[]arg)
{
  Dog dog= new Dog();
  dog.speak();
  Cat cat= new Cat();
  cat.speak();
  
}
}
class Cat extends Animal
{
	  public void speak()
	  {
	    System.out.println("\"The cat says meow\"");
	  }
}
class Dog extends Animal
{
	  public void speak()
	  {
	    System.out.println("\"The Dog says woof\"");
	  }
}
