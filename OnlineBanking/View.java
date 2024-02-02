import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
class View{
    static Scanner scan = new Scanner(System.in);
    
    
  public void homePage(Bank bank)
  {
      int option=1;
       while(option>0)
       {
            try{
		  System.out.println("-------------------------------------");
		  System.out.println("1. create Account");
		  System.out.println("2. Login");
		  System.out.println("-------------------------------------");
		  option =scan.nextInt();
		  switch(option)
		  {
		      case 1:Customer customer=createCustomer();
                              Account account =createAccount();
                              int cus_id=Database.addCustomer(customer);
                              Database.addAccount(account,cus_id);
		           break;
		      case 2:Account currentAccount=login();
		             accountPage(currentAccount);
		           break;     
		  }
	     }catch(InputMismatchException e)
	     {
			    scan.next();
			    System.out.println("invalied input...");
         }   	  
       }
  }
  public void accountPage(Account currentAccount)
  {
      int option=1;
       while(option>0)
       {
            try{
		  System.out.println("-------------------------------------");
		  System.out.println("1. view Account");
		  System.out.println("2. Transaction history");
		  System.out.println("3. Transaction ");
		  System.out.println("0. Exit");
		  System.out.println("-------------------------------------");
		  option =scan.nextInt();
		  switch(option)
		  {
		      case 1:Customer currentCustomer=Database.getCustomer(currentAccount.getAc_number(),currentAccount.getPassword());
		             if(currentCustomer==null)
		             {
		                 break;
		             }
		             viewCustomer(currentCustomer);
		           break;
		      case 2://Account currentAccount=login();
		           break;     
		  }
	     }catch(InputMismatchException e)
	     {
			    scan.next();
			    System.out.println("invalied input...");
         }   	  
       }
  }
  public Account login()
  {
     boolean correct=true;
     long ac=0;
     String pw="";;
     while(correct)
     {
            System.out.println("Enter ac number:");
            ac=scan.nextLong();
            scan.nextLine();
            System.out.println("Enter password:");
            pw=scan.nextLine();
            correct=isCheckAcNumber(ac,pw);
     }
     return Database.getAccount(ac,pw);
  }
  public boolean isCheckAcNumber(long ac,String password)
  {
     boolean ac_no=Database.checkPassword("select account_no from account  where account_no=?",password);
     boolean pw=Database.checkPassword("select password from account  where password=?",password);
     return ((!ac_no)&&(!pw));
  }
   public Account createAccount()
   {
    AccountType[] types=displayAccountTypes();
        System.out.println("Select tppe");
        int opt=scan.nextInt();
        if(opt<=0 || opt>AccountType.values().length)
        {
            return null;
        }
        AccountType type=types[opt-1];
        String password=createPassword();
        Random random=new Random();
        long ac=Math.abs(random.nextInt());
        System.out.println("your Account no: "+ac);
        Date date=new Date();
        System.out.println(date+" Enter Authar cart no: ");
        long authar=autharValiedation(scan.nextLong());
        if((authar+"").length()!=12){}
        return new Account(type,ac,password,date,authar);
   }
   public long autharValiedation(long athar)
   {
      System.out.println("Enter Authar cart no: ");
        long authar=scan.nextLong();
        if((authar+"").length()<12)
        {
           autharValiedation(authar);
           return authar;
        }
        return authar;
   }
   public String createPassword()
   {
        System.out.println("Enter 8 digit password");
        String pw=scan.next();
        boolean isThere=Database.checkPassword("select password from account  where password=?",pw);
        Date currentDate=new Date();
        if(isThere || pw.length()<8)
        {
            createPassword();
            return pw;
        }
        return pw;
   }
   public void viewCustomer(Customer customer)
   {
       
   }
   public Address createAddress()
    {
                    System.out.println("Enter door no:");
		        int doorNo=scan.nextInt();
                    System.out.println("Enter street:");
                         String street=scan.next();
                    System.out.println("Enter city:");
                         String city=scan.next();
                    System.out.println("Enter district:");
                         String district=scan.next();  
                    System.out.println("Enter pincode:");
                         int pincode=scan.nextInt();  
             return new Address(doorNo,street,city,district,pincode);            
    }
  public Customer createCustomer()
  {
        System.out.println("Enter your firstName:");
        String firstname=scan.next();
        System.out.println("Enter your lastName:");
        String lastname=scan.next();
        System.out.println("Enter your date of birth(yyyy-MM-dd)");
        Date dob=null;
        try{
        dob=new SimpleDateFormat("yyyy-MM-dd").parse(scan.next());
        }catch(Exception e){}  
        System.out.println("Enter gender(1.Male || 2.Female)");
        int opt=scan.nextInt();
        Gender gender=null;
        if(opt>0 && opt<3)
        {
            if(opt==1)
            {
            gender=Gender.MALE;
            }else{
            gender=Gender.FEMALE;
            }
        }else
        {
        System.out.println("Invalied...");
        } 
        System.out.println("Ender your contact:");
        long contact=scan.nextLong();  
        Address address=createAddress();
        return new Customer(lastname, lastname, dob, gender,address, contact);
  }  
  public AccountType[] displayAccountTypes()
  {
       AccountType[]types=AccountType.values();
        for(int index=0;index<types.length;index++)
        {
            System.out.println((index+1)+"."+types[index]);
        }
        return types;
  }
  
}
