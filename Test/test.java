import java.util.*;
public class test
{
public static void diamond(){
	int number=10, p=number;
   
		 int n=((number*2)-1)-2;
		   for(int r=1; r<=((number*2)-1) ;r++)
		  {
		    for(int c=1; c<=(number+(number-1)) ;c++)
		    {
		        if(r<=number){
		        if(c<=(number-r)){
		            System.out.print(" ");  
		        }else{
		           
		            if(c<=p){
		             System.out.print("*");  
		            }
		        }
		        }
		        
		        if(r>number){
		            if(c<=(r-number))
		            {
		                System.out.print(" ");  
		            }else{
		             if((n+1)>=c){
		            System.out.print("*");  
		             }
		                
		            }
		        } 
		    }
		    if(r<=number)
		    {
		        p=p+1;
		    }
		    if(r>number)
		    {
		      n=n-1;
		    }
		      System.out.println();  
		  }
}
public static void main(String []aaa)
{
 Scanner scan= new Scanner(System.in);
 System.out.println("Enter a String: ");
 String str= scan.nextLine();
 
   for(int index=0; index<str.length();index++)
   {
     if(str.charAt(index)!='0')
     {
      // System.out.print(str.charAt(index));
     }
   }
   countBits(2);
  /* int array1[]={1,2,3,4,5};
   int array2[]={0,0,1,2,4,7,8,9};
   int array3[]={0,2,3,7};
   int a=0, b=0, c=0;
      while(a<array1.length && b<array2.length && c<array3.length)
      {
        if(array1[a]==array2[b] && array2[b]==array3[c])
        {
           System.out.println("commons: "+array1[a]);
           a++;
           b++;
           c++;
        }else if(array1[a]>array2[b])
        {
          b++;  System.out.println("b "+b);
        }else if(array2[b]>array3[c])
        {
          c++;  System.out.println("c "+c);
        }else{
         a++;   System.out.println("a "+a);
        }
        System.out.println("------------------------------");
      }
   */
   }
    public static void countBits(int n) {
        int index=0;String str="";
        int arr[]=new int[n+1];
        arr[0]=0;
  for(int i=0;i<arr.length;i++)
  {
        if(arr[i]==0){
            arr[i+1]=1;
        }
        if(arr[i]%10==0 && arr[i]!=0){
            arr[i+1]=arr[i]+1;
        }else
        {
        int g=arr[i];
          while(g>0)
          {
           int y= g%10;
              str=str+9;
              g=g/10;
          }
      //    arr[i]=arr[i]+Integer.parseInt(str);
        System.out.println(str);
        }
   }
   System.out.println(Arrays.toString(arr));
    }

   


}
