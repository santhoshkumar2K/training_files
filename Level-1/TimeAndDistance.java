class TimeAndDistance{
   public static void speed(int distance,int hour,int minites,int seconds)
   {
    double secondOfHrs=hour*3600;
    double secondOfMin=minites*60;
    double totalSeconds=secondOfHrs+secondOfMin+seconds;
      
      double meterPerSecond=distance/totalSeconds;
      double kilometerPerHour=meterPerSecond*3.6;
       double milePerHour=kilometerPerHour*0.62137;
       
      System.out.println("Your speed in Meter/Seconds:  "+meterPerSecond);
      System.out.println("Your speed in Kilometer/Second: "+kilometerPerHour); 
      System.out.println("your speed in Mile/Hour: "+milePerHour);
     
   }
public static void main(String []args){
    speed(2500,5,56,23);
 }
}
