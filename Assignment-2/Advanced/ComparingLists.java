import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class ComparingLists
{ 
    public static long add(List list,int n)
    {
      long start= System.currentTimeMillis();
            for(int i=0;i<n;i++)
            {
               list.add(i);
            } 
      long end=System.currentTimeMillis();          
      return end-start;
    }
    public static long addw(List list,int n)
    {
        long start= System.currentTimeMillis();
               list.add(n,111);                      
        long end=System.currentTimeMillis();  
      return end-start;
    }
    public static long remove(List list, int i)
    {                                                     
        long start= System.currentTimeMillis();           
               list.remove(i);                              
        long end=System.currentTimeMillis();                                
      return end-start;
    }
    public static long search(List list,int num)
    {                                                     
      long start= System.currentTimeMillis();  
            for(int i=0;i<list.size();i++)
            {
                    if(list.contains(num))
                    {
                       break;
                    }                                            
            }             
      long end=System.currentTimeMillis();                                
      return end-start;
    }
    public static void display(String operation,long takes1, long takes2)
    {
             System.out.println(operation+":\n ArrayList takes "+takes1+" milliseconds.");
	     System.out.println(" LinkedList takes "+takes2+" milliseconds.");
	     System.out.println("so Best : "+((takes1==takes2)?"Both lists take same time ":(takes1<takes2)?"ArrayList":"LinkedList "));
	     System.out.println("----------------------------------------------------------------------------------------------");
    }
     public static void comparing(ArrayList list1, LinkedList list2)
    {                                                     
        Scanner scan = new Scanner(System.in);
  try{	
	     System.out.println("How many numbers are adding in both ArrayList and LinkedList: ");
		   int num =scan.nextInt();  
        		          
		         long takes1= add(list1,num);
		         long takes2=add(list2,num);
		        display("Normal Adding",takes1,takes2);
	     System.out.println("-----------Enter (worst case) 0 to "+(num-1)+" number for \"Adding operation\": --------------");
		        int n=scan.nextInt();
			     takes1=addw(list1,n);                              
			     takes2=addw(list2,n);
	                display("Add Worst case",takes1,takes2);
	     System.out.println("-----------Enter (worst case) 0 to "+(num-1)+" number for \"search operation\": --------------");
		        int searchNum=scan.nextInt();
			        takes1=search(list1,searchNum);
			        takes2=search(list2,searchNum);  
		        display("Search",takes1,takes2);
	     System.out.println("-----------Enter (worst case) 0 to "+(num-1)+" number for \"removing operation\": --------------");
		        int Num=scan.nextInt();
			        takes1=remove(list1,Num);                              
			        takes2=remove(list2,Num);
			display("Remove Worst case",takes1,takes2);
	 }catch(java.util.InputMismatchException e)
     {
             System.out.println("                  This Input is not valied! ");   
               comparing(list1,list2);
               return;
      }		   
	        scan.close();	
    }
    
public static void main(String[] args) {
       ArrayList list1= new ArrayList();
       LinkedList list2=new LinkedList();
         comparing(list1,list2);
}  
}
