import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
public class ConnectCampaign
{
  static Scanner scan = new Scanner(System.in);
public static  int paymentProcess(Donator donar,Campaign[] campaigns)throws Exception  
{
    displayCampaign(campaigns, donar);
    System.out.println("----------------------------------------------------------------");  
    System.out.println("Select Campaign based on sNo: ");
    int selection= scan.nextInt();
    scan.nextLine(); 
     if(selection<=0)
     {
       return 0;
     }     
      return checking(campaigns[selection-1],donar);
}
public static void displayCampaign(Campaign []campaigns, Donator donar)
{
    int sNO=1;
    for(Campaign cam: campaigns)
    {  
       if(cam!=null)
       {
           System.out.println("S.no: "+sNO+". Campaign name: "+cam.getCampaignName());
           sNO++;
       } 
       
    }
}
public static int checking(Campaign cam, Donator donar)throws Exception 
{      
     System.out.println("--------------------------------------------------------------------------------------------------------");
     System.out.println("["+cam.getCampaignName()+"]");
     System.out.println("Owner name:          "+cam.getOwnerName());
     System.out.println("Events:              "+cam.getEvent());
     System.out.println("Collecting Amount$ : "+((cam.getFundraisingGoal()<=cam.getAmountRaised())?"\"Fundraising Goal fill*\"":"Fundraising Amount Not fullfill !"+cam.getAmountRaised()+" now"));
     System.out.println("Discription:["+cam.getDiscription()+"]");
     System.out.println("--------------------------------------------------------------------------------------------------------");
     System.out.println("Are you ok!(\"1\" for yes | \"0\" for no)");
     int option=scan.nextInt();
      if(option==1)
      {
        DateTimeFormatter type=DateTimeFormatter.ofPattern("dd/MM/yyyy ");
	LocalDateTime now=LocalDateTime.now();
           donar.setPaymentDate(new SimpleDateFormat("dd/MM/yyyy").parse(type.format(now))); 
          if( cam.getLaunchDate().compareTo(donar.getPaymentDate())<=0 && cam.getDeadLine().compareTo(donar.getPaymentDate())>=0)
          {
              System.out.println("Enter payment Type: "); 
               donar.setPaymentType(payment_type());
              System.out.println("Enter payment Amount$: ");
               donar.setAmount(scan.nextDouble());
               cam.setAmountRaised((cam.getAmountRaised()+donar.getAmount())); 
               cam.setDonars(donar); 
               donar.setCampaign(cam);
              return 1;
          }else
          {
               System.out.println("                 "+cam.getStatus()+" now !");
               return 0;
          } 
         
       }
    return 0;
  }
  private static String payment_type()
  {
    System.out.println("1 <- for DebitCard :");
    System.out.println("2 <- for CreditCard :");
    System.out.println("3 <- for Net Banking :");
    System.out.println("4 <- for Bank:");
     int option=scan.nextInt();
    switch(option)
    {
      case 1:return "Debit Card" ;
      case 2:return "Credit Card";
      case 3:return "Net Banking";
      case 4:return "Bank";
    }
    return "";
  }
  public static String checkInputString(String str)
  {
    boolean check=false;
   check=(str.equals(" ") || str.isEmpty())?true:false;
     while(check)
     {
       System.out.println("It is empty so enter again!....");
        str=scan.nextLine();
       check=(str.equals(" ") || str.isEmpty())?true:false;
     }
     return str;
  }
}
