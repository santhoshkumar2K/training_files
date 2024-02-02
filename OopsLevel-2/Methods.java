import java.util.Scanner;
public class Methods
{
 private void methodOne(String[]arr)
 {
   for(String index: arr)
   {
      System.out.println(index);
   } 
     System.out.println("------------Void type-----------------------");
 } 
 private void method(int[]arr)
 {
   for(int index=0; index<arr.length; index++)
   {
      System.out.println(arr[index]);
   } 
     System.out.println("------------Void type-----------------------");
 } 
 private String[] methodTwo(Scanner scan)
 {
    System.out.println("Enter a sentence:");
       String sentence= scan.nextLine();
    System.out.println("This return type is String arry");
       String array[]=sentence.split(" ");
       return array;
 } 
 private int[] methodThree(Scanner scan)
 {
     System.out.println("Enter a length of int arry:");
       int length= scan.nextInt();
       int array[]= new int[length];
   for(int index=0; index<array.length; index++)
   {
     System.out.println("Enter number:");
     array[index]=scan.nextInt();
   } 
      return array;
 }
 private void  methodFour(int number1, int number2)
 {
     System.out.println("Number one is: "+number1+" Number two is: "+number2);
 }  
  public static void main(String []arg)
  {
    Scanner scan = new Scanner(System.in);
      Methods obj= new Methods(); 
        String array[]=obj.methodTwo(scan);
           obj.methodOne(array);
        int array1[]=obj.methodThree(scan);
           obj.method(array1);
           obj.methodFour(5,4);
              
  }
}
