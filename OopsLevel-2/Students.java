import java.util.*;
public class Students
{ 
   private String name;
   private double tamil;
   private double english;
   private double maths ;
   private double science;
   private double social;
   private double total;
   private boolean pass=false;
 Students(String name,double tamil,double english,double maths,double science,double social)
 {
   
       this.name=name;
      this.tamil=tamil;   
       this.english=english;
       this.maths=maths;
       this.science=science;
        this.social=social;
       this.total= tamil+english+maths+science+social;
   if(this.tamil>=35 && this.english>=35 && this.maths>=35 && this.science>=35 && this.social>=35)
   {
       this.pass=true; 
   }
 }
 public String getName()
  {
    return this.name;
  }
  public double getTamil()
  {
    return this.tamil;
  }
  public double getEnglish()
  {
    return this.english;
  }
  public double getMaths()
  {
    return this.maths;
  }
  public double getScience()
  {
    return this.science;
  }
  public double getSocial()
  {
    return this.social;
  }
  public double getTotal()
  {
    return this.total;
  }public boolean getPass()
  {
    return this.pass;
  }
   public static boolean inputMarkCheck(double input)
  {
   if(input>100 || 0>input)
   {
    System.out.println("Unvalied mark..\nPlease enter again: ");
    return true;
   }
   return false;
  }
  public static String inputNameCheck(String input)
  {
   if(input.equals("")|| input.equals(null))
   {
    System.out.println("Unvalied name..");
    return "Unknown person";
   }
   return input;
  }
  private void reEnter(boolean correct,int option)
  {
  Scanner scan= new Scanner(System.in);
    while(correct)
    {
      correct=inputMarkCheck(assign(option,scan.nextDouble()));
    }
  }
  public static Students createStudent(Scanner scan)
  {
  System.out.println("Enter name: ");
      String name= inputNameCheck(scan.nextLine());
    System.out.println("Enter Tamil mark: "); 
      double tamil=scan.nextDouble();
      reEnter(inputMarkCheck(tamil),1);
    System.out.println("Enter English mark: ");   
      double english= scan.nextDouble();
       reEnter(inputMarkCheck(english),2);
    System.out.println("Enter Maths mark: ");   
      double maths= scan.nextDouble();
       reEnter(inputMarkCheck(maths),3);
    System.out.println("Enter Science mark: ");   
      double science=scan.nextDouble();
       reEnter(inputMarkCheck(science),4);
    System.out.println("Enter Social mark: ");   
      double social=scan.nextDouble();
       reEnter(inputMarkCheck(social),5);
     return new Students(name,tamil,english,maths,science,social);
  }
  private  double assign(int opt,double val)
  {
    switch(opt)
    {
      case 1:this.tamil=val;return tamil;
      case 2:this.english=val;return english;
      case 3:this.maths=val;return maths;
      case 4:this.science=val;return science;
      case 5:this.social=val;return social;
    }
     return 0;
  }
 }
