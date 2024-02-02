import java.util.*;
public class CampaignProcess
{ 
   static  Campaign [] campaigns=new Campaign[20];
   static  Donator [] donars= new Donator[20]; 
   
 public static void main(String []arg)throws Exception 
 {
 Scanner scan = new Scanner(System.in);
 
  int input=1, camIndex=-1, donIndex=-1;
 while(input>0)
 {
    System.out.println("--------------------------------------------");
    System.out.println("Enter 1 for add new Campaign:              |");   
    System.out.println("Enter 2 for add Donators:                  |");
    System.out.println("Enter 3 for Show all Campaigns:            |");
    System.out.println("Enter 4 for Show all Donators:             |");
    System.out.println("Enter 5 for Show & Donate Running Campaign:|");
    System.out.println("Enter 0 for Exit:                          |");
    System.out.println("--------------------------------------------");
    input=scan.nextInt();scan.nextLine();
     switch(input)
     {
      case 1:
            Campaign cam =new Campaign(scan);
              if(Campaign.dateValidate(cam.getLaunchDate(), cam.getDeadLine()))
              {
               campaigns[++camIndex]=cam;
               System.out.println("   *Adding Successfully*  ");
              }
             break;
      case 2: 
              if(camIndex!=-1)
              { 
                   int useropt=1;
                 while(useropt>0){ 
                    Donator donar=new Donator(scan);
                     if(donar.getMailId()==null)
                     {
                       System.out.println("          Sorry this is Wrong ID...try again!");
                       break;                            // break from this switch statement if you enter wrong mail id above three times,
                     } 
                     System.out.println("----------------------------------------------------------------");
                    int complete=ConnectCampaign.paymentProcess(donar, campaigns);  
                     if(complete==1)
                     {
                       donars[++donIndex]=donar;
                     } 
                    System.out.println((complete>0)?"Successful...\n*Thank you for your Support*":" sorry please try again!");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Are you donate one more time..(Enter \"Any number above \'0\'\")");
                    System.out.println("Are you Exit..(Enter \"0\")");  
                     useropt=  scan.nextInt();
                     scan.nextLine();
                  } 
              }else
              {
                   System.out.println("NO Campaigns now! ");
              }    
             break;     
      case 3: if(camIndex!=-1)
              {
                System.out.println("------------------------(Campaign List)------------------------------------");
                String id="";
                  for(int i=0;i<=camIndex;i++)
                  { 
                    for(int j=i;j<=camIndex;j++)
                    {
                      if(campaigns[i].getCampaignName().equals(campaigns[j].getCampaignName()) && !id.equals(campaigns[j].getCampaignName()))
                      {
                          System.out.println((i+1)+"."+campaigns[j]);
                          System.out.println("Total no.of donars: "+Campaign.displayMembers(campaigns[j].getDonars())); 
                      }  
                    }System.out.println("------------------------------------------------------------");
                    id= campaigns[i].getCampaignName();
                  }
              }else{System.out.println("NO Donators now! ");}    
             break;   
       case 4:if(donIndex!=-1)
              {
                System.out.println("--------------------------(Donator List)----------------------------------");
                String id=" ";int count=0;
                  for(int i=0;i<=donIndex;i++)
                  { 
                    if(donars[i].getMailId()!=null && !id.contains(" "+donars[i].getMailId()+" "))
                    { 
                      count++;
                      
                       System.out.println("-------------------------------------------------------------------------------------");
                       System.out.println((!id.contains(" "+donars[i].getMailId()+" "))?count+".donar name: "+donars[i].getDonatorName():"");
                       id=id+" "+donars[i].getMailId()+" "; 
                       System.out.println("No.of Campaigns: "+Donator.idCheck(donars[i].getMailId(),donars));
                       System.out.println("--------------------------------------------------------------------------------------");
                    }  
                  }
                 
              }else{System.out.println("NO Donators now! ");}    
             break;
      case 5: if(camIndex!=-1)
              {   boolean runningCampaign=false;
                  for(int i=0;i<=camIndex;i++)
                  { 
                    if(campaigns[i]!=null && campaigns[i].getStatus().equals("Running"))
                    {
                      System.out.println((i+1)+"."+campaigns[i]);
                      runningCampaign=true;
                    }
                  }
                  if(!runningCampaign)
                  {
                    System.out.println("No Running Campaign!"); break;
                  }
                    System.out.println("-------------------------------------------------");
                    System.out.println("Are you Donate! (Select one based on \"Sno\"): ");
                    int userOption=scan.nextInt();  scan.nextLine();
                    Donator don=new Donator(scan); 
                    if(don.getMailId()==null)
                     {
                       System.out.println("          Sorry this is Wrong ID...try again!  ");
                       break;               // break from this switch statement if you enter wrong mail id above three times,
                     } 
                    if(userOption>0)
                    { 
                      if(ConnectCampaign.checking(campaigns[userOption-1],don)==1)
                      {
                        donars[++donIndex]=don;
                        System.out.println("Success..");
                      }else{   System.out.println("Try again..!");}
                    }  
              }else{System.out.println("NO Donators now! ");}    
             break; 
      default :System.out.println((input!=0)?"Unvalied option! ":"");          
          }
     }
 }
}
