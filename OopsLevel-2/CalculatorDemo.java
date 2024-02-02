import java.util.Scanner;
class Calculator
{
  double number1;
  double number2;
 Calculator(double number1, double number2)
 {
    this.number1=number1;
    this.number2=number2;
 }
} 
public class CalculatorDemo
{
 private static void addition(Calculator obj)
 {
  System.out.println(obj.number1+" + "+obj.number2+"\nAnswer = "+(obj.number1+obj.number2));
 }
 private static void subtraction(Calculator obj)
 {
  System.out.println(obj.number1+" - "+obj.number2+"Answer = "+(obj.number1-obj.number2));
 }
 private static void multiplication(Calculator obj)
 {
  System.out.println(obj.number1+" * "+obj.number2+"Answer = "+obj.number1*obj.number2);
 }
 private static void division(Calculator obj)
 {
  System.out.println(obj.number1+" / "+obj.number2+"Answer = "+obj.number1/obj.number2);
 }
  public static void main(String [] args)
 {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter a first number: ");
    double num1=scan.nextInt();
  System.out.println("Enter a second number: ");
    double num2=scan.nextInt();  
  Calculator calculatorObj= new Calculator(num1,num2);
    int option=1;
  while(option>0)
  {
    System.out.println("-------------------Calculator--------------------");
    System.out.println("Enter 1 for addition(+): ");
    System.out.println("Enter 2 for subtraction(-): ");
    System.out.println("Enter 3 for multiplication(*): ");
    System.out.println("Enter 4 for divition(/): ");
    System.out.println("Enter 0 for exit: ");
    System.out.println("-------------------------------------------------");
    System.out.println("Enter a option!: ");
       option =scan.nextInt();
      switch(option)
      {
         case 1:addition(calculatorObj);
                break;
         case 2:subtraction(calculatorObj);
                break;
         case 3:multiplication(calculatorObj);
                break; 
         case 4:division(calculatorObj);                     
      }
  }
 }
}
