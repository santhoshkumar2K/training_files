interface Playable
{
	 void play();
public static void main(String[]arg)
{
  Guitar guitar= new Guitar();
  guitar.play();
  Piano piano= new Piano();
  piano.play();
  
}
}
class Guitar implements Playable
{
	  public void play()
	  {
	    System.out.println("\"Playing Guitar\"");
	  }
}
class Piano implements Playable
{
	  public void play()
	  {
	    System.out.println("\"Playing Piano\"");
	  }
}
