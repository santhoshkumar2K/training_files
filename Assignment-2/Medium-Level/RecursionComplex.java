import java.util.Scanner;
public class RecursionComplex
{
 public static void move(int disk,char from, char end,char extra)
 {
    if(disk==1)
    {
        System.out.println("disk 1 move from "+from+" to "+end);
        return;
    }
    move(disk-1,from,extra,end);
       System.out.println("disk "+disk+" move from "+from+" to "+end);
    move(disk-1,extra,end,from)   ;
 }
public static void main(String[]arg)
{
  Scanner scan= new Scanner(System.in);
  char from='A';
  char extra='B';
  char end='C';
  try
  {
	 System.out.println("Enter a number of disk:");
         int disk=scan.nextInt();
         move(disk,from,end,extra);
  }catch(java.util.InputMismatchException obj)
   {
        System.out.println("                It is wrong input!..");
	      main(new String[]{});
   }  
       scan.close();      
}
}





