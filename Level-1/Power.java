class Power
{
 public  static int power(int number,int powerNumber)
 {
      int num=1;
   for(int powerOf=1;powerOf<=powerNumber;powerOf++)
   {
     num*=number;
   }
      return num;
 }
public static void main(String []ar )
{
  System.out.println("Square : "+power(2,2));
    System.out.println("Cube : "+power(2,3));
      System.out.println("Fourth power : "+power(2,4));
}
}
