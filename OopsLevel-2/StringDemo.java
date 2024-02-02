import java.util.Scanner;
public class StringDemo
{
     String string;
  StringDemo(String value)
  {
   this.string=value;
  }
private String concat(String str)
{
   return this.string+str;
} 
private char charAt(int index)
{
    char value=0;
   if(index>=this.string.length() || index<0)
   {
        System.out.println("StringIndexOutOfBoundException......");
   }else
   {
       char array[]=this.string.toCharArray();
       value= array[index];
   }
   return value;
 } 
private boolean endsWith(String str)
{
   int stringIndex=this.string.length(), count=0;
  if(str==null || str.length()>stringIndex)
  {
      System.out.println("StringIndexOutOfBoundException......");
      return false;
  }else
  {
      for(int index=str.length()-1; index>=0; index--)
      {
        if(str.charAt(index)==this.string.charAt(--stringIndex))
        {
          count++;
        }
      }
   }
       return (count==str.length())?true:false;
} 
private boolean startWith(String str)
{
   int count=0;
  if(str==null || str.length()>this.string.length())
  {
      return false;
  }else
  {
      for(int index=0; index<=str.length()-1; index++)
      {
        if(str.charAt(index)==this.string.charAt(index))
        {
          count++;                        
        }
      }
   }
       return (count==str.length())?true:false;
} 
private static String copyValueOf(char[] array)
{
  String str="";
   if(array.length==0 || array==null)
   {
       System.out.println("ArrayIndexOutOFBoundException........");
   }else
   {   
        for(int index=0; index<array.length; index++)
        {
          str=str+array[index];
        } 
     }
     return str;
}     
private  String substring(int beginIndex)
{
  String str="";
   if(beginIndex<0  || beginIndex>this.string.length())
   {
       System.out.println("StringIndexOutOfBoundException......");
   }else
   {   
        for(int index=beginIndex; index<this.string.length(); index++)
        {
          str=str+this.string.charAt(index);
        } 
     }
     return str;
}     
private int indexOf(String str)
{
   String concat; int check;
    for(int index=0; index<=this.string.length()-str.length(); index++)
    {	
      concat=""; check=0;
    	for(int next=index; check<str.length(); next++,check++)
    	{
    	     concat=concat+this.string.charAt(next);
    	}
    	if(concat.equals(str))
    	{
    	   return index;
    	}
    }
     return -1;
}  
  public static void main(String []arg)
  {
    Scanner scan = new Scanner(System.in);
     System.out.println("Enter a String: ");
     StringDemo word=new StringDemo(scan.nextLine());
     int option=1;
    while(option>0)
    {
     System.out.println("1.Check concat(string str): ");
     System.out.println("2.Check charAt(int index): "); 
     System.out.println("3.Check endsWith(string str): ");
     System.out.println("4.Check startWith(string str): "); 
     System.out.println("5.Check copyValueOf(char[]arr): ");
     System.out.println("6.Check substring(int beginindex): ");
     System.out.println("7.Check indexOf(String str): ");
       option=scan.nextInt();
       scan.nextLine();
        switch(option)
        {       
          case 1:System.out.println("enter a string for argument: ");
               System.out.println(word.concat(scan.nextLine()));
               break;
          case 2:System.out.println("enter a number for argument: ");  
                 System.out.println(word.charAt(scan.nextInt()));
                 break;
          case 3:System.out.println("enter a string for argument: ");
                 System.out.println(word.endsWith(scan.nextLine()));
                 break;
          case 4:System.out.println("enter a string for argument: ");
                 System.out.println(word.startWith(scan.nextLine()));
                 break;
          case 5:System.out.println("enter a string (convert into char array)for argument: ");
                char[]array=scan.nextLine().toCharArray();
                System.out.println(copyValueOf(array));
                break;
          case 6:System.out.println("enter a int for argument: ");
                 System.out.println(word.substring(scan.nextInt()));
                 break;       
          case 7:System.out.println("enter a string for argument: ");       
                 System.out.println(word.indexOf(scan.nextLine()));
                 break;
          default:System.out.println("unvalied input");                                  
               
        
        } 
    }  
      scan.close();        
  }
}
