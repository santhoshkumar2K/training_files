class BMI{
   public static void bmi(int pounds,int inchs)
   {
   double meter=0.0254*inchs;
   double kg=0.453592*pounds;
     System.out.println(kg/(meter*meter)); //Math.pow(meter,2);
   }
public static void main(String arg []){
   bmi(452,72);
}
}
