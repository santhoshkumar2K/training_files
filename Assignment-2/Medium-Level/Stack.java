import java.util.Arrays;
import java.util.Scanner;
public class Stack<T>
{

    private T [] stack;
    private final int defaultSize=10;
    private int capasity;
    private int size=-1;
    private int take;
  Stack()
  {
    capasity=defaultSize;
    stack=(T[])new Object[capasity];
  }
   public boolean push(T element)
   {  
       if(size==capasity)
       {               
           this.growing();
       }
       stack[++size]=element;
         return true;
   }
   public T pop()
   {                    
       if(size==-1)
       {    
           //System.out.println("full"); 
           return null;
       }                               
       if(size==(capasity/2))
       {
           this.srink();
       }
          T remove=stack[size];
          stack[size]=null; 
          size--;
       return remove;
   }
   public T peek()
   {  
       if(size==-1)
       {
          //
           System.out.println("full");
           return null;
       }
       
       return stack[size];
   }
   public void growing()
   {
       capasity=capasity*2;
       stack=Arrays.copyOf(stack,capasity);    
       
   }
   public void srink()
   {                        
       capasity=size+1;
       stack=Arrays.copyOf(stack,capasity);   
       
   }
   public String toString()
   {
       StringBuffer string=new StringBuffer();
           string.append("[");
       for(int i=0;i<this.stack.length;i++)
       {  
            if(stack[i]!=null)
            {
                    string.append(stack[i]+""+((stack[i+1]==null)?"":",")); 
            }        
       }
           string.append("]");
       return string+"";
   }
public static void main(String[] args) 
{
     Scanner scan = new Scanner(System.in);
	Stack obj = new Stack();                             
	int option=1;
	try {
		   while(option>0)
        	{
        	    System.out.println("----------------------------------");
        	    System.out.println("1. for push element into a Stack.");
        	    System.out.println("2. for pop element:");
        	    System.out.println("3. for peek an element:");
        	    System.out.println("4. for print:");
        	    System.out.println("----------------------------------");
        	    option = scan.nextInt();
        	     switch(option)
        	     {
        	         case 1:System.out.println("Enter a value:");
        	               int val=scan.nextInt();
        	               obj.push(val);
        	               break;
        	         case 2: System.out.println("pop element is: "+obj.pop());
        	               break;
        	         case 3:  System.out.println("peek element is: "+obj.peek());
        	               break;              
        	         case 4: System.out.println(obj);
        	               break;
        	         default:System.out.println("                   invalied option!");          
        	     }
        	}
	} catch(java.util.InputMismatchException e)
	 {
	     System.out.println("                It is wrong input!\n so try again start from new LinkedList");
	      main(new String[]{});
         }
         scan.close();
    
}
}

