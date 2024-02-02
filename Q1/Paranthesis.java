
import java.util.*;
public class Paranthesis
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String s="w))mnd((dbc)qw((jdjjwu)()";char[]ch=s.toCharArray();
		          System.out.println(new String(ch));
		int a[]=new int[10],k=0;
		int b[]=new int[10],j=0;
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)=='(')
		    {
		       a[k++]=i; 
		    }if(s.charAt(i)==')')
		    {
		        b[j++]=i;
		    }
		}                                                                                         System.out.println(Arrays.toString(a)+"\n"+Arrays.toString(b));
		if(k!=j)
		{
		    System.out.println(k+" no "+j);
		    return;
		}int c=0;//////////////////////////n=0,m=0;
		for(int i=0;i<k;i++)
		{
		   for(int h=k-1;h>=0;h--)
		   {
		       if(a[h]!=-1 && a[h]<b[i])
		       {
		           c++;                                                                           System.out.println(a[h]+" = "+b[i]+">>"+((h-1>0)?a[h-1]:""));
		           a[h]=-1;b[i]=-1;
				if((h-1)>=0 && a[h-1]!=-1) ////
			       {                     
				   ; 
				   ch[a[h-1]]=')';
			       }                          ////
		           break;
		       }
		       
		   }if(b[i]!=-1){                        //
		            ch[b[i]]='(';                                                                       
		       }                                 //
		}System.out.println(c==k); 
		
		System.out.println(new String(ch));
		
	}
}

