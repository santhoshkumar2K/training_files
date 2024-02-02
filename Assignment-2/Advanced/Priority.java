import java.util.*;
public class Priority 
{ 
public static void main(String[] args) {
     PriorityQueue queue= new PriorityQueue(new Comparator()
                                                           {
								  public int compare(Object obj1,Object obj2)
								  {
								      Member p1=(Member)obj1;
								      Member p2=(Member)obj2;
									     if(p1.priority>p2.priority)
									     {
										return 1;
									     }else
									     {
										return -1;
									     }    
								    }
							     });
	  Scanner scan = new Scanner(System.in);           
	int option=1;
	try {
		   while(option>0)
        	{
        	    System.out.println("--------------------Set priority for stored element in PriorityQueue  ----------------------");
        	    System.out.println("1. for adding into Priority Queue.");
        	    System.out.println("2. for peek");
        	    System.out.println("3. for poll");
        	    System.out.println("4. for print");
        	    System.out.println("5. for remove:");
        	    System.out.println("-----------------------0 for Exit------------------------");
        	    option = scan.nextInt();
        	     switch(option)
        	     {
        	         case 1:System.out.println("Enter a Member object name:");
        	               String name=scan.next();
        	               System.out.println("Enter a Priority for Member object:");
        	               int priority=scan.nextInt();
        	                queue.add(new Member(name,priority));
        	               break;
        	         case 2:
        	               System.out.println(queue.peek());
        	               break;
        	         case 3:
        	               System.out.println(queue.poll());
        	               break;
        	         case 4:
        	               System.out.println(queue);
        	               break;
        	         case 5: 
        	               System.out.println(queue.remove());
        	               break;      
        	         default:System.out.println((option==0)?"":"                   invalied option!");
        	               
        	                 
        	     }
        	}
	} catch(java.util.InputMismatchException e1) 
	{
	
	      System.out.println("                It is wrong input!\n       !!! try new PriorityQueue.");
	       main(new String[]{});
        }catch(java.util.NoSuchElementException e2)
        {
            System.out.println("                Priority Queue is Empty!\n       !!! try new PriorityQueue.");
	       main(new String[]{});
        }
        scan.close();
 }
} 
class Member
{
  String name;
  int priority;
  Member(String name,int Member)
  {
    this.name=name;
    this.priority=Member;
  }
  public String toString()
  {
     return this.name;
  }
}     
