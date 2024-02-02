import java.util.*;
class Node <T>
{
     T obj;
     ArrayList <T>edge= new ArrayList();
    Node(T value)
    {
        obj=value;
    }
    public String toString()
    {
        return obj+"";
    }
}
public class Graph <T>
{
    ArrayList<Node> vertex= new ArrayList<>();
    int edges=0;
    int vertexCount=0;
 public boolean addVertex(T value)
 {                                  
     if(!contains(value,vertex))
     {
        vertex.add(new Node(value));
        vertexCount++;
        return true;
     }
     return false;   
 }     
 public boolean addEdge(T value1,T value2)
 {
    if(isPresent(value1,vertex)==-1 || isPresent(value2,vertex)==-1)
    {
        return false;
    }
    if(vertex.get(isPresent(value1,vertex)).edge.contains(value2))
    {
        return false;
    }    
          vertex.get(isPresent(value1,vertex)).edge.add(value2);
          vertex.get(isPresent(value2,vertex)).edge.add(value1);
          edges++;
        return true;
 }
 public void bfs(T value)
 {
     if(isPresent(value,vertex)==-1)
     {
         System.out.println("vertex not found! in this index "+value);
         return;
     }
     boolean[]visited= new boolean[vertex.size()];
                Queue q= new LinkedList();
                q.add(value);
                visited[isPresent(value,vertex)]=true;
            while(!q.isEmpty())
            {
                T element=(T)q.remove();
                int index=isPresent(element,vertex);
                System.out.print(vertex.get(index).obj+" ");
                 for(int i=0;i<vertex.get(index).edge.size();i++)
                 {
                      T connects  =(T)vertex.get(index).edge.get(i); 
                      int inde_x=isPresent(connects,vertex);
                     if(!visited[inde_x])
                     {
                         visited[inde_x]=true;
                         q.add(connects);
                     }
                 }
            }
            System.out.println();
 }
 public void dfs(T value)
 {
    if(isPresent(value,vertex)==-1)
     {
         System.out.println("vertex not found! in this index "+value);
         return;
     }
     boolean[]visited= new boolean[vertex.size()];
       dfs(visited,value);
       System.out.println();
 }
 public void dfs(boolean []visited,T value)
 {
     int index=isPresent(value,vertex);
       visited[index]=true;  
       System.out.print(vertex.get(index).obj+" "); 
    for(int i=0;i<vertex.get(index).edge.size();i++)
    {
        T connects =(T)vertex.get(index).edge.get(i);   
        int inde_x= isPresent(connects,vertex);
         if(!visited[inde_x])
         {
            dfs(visited , connects);                
         }   
    }
    
 }
public boolean removeEdge(T value1 ,T value2)
 {
    if(isPresent(value1,vertex)>-1  && isPresent(value2,vertex)>-1 )
     {
       vertex.get(isPresent(value1, vertex)).edge.remove(value2);
       vertex.get(isPresent(value2, vertex)).edge.remove(value1);
       edges--;
        return true;
     }else 
     {
         return false;
     }
        
 }
  public boolean removeVertex(T value)
 {
    if(isPresent(value,vertex)==-1)
    {
        return false;
    }
    int index =isPresent(value,vertex);
          for(int i=0;i<vertex.get(index).edge.size();i++)
          {
             T edge_s= (T)vertex.get(index).edge.get(i);    
             int inde_x=isPresent(edge_s,vertex);
             vertex.get(inde_x).edge.remove(value); 
              edges--;
          }
          vertex.set(index,null);
          vertexCount--; 
        return true;
 }
 public void print()
 {
     for(int i=0;i<this.vertex.size();i++)
     {
         if(vertex.get(i)!=null)
         {
            System.out.println("("+i+")"+vertex.get(i)+" --->"+vertex.get(i).edge);
         }
     }
 }
 public  boolean contains(T o, ArrayList<Node>arr)
 {
    for(Node element: arr)
    {                         
        if (element!= null && element.obj.equals((T)o))
        {
            return true;
        }
    }
    return false;
 }
 public  int isPresent(T o, ArrayList<Node>arr)
 {
    for(int i=0;i<arr.size();i++)
    {                         
        if (arr.get(i)!= null && arr.get(i).obj.equals((T)o))
        {
            return i;
        }
       
    }
    return -1;
 }
 
public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
   	try {  
	   Graph graph = new Graph();
	   int option=1;

		   while(option>0)
        	{
        	    System.out.println("----------------------------------"); 
        	    System.out.println("1. for add  vertex ");
        	    System.out.println("2. for add edge between two vertex.");
        	    System.out.println("3. for printing breadth traverse:");
        	    System.out.println("4. for printing depth traverse:");
        	    System.out.println("5. for printing normal:");
        	    System.out.println("6. for delete a verdex:");
        	    System.out.println("7. for delete a edge between two verdex.");
        	    System.out.println("8. for find the number of edges in this Graph.");
        	    System.out.println("9. for find the number of vertex in this Graph.");
        	    System.out.println("----------------------------------");
        	    option = scan.nextInt();
        	    scan.nextLine();
        	     switch(option)
        	     {
        	         case 1:System.out.println("Enter a vertex: ");
        	               String vertex=scan.next();
        	               System.out.println(graph.addVertex(vertex));
        	               break;
        	         case 2:System.out.println("Enter first vertex   edge");
        	                  String first=scan.nextLine();
        	               System.out.println("Enter second vertex  edge");
        	                  String second=scan.nextLine();
        	               System.out.println(graph.addEdge(first,second));
        	               break;
        	         case 3:System.out.println("Enter a vertex edge for start: ");
        	               String start=scan.nextLine();
        	               graph.bfs(start);
        	               break;
        	         case 4: System.out.println("Enter a vertex edge for start: ");
        	               String from=scan.nextLine();
        	               graph. dfs(from);
        	               break;                  
        	         case 5:graph.print();
        	               break;
        	         case 6:System.out.println("Enter a vertex index for delete:");
        	               String delete=scan.nextLine();
        	               System.out.println(graph.removeVertex(delete));
        	               break;
        	         case 7:System.out.println("Enter from vertex edge");
        	               String vertex1=scan.nextLine();
        	               System.out.println("Enter to vertex  edge");
        	               String vertex2=scan.nextLine();
        	               System.out.println(graph.removeEdge(vertex1,vertex2));   
        	               break;
        	         case 8:System.out.println("Number of edges: "+graph.edges);
        	               break;
        	         case 9:System.out.println("Number of vertex: "+graph.vertexCount);
        	               break;        
        	         default:System.out.println((option==0)?"":"                   invalied option!");
        	               
        	                 
        	     }
        	}
	} catch(java.util.InputMismatchException e)
	 {
	     System.out.println("                It is wrong input!\n so try again start from new LinkedList");
	      main(args);
	      return;
         }
         finally{
            scan.close();
         }
 }
}      
