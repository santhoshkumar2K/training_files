import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
public class Campaign
{
  private String compaignName;
  private String ownerName;
  private String event;
  private String discription;
  private final double fundraisingGoal; 
  private double amountRaised=0;
  private String status;
  private Date launchDate;
  private Date deadLine;
  private Donator []donars= new Donator[10];
  int donarIndex=-1;
  static String unique="";

  Campaign(Scanner scan )throws Exception 
  {
     System.out.println("Enter Compaign name(Its unique): ");
       String str=ConnectCampaign.checkInputString(scan.nextLine());
        this.compaignName=uniqueCheck(str);;                                                
     System.out.println("Enter owner name: "); 
        this.ownerName=ConnectCampaign.checkInputString(scan.nextLine());
     System.out.println("Enter fundraising Goal amount: "); 
        this.fundraisingGoal=scan.nextDouble(); 
        scan.nextLine();
     System.out.println("Enter events: ");
        this.event=ConnectCampaign.checkInputString(scan.nextLine());  
     System.out.println("Enter your discription about Your Campaign:  ");
        this.discription=ConnectCampaign.checkInputString(scan.nextLine());    
     System.out.println("Enter Launch Date(dd/MM/yyyy): ");
        String date=scan.nextLine();
        this.launchDate=new SimpleDateFormat("dd/MM/yyyy").parse(date);
     System.out.println("Enter DeadLine Date(dd/MM/yyyy): ");
        String deadline=scan.nextLine();
        this.deadLine=new SimpleDateFormat("dd/MM/yyyy").parse(deadline);
     DateTimeFormatter type=DateTimeFormatter.ofPattern("dd/MM/yyyy ");
     LocalDateTime now=LocalDateTime.now();
        Date current=new SimpleDateFormat("dd/MM/yyyy").parse(type.format(now)); 
        this.setStatus((current.compareTo(this.launchDate)<0)?"Not Started":(current.compareTo(this.deadLine)>0)?"Running Completed":"Running"); 
  } 
  public String getCampaignName()
  {
     return this.compaignName;
  }
  public String getOwnerName()
  {
     return this.ownerName;
  }
  public String getEvent()
  {
     return this.event;
  }
  public String getDiscription()
  {
     return this.discription;
  }
  public double getFundraisingGoal()
  {
     return this.fundraisingGoal;
  }
  public double getAmountRaised()
  {
     return this.amountRaised;
  }
  public void setAmountRaised(double amount)
  {
      this.amountRaised=amount;
  }
  public String getStatus()
  {
     return this.status;
  }
  public void setStatus(String val)
  {
    this.status=val;
  }
  public Date getLaunchDate()
  {
     return this.launchDate;
  }
  public Date getDeadLine()
  {
     return this.deadLine;
  }
  public Donator[] getDonars()
  {
     return this.donars;
  }
  public void setDonars(Donator donar)
  {
        this.donars[++donarIndex]=donar; 
  }
  public String toString()
  {
    return "Campaign name:   ["+this.getCampaignName()+"], owner name:   "+this.getOwnerName()+", status now: "+this.getStatus()+", Events= "+this.getEvent()+";\n  Discription:["+this.getDiscription()+"]";
  }
  public static boolean dateValidate(Date launch, Date end)
  {
     if(launch.compareTo(end)>0 || end.compareTo(launch)<0)
     {
        System.out.println("Unvalied Date...(Enter again!)\n                 !!!       ");
        return false;
     } 
     return true;
  }
  public static  int displayMembers(Donator [] don)
  {
     String id="";int count=0;
      for(int i=0;i<don.length;i++)
      {
         if(don[i]!=null)
         {
          count= (!id.contains(" "+don[i].getMailId()+" ")?count+1:count);
          System.out.println(" "+don[i]);
          id=id+" "+don[i].getMailId()+" ";
         } 
      }
      return count;
  }
  private static String uniqueCheck(String str)
  {
   boolean check=unique.contains(str);
      while(check)
      {
       System.out.println("This campaign is already exist! so enter again!....");
        str=scan.nextLine();
       check=unique.contains(str);
      } 
      return str;
  }
  
}
