import java.util.Scanner;
public class SubSet
{
 public static void subset(int []array,int sum)
 {    
     int target=sum/2;
     int find=target;
     int recount=0;
     int positive=0, negative=0;
 if(sum%2==0){     
     for(int index=0;index<array.length;index++)
     {
      find=find-array[index];

       if(find<0)
       {
         recount=Math.abs(find);
        for(int check=0;check<array.length;check++)
        {
          if(recount==array[check] || recount==target)
          {
            negative++; 
            break;
          }
        }
         
       }else{
         positive++;  
       }
       
      }
       System.out.println(((positive+negative)==array.length)?"yes":"no");
       
 }else
 {   
      System.out.println(false);
 }  
 }
  public static void sort(int []array)
  {
   int temp;
    for(int index=0;index<array.length;index++)
    {
      for(int next=index+1;next<array.length;next++)
      {
        if(array[index]>array[next])
        {
           temp=array[index];
           array[index]=array[next];
           array[next]=temp;
        }
      }
    }
  }
 public static void main(String []arg)
 {   
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter a length : ");    
      int array[]=new int[scan.nextInt()]; 
    System.out.println("Enter the elements of array: ");
     int sum=0;
    for(int index=0;index<array.length;index++)
    {
     System.out.println("Add : ");
       array[index]=scan.nextInt();
       sum+=array[index];
     }  sort(array); 
        subset(array,sum);
 }
}
