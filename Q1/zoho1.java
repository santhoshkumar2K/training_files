public class zoho1
{
public void s()
{
	int n=5;
		int no=1;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<(n+(n-1))-i;j++)
		    {
		        if(j>=(n-1)-i)
		        {
                   if(i%2==0)
                   {
                       System.out.print(no+++" ");
                   }else{
                       System.out.print(--no+" ");
                   }
		        }else{
		            System.out.print("  ");
		        }
		    }
		    no=no+n;
		    System.out.println();
		    
		}
		int ii='1';System.out.println("--> "+ii);
	}
	public void  stringMatch()
	{
	 String q="abc";
	 String str="a for acle b for ball c fobr cat indb acceb";
	          
	 int start=0,end=str.length()-1,y=0,u=0;
	 int min=9999;String m="",t="";
//	  System.out.print(str.indexOf("a") +" "+str.indexOf("c"));
	
	  for(int i=0;i<str.length();i++)
	  {
	      if(str.charAt(i)==q.charAt(0))
	      {                                                     
	          for(int j=i+1;j<str.length();j++)
	          {
	              if(str.charAt(j)==q.charAt(q.length()-1))
	              {                                      // System.out.println(str.substring(i,j+1));
	                 t=str.substring(i,j+1);      //System.out.println(t);
	                 if(t.contains("b"))
	                {   
        	              if(Math.abs(i-j)<min)
        	              {
        	                //System.out.println(min+"************ "+t);
        	               min=Math.min(Math.abs(i-j),min); 
        	               m=t;
        	              }     
	                 }
	              }      
	          }
	      }
	  }   
	  System.out.println(m);
	}  
	  
    public static void m()
    {
    	int n=11;
		int c=0;
		int i;
		for( i=3;true;i++)
		{
		    int num=i;
		    while(num>0)
		    {
		        int r=num%10;
		        if(r==3||r==4)
		        {
		            c++;  
		            break;
		        }
		        num=num/10;
		    }
		    if(c==n)
		    {
		      break;
		    }
		}System.out.println(i);
    
    }
    public static int m2(int[] arr) {
        int firstLast=0,lastFirst=arr.length-1;
        for(;firstLast<arr.length-1;firstLast++){
            if(arr[firstLast]>arr[firstLast+1]) break;
        }                         //System.out.println(arr[firstLast]);
		//Base case for a non-decreasing sequence
        if(firstLast==arr.length-1) return 0;
        for( ;lastFirst>0;lastFirst--){  // System.out.print(" "+arr[lastFirst]);
            if(arr[lastFirst]<arr[lastFirst-1]) break;
        }          System.out.println(firstLast+" "+lastFirst);              //System.out.println("\n"+arr[lastFirst]);
		System.out.println((firstLast-1!=0)?arr[firstLast-1]+" - "+arr[lastFirst]:"");
        for(int i=firstLast;i<=lastFirst;i++)
        {
            if(firstLast-1!=0 && !(arr[firstLast-1]<arr[i]))
            {
             System.out.print("* "+arr[i]);
            }else{
                //if(arr[firstLast-1]>arr[lastFirst])
                System.out.print(" "+arr[i]);
            }
            //System.out.print((firstLast-1!=0)?arr[firstLast-1]+" "+arr[i]:"null");
        }System.out.println();
        return 0; //minLength;
    }
    public static void m1()
    {
       //int a[]={33,2,1,2,3,4,5,6};//  +  i
     
        int a[]={0,3,2,1,2,4,6,8,18};// +  i
         int a1[]={0,1,3,2,1,-1,4,5,6,7};  // -  i+1
        // int a1[]={1,2,3,4,5,4}; // -     i+1
          System.out.println("----------------------------------------------");
         m2(a);
         System.out.println("----------------------------------------------");
         m2(a1);
    }     
public static void main(String[]a)
{

 int a[][]={
	               {1,2,3,4},
	               {5,6,7,8},
	               {9,10,11,12},
	               {13,14,15,16}
	               };
	               
	       System.out.println("enter row:");
	       int row = s.nextInt()-1;
	       System.out.println("enter column");
	       int col=s.nextInt()-1;
	       int l= a.length,c=1;
	       boolean b=true;
         for(int i=0;i<(l*l);i++)
         {
            /*if(row==a.length && col==a.length-1)
            {
                break;
            }*/
            if(b)
            {
                
                if(col!=a.length)
                {
                System.out.print(a[row][col++]+" ");
                }
                else{
                    b=false;  System.out.println("*--> "+c++);        //System.out.print(" Array-"+c+++": ");
                }
                
            }
             if(!b)
            {
                if(c==4 || (row==a.length-1 && col==a.length))
                {
                    break;
                }
                
                if(row!=a.length)
                {
                System.out.print(a[row++][--col]+" ");    //System.out.print(" Array-"+c+++": ");
                }
                else{
                    b=true;  System.out.println("--> "+c++);
                    row=row-1;
                }
                
            }
         }
	
	}

}
