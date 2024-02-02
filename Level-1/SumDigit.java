class SumDigit{

  public static void digits(int num)
  {
  int sum=0;
    for(int i=num;num>0;)
    {
     int remainter=num % 10;      
        sum=sum+remainter;
          num=num/10;
    }
         System.out.println(sum);
   }
public static void main(String []arg){

   digits(5601);

}
}
