 import java.util.Scanner;
 public class BinaryTree
 {
 Node root;
    BinaryTree(int v)
    {
        root=new Node(v);  
    }
    class Node
    {
        int key;
        Node left,right;
         Node(int value)
         {
             key=value;
             left=null;
             right=null;
         }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    public void buildTree(int v)
    {
        putValue(this.root,v);
    }
 
 public  void putValue(Node root,int v)
 {
     Scanner scan= new Scanner(System.in);
     Node newNode= new Node(v);
     System.out.println("add \""+v+"\" this value right of "+root.key+" root:(yes|no)");
     boolean input=(scan.next().equals("yes")?true:false);
     if(input)
     {
         if(root.right!=null)
         {
             putValue(root.right,v);
         }else{
             root.right=newNode;
             System.out.println("added...");
         }
         
     }else{
         System.out.println("add \""+v+"\" this value left of "+root.key+" root:(yes|no)");
         input=(scan.next().equals("yes")?true:false);
             if(input)
             {
                 if(root.left!=null)
                 {
                     putValue(root.left,v);
                 }else{
                     root.left=newNode;
                     System.out.println("added...");
                 }
                 
             }
     }
     
 }

    ////////////////////////////////////////////////////////////////////////////////////////////
    public void add(int value)
    {
        put(root,value);
    }
    public Node put(Node root, int value)
    {
        if(root==null)
        {
            return new Node(value);
        }
		 if(value>root.key)
		 {
		     root.right=  put(root.right,value);
		 }else if(value<root.key)
		 {
		     root.left=put(root.left,value);
		 }
        return root; 
    }
    public boolean search(Node root, int value)
    {      
        if(root==null)
        {
            return false ;
        }else if(root.key==value)
        {
            return true;
        }
        
             if(value>root.key)
             {                              
                 search(root.right,value);         
             }else if(value<root.key)
             {                               
                 search(root.left,value);          
             }
             return false;
    }
    public Node remove(Node root, int value)
    {
        if(root==null)
        {
               return  root;
        }
         if(value>root.key)
         {
               root.right=  remove(root.right,value);
         }else if(value<root.key)
         {
               root.left=remove(root.left,value);
         }else{
             
		     if(root.left==null)
		     {                                 
		          return root.right;       
		     }else if(root.right==null)
		     {
		          return root.left;
		     }else
		     {
		          root.key=min(root.right);
		          root.right=remove(root.right,root.key);
		     }
         }
        return root; 
    }
    public int min(Node root)
    {
        int minvalue=root.key;
        while(root!=null)
        {
            minvalue=root.key;
            root=root.left;
        }
        return minvalue;
    }
    public static void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.key+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.print(root.key+" ");
            inOrder(root.right);
        }
    }
    public static void postOrder(Node root)
    {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key+" ");
        }
    }
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	try {  
	   System.out.println("Enter a root value:");
	   BinaryTree tree = new BinaryTree(scan.nextInt());
	   int option=1;
	
		   while(option>0)
        	{
        	    System.out.println("----------------------------------");
        	    System.out.println("1. for adding element (comparing order)into a binary tree.");
        	    System.out.println("2. for printing in PreOrder form:");
        	    System.out.println("3. for printing in InOrder form:");
        	    System.out.println("4. for printing PostOrder form:");
        	    System.out.println("5. for search element:");
        	    System.out.println("6. for delete an element:");
        	    System.out.println("7. for buildTree.");
        	    System.out.println("----------------------------------");
        	    option = scan.nextInt();
        	     switch(option)
        	     {
        	         case 1:System.out.println("Enter a value:");
        	               int val=scan.nextInt();
        	               tree.add(val);
        	               break;
        	         case 2: preOrder(tree.root);
        	               break;
        	         case 3: inOrder(tree.root);
        	               break;
        	         case 4: postOrder(tree.root);
        	               break;                  
        	         case 5:System.out.println("Enter a key for search:");
        	               int findKey=scan.nextInt();
        	               System.out.println(tree.search(tree.root,findKey));
        	               break;
        	         case 6:System.out.println("Enter a key for delete:");
        	               int removeKey=scan.nextInt();
        	               System.out.println(tree.remove(tree.root,removeKey));
        	               break;
        	         case 7: System.out.println("Enter a value:");
        	               int v=scan.nextInt();
        	               tree.buildTree(v);    
        	               break;
        	         default:System.out.println("                   invalied option!");
        	               
        	                 
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

