


public class Check 
{
int i=5;
private  void m1(int i)
{
  System.out.println("hi..........."+i); }
  private void m2()
  {
   m1(i);
  }
  public static void main(String[] args) {
		//System.out.println("Hello World");
		Check m= new Check();
		m.m1(m.i);
	}

}
