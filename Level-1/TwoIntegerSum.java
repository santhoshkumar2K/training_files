class TwoIntegerSum
{
  public static void totalSum(int number1,int number2)
  {
    System.out.println("sum of two integer: "+(number1+number2));
    System.out.println("difference of two integer: "+(number1-number2));
    System.out.println("product of two integer: "+(number1*number2));
    System.out.println("average of two integer: "+((number1+number2)/2));
    System.out.println("maximum number: "+((number1>number2)?number1:number2));
    System.out.println("minimum number: "+((number1<number2)?number1:number2));
  }
public static void main(String []args)
{

totalSum(25,5);
}

}
