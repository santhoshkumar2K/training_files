public class MiniteToYear{
  public static void minite_year(int min)
  {
  
    if(min>=1440)
    {
       int days=min/1440;
         int year=days/365;
           int reminterDays=days%365;
              System.out.println("Year :"+year+", Days: "+reminterDays);
    }else{
         System.out.println(min+" minites...");
    }
  }
public static void main(String[] args){
 minite_year(3456789);
         //System.out.println(2400%365);
}
}
