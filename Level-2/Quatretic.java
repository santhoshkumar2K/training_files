import java.util.Scanner;
public class Quatretic
{
public static void quatreticEquation(double a,double b,double c)
 {             double root1,root2;
          double d=(b*b)-(4*a*c);    
    if(d==0)
    {
        root1=root2=-b/(2*a);
        System.out.println("The roots are "+root1+" and "+ root2);
    }else if(d>0)
    {
         root1=(-b+Math.sqrt(d))/(2*a);
         root2=(-b-Math.sqrt(d))/(2*a);
          System.out.println("The roots are "+root1+" and "+ root2);
    }else
    {
         root1=((-b/(2*a))+(Math.sqrt(d))/(2*a));
         root2=((-b/(2*a))-(Math.sqrt(d))/(2*a));
         System.out.println("The roots are "+root1+" and "+ root2);
    }
 }
public static void main(String[]arg)
 {
   Scanner scan= new Scanner(System.in);
    System.out.println("Enter any three Numbers : ");
 
     double a=scan.nextDouble();
      double b=scan.nextDouble();
        double c=scan.nextDouble();
          quatreticEquation(a,b,c);
 }
}
