class Sequence
{
 public static int reverse(int n)
 {
 int rev=0;
   while(n>0)
  {
      int reminder=n%10;
       rev=rev*10+reminder;
         n=n/10;
   }
     return rev;
 }
public static void main(String []a)
{
  int num=123456;
  num=reverse(num);
  while(num>0)
 {
   int reminter=num%10;     
   System.out.println(reminter);
   num=num/10;
 } 

}
}
