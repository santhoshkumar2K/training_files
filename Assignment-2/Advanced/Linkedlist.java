                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           import java.util.*;
public class Linkedlist<T extends Number> implements Iterable<T>
{
    Node head;
    int size=-1;
    Linkedlist()
    {
        head=null;
    }
    class Node
    {
        T data;
        Node next;
         Node(T v)
         {
             data=v;
             next=null;
         }
    }
   public void addFirst(T v)
   {
       Node newNode=new Node(v);
       if(head==null)
       {
          head=newNode;
       }else{
           newNode.next=head;
           head=newNode;
       }  
       size++;
   }
   public void addLast(T v)
   {
       if(head==null)
       {
           addFirst(v);
       }else{
            Node newNode=new Node(v);
            Node tem=head;
           while(tem.next!=null)
           {
               tem=tem.next;
           }  
           if(tem.next==null)
               {
                   tem.next=newNode;
               }
               size++;
       }    
   }
   
   public void add(int index, T v)
   {
       if(index==0)
       {
         addFirst(v);
         return ;
       } 
            Node newNode=new Node(v);
            Node tem=head;             
        for(int i=1;i<index;i++)
        {
            tem=tem.next;           
        }
        newNode.next=tem.next;
        tem.next=newNode;
         size++;
   }
    public T remove(int index)
   {
      T removed=null;
      if(size<index || index<0)
      {
         throw new IndexOutOfBoundsException("       Out of index: "+index);
      }
      if(index==0)
      {
          Node change=head.next; 
          removed=head.data;     
          head=change;  size--;
      }else
      {
            Node tem=head;             
        for(int i=1;i<index;i++)
        {
            tem=tem.next;           
        }
        Node delete=tem.next;
        removed=delete.data;
        tem.next=delete.next;
         size--;
      }  
      return removed;
   }
   public T get(int index)
   {
      T element=null;
      if(size<index || index<0)
      {
         throw new IndexOutOfBoundsException("       Out of index: "+index);
      }
     
           if(index==0)
           {
               element=head.data;;
           }else
           {
		   Node tem=head;   
		  for(int i=1;i<=index;i++)
		   {
		       tem=tem.next;   
		   }
		    element=tem.data;
           }
     return element;
   }
   public String toString()
   {
       StringBuffer s= new StringBuffer();
       s.append("[");
        Node tem=head;   
       while(tem!=null)
       {
          s.append(tem.data+"");
           tem=tem.next; 
           if(tem!=null)
           {
            s.append(","); 
           }
       }
       return s.append("]")+"";
       
   }
   public Iterator<T> iterator()
   {
        return new Iterator(){
            
            Node tem=head; int index=0;
            public boolean hasNext()
            {//index++;
                return (index++)<size;
                
            }
            public T next()
            {
                T v=tem.data;
                tem=tem.next;
                return v;
            }
        };
   }
   public boolean addAll(List<? extends Number> list)
   {
       return  addAll(size,list);
   }
   public boolean addAll(int index,List<? extends Number> list)
   {
         if(index>size || index<0)
         {
             throw new IndexOutOfBoundsException("       Out of index: "+index);
         }
         if(list.size()==0)
         {
            return false;
         }else
         {
             for(Number element:list)
             {
                this.add(index++,(T)element);
             }
         }
         return true;
   }
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	  Linkedlist list= new Linkedlist(); 
	int option=1;
	try {
		   while(option>0)
        	{
        	    System.out.println("----------------------------------");
        	    System.out.println("1. for adding element into a head of LinkedList.");
        	    System.out.println("2. for adding element into a last of LinkedList.");
        	    System.out.println("3. for insert an element at specific position of LinkedList.");
        	    System.out.println("4. for remove an  element from specific position of LinkedList.");
        	    System.out.println("5. for get an element(index based):");
        	    System.out.println("6. for Iterate the list of  elements:");
        	    System.out.println("7. for print.");
        	    System.out.println("8. for add all element of another list:");
        	    System.out.println("----------------------------------");
        	    option = scan.nextInt();
        	     switch(option)
        	     {
        	         case 1:System.out.println("Enter a value:");
        	               int first=scan.nextInt();
        	               list.addFirst(first);
        	               break;
        	         case 2: System.out.println("Enter a value:");
        	               int last=scan.nextInt();
        	               list.addLast(last);
        	               break;
        	         case 3: System.out.println("Enter a value:");
        	               int value = scan.nextInt();
        	                System.out.println("Enter a index:");
        	               int position = scan.nextInt();
        	               list.add(position,value);
        	               break;
        	         case 4:System.out.println("Enter a index:");
        	               int index = scan.nextInt();
        	               System.out.println(list.remove(index));
        	               break;                  
        	         case 5:System.out.println("Enter a index:");
        	               int getIndex=scan.nextInt();
        	               System.out.println(list.get(getIndex));
        	               break;
        	         case 6:Iterator iterate=list.iterator();
        	                while(iterate.hasNext())
        	                {
        	                  System.out.println(iterate.next());
        	                }
        	               break;
        	         case 7: System.out.println(list);   
        	               break;
        	         case 8:ArrayList arr= new ArrayList();
        	               arr.add(11); arr.add(33); arr.add(44);
        	               System.out.println(list.addAll(arr));   
        	               break;      
        	         default:System.out.println("                   invalied option!");
        	               
        	                 
        	     }
        	}
	} catch(java.util.InputMismatchException obj) {
	
	      System.out.println("                It is wrong input!\n so try again start from new LinkedList");
	      main(new String[]{});
	}catch(IndexOutOfBoundsException obj1)
	{
	     System.out.println(obj1.getMessage());
	     System.out.println("      !!! so try again start from new LinkedList");
	     main(new String[]{});
	}
	scan.close();
  }
}

