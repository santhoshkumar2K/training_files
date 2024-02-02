package ClassAndObjects;
import java.util.Scanner;
public class Book
{
  private String title;
  private String author;
  private String publisher; 
  Book(String title,String author,String publisher)
  {
    this.title=title;
    this.author=author;
    this.publisher=publisher;
  }
	  public String getTitle()
	  {
	    return this.title;
	  }
	  public String getAuthor()
	  {
	    return this.author;
	  }
	  public String getPublisher()
	  {
	    return this.publisher;
	  }
 public static void main(String[]args)
 {
    Scanner scan= new Scanner(System.in);
     
 }
} 
