import java.util.Scanner;
class MonthDays
{

public static void main(String []arr)
 {

  Scanner scan= new Scanner(System.in);
  System.out.println("Enter Month Number: ");
  int month=scan.nextInt();
  System.out.println("Enter Year Number: ");
  int year=scan.nextInt();
  
     int days=0;String monthName="";

     switch(month)
     {
     case 1: 
       days=31;
       monthName="January";
       break;
     case 2: 
       days=(year%4==0)?29:28;
       monthName="Fibruary";
       break; 
     case 3: 
       days=31;
       monthName="March";
       break;
     case 4: 
       days=30;
       monthName="April";
       break;
     case 5: 
       days=31;
       monthName="May";
       break;
     case 6: 
       days=30;
       monthName="June";
       break;   
     case 7: 
       days=31;
       monthName="July";
       break;
     case 8: 
       days=31;
       monthName="August";
       break; 
     case 9: 
       days=30;
       monthName="September";
       break;
     case 10: 
       days=31;
       monthName="October";
       break;
     case 11: 
       days=30;
       monthName="November";
       break;
     case 12: 
       days=31;
       monthName="December";  
       break;
    }   
           System.out.println(monthName+" "+year+" has"+days+" days");
  
 }
}
