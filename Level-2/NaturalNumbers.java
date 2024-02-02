import java.util.Scanner;
class NaturalNumbers
{

public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter a Number: ");
  int number=scan.nextInt();
  
  if(number>0)
  {
    for(int naturalNumber=1;naturalNumber<=number;naturalNumber++)
    {
           System.out.println(naturalNumber);
    }
  }else{
          System.out.println("It is not a Natural number");
  }  
 }
}
