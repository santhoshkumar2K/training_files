import java.util.Scanner;
public class Hashtable<T>
{ 
    int capasity=11;
    Node []arr=new Node[capasity];
    float fillradio;
    int size;
    int thrsolt;
    Hashtable()
    {
        fillradio=0.75f;
        thrsolt=(int)(capasity*fillradio);
    }
    class Node <T>
    {
       final T key;
           T value;
          Node next;
       final int hash;
         Node(T k,T v,int hashValue)
         {
             key=k;
             value=v;
             hash=hashValue ;
             next=null;
         }
    }
    public boolean checkUniqe(Object oldKey,T newKey)
    {                                    
        return oldKey.equals(newKey);
    }
    public void put(T key,T value)
    {
       if(key==null || value==null)
       {
            throw new NullPointerException("Null is not allowed!");
       }else
       {
		 if(size==thrsolt)
		 {
		     rehash();
		 }
          int index=key.hashCode()%capasity;
          add(key,value,index);
       }  
    }
    public void add(T key, T value,int index)
    {
        Node newNode=new Node(key,value,index);      
        if(arr[index]==null)
        {
          arr[index]=newNode; size++;
        }else{
            Node tem=arr[index];  
            while(tem!=null)
             {
                 boolean isThere=checkUniqe(tem.key,key);
                 if(isThere)
                 {
                    tem.value=value;
                    return;
                 }
                 tem=tem.next;
             }
             newNode.next=arr[index];
             arr[index]=newNode;size++;
        }  
    }
     public String toString()
    {
        StringBuffer str=new StringBuffer();;
        str.append("{ ");  int count=0;
        for(int i=this.arr.length-1;i>=0;i--)
        {
            Node tem=arr[i];
           if(tem!=null)
           {
                 while(tem!=null)
                 {  
                     count++;
                    str.append((tem.next==null && count==this.size)? tem.key+" = "+tem.value+" ": tem.key+" = "+tem.value+", ");
                     
                     tem=tem.next;
                 }
           }     
        }
        return str.append("}")+"";
    }
    public T search(T searchKey)
    {
        int find=searchKey.hashCode()%capasity;
        Node tem=arr[find];
           while(tem!=null)
             {
                 if(searchKey.equals(tem.key))
                 {
                   return (T)tem.value;
                 } 
                 tem=tem.next;
             }
             return null;
    }
    public boolean remove(T deleteKey)
    {
        int find=deleteKey.hashCode()%capasity;
        Node tem=arr[find];
        if(tem==null)
        {
            return false;  
        }else if(deleteKey.equals(tem.key))
        {
            arr[find]=tem.next; size--;
            return true;
        }else
        {
           while(tem.next!=null)
             {
                 if(deleteKey.equals(tem.next.key))
                 {
                   tem.next=tem.next.next;    size--;
                   return true;
                 } 
                 tem=tem.next;
             }
        }     
             return false;
    }
     public void rehash()
    {                                                 
        capasity=capasity*2;    
         thrsolt=thrsolt*2; 
          size=0;                                            
        Node newArr[]=new Node[capasity];         
        Node tem[]=arr;                                 
        arr=newArr;                                     
        for(int i=0;i<tem.length;i++)
        {
             Node t=tem[i];             
             while(t!=null)
             {
                 put((T)t.key,(T)t.value);
                 t=t.next;
             }
        }
    }
    public void print()
    {
        for(int i=this.arr.length-1;i>=0;i--)
        {
            Node tem=arr[i];
            System.out.print(i+" --> ");
           if(tem!=null)
           {
                 while(tem!=null)
                 {  
                     System.out.print("["+tem.key+" = "+tem.value+" ]("+ tem.hash+")| ");
                     
                     tem=tem.next;
                 }
           }     System.out.println();
        }
    }
	public static void main(String[] args) 
	{
	  Scanner scan = new Scanner(System.in);           
	Hashtable table = new Hashtable();
	int option=1;
	try {
		   while(option>0)
        	{
        	    System.out.println("------------------------------------------");
        	    System.out.println("1. for adding into hashtable.");
        	    System.out.println("2. for searching");
        	    System.out.println("3. for delete");
        	    System.out.println("4. for print");
        	    System.out.println("5. for print bucked format:");
        	    System.out.println("------------------------------------------");
        	    option = scan.nextInt();
        	     switch(option)
        	     {
        	         case 1:System.out.println("Enter a key:");
        	               String k=scan.next();
        	               System.out.println("Enter a value:");
        	               String v=scan.next();
        	               table.put(k,v);
        	               break;
        	         case 2:System.out.println("Enter a key for search:");
        	               String findKey=scan.next();
        	               System.out.println(table.search(findKey));
        	               break;
        	         case 3:System.out.println("Enter a key for delete:");
        	               String removeKey=scan.next();
        	               System.out.println(table.remove(removeKey));
        	               break;
        	         case 4: System.out.println(table);
        	               break;
        	         case 5: table.print();
        	               break;      
        	         default:System.out.println((option==0)?"":"                   invalied option!");
        	               
        	                 
        	     }
        	}
	} catch(java.util.InputMismatchException e) {
	
	      System.out.println("                It is wrong input!\ntry new hashtable.");
	       main(new String[]{});
	       return;
         }
         finally
         {
             scan.close();
         }
	}
}

