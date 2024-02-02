import java.util.*;
import java.text.SimpleDateFormat;
public class Donator
{
   private String donatorName;
   private String mailId;
   private String paymentType;
   private Date paymentDate;
   private double amount;
   private Campaign campaign;
  Donator(Scanner scan)
  {
    System.out.println("Enter Donator name: ");
       this.donatorName=ConnectCampaign.checkInputString(scan.nextLine());;
       boolean log=false;
       String mail="";int count=0;
      while(!log && count<3)
      { 
        System.out.println("Enter Your mail (@gamil.com)ID: ");
          mail=scan.nextLine();
          log=mailCheck(mail);
        System.out.println((!log)?"Please enter valied Mail ID(xxx@gmail.com)(Onle three Chance "+(++count)+"): ":""); 
      }   
      this.mailId=(log)?mail:null; 
  }
  public String getDonatorName()
  {
    return this.donatorName;
  }
  public String getMailId()
  {
    return this.mailId;
  }
  public String getPaymentType()
  {
    return this.paymentType;
  }
  public Date getPaymentDate()
  {
    return this.paymentDate;
  }
  public double getAmount()
  {
    return this.amount;
  }
  public Campaign getCampaign()
  {
    return this.campaign;
  }
  public void setCampaign(Campaign cam)
  {
     this.campaign=cam;
  }
  public void setPaymentType(String type)
  {
     this.paymentType=type;
  }
  public void setPaymentDate(Date date)
  {
     this.paymentDate=date;
  }
  public void setAmount(double amount)
  {
     this.amount=amount;
  }
  public String toString()
  {
    
   return " * Nmae: "+this.getDonatorName()+", mailID("+this.getMailId()+"), Through-> "+this.getPaymentType()+"("+new SimpleDateFormat("dd/MM/yyyy").format(getPaymentDate())+") = "+this.getAmount()+";";
  }
  private static boolean mailCheck(String mail)
  {
     if(mail.contains("@") && mail.contains(".com") && mail.indexOf("@")<mail.indexOf(".com") && !mail.contains(" "))
     {
        return true;
     }
       return false;
  }
  public static int idCheck(String id, Donator[] don)
  { 
   int count=0;String name="";
     for(int i=0;i<don.length;i++)
     {                          
        if(don[i]!=null && id.equals(don[i].getMailId()) && !name.contains(" "+don[i].getCampaign().getCampaignName()+" ")) 
        {
          count= (!name.contains(" "+don[i].getCampaign().getCampaignName()+" ")?count+1:count);
          System.out.println("*"+don[i].getCampaign());
          name=name+" "+don[i].getCampaign().getCampaignName()+" ";
        }
     }
     return count;
  }
 
 
}
