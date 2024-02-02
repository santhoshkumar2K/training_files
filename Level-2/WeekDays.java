 import java.util.Scanner;
class WeekDays
{

public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter Your  Number: ");
  int number=scan.nextInt();
  
      switch(number)
      {
        case 1:  System.out.println("Monday");
                 break;
        case 2:  System.out.println("Tuesday");
                 break;    
        case 3:  System.out.println("Wednesday");
                 break;   
        case 4:  System.out.println("Thursday");
                 break;  
        case 5:  System.out.println("Friday");
                 break;  
        case 6:  System.out.println("Saturday");
                 break;    
        case 7:  System.out.println("Sunday");
                 break; 
        default : System.out.println("Sorry Weekdays Only Seven...Your Number is un valied");        
      }    
  
 }
}
