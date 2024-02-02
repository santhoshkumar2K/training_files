import java.util.Scanner;
public class SumOfDigitTen
{
  public static int sumOfDigit(int num) {
         int balance=0,sum=0;
         int no=num;
         while(num>0)
         {
          balance=num%10;
          sum=sum+balance;
          num=num/10;
         }
         int i=0;
         while(i<10)
         {
          if((sum+i)==10)
          {
            no=(no*10)+i;
          }
          i++;
         }
         
        return no;
    }
 public static void main(String []arr)
 {
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter a number: ");
   int number=scan.nextInt();
   System.out.println(sumOfDigit(number));
 }
}
