import java.util.*;
import java.io.*;
public class IterateTheArrayList
{
 public static void display(ArrayList list)
 {
      Iterator iterate=list.iterator();
      while(iterate.hasNext())
      {
          System.out.println(iterate.next());
      }
 }
public static void main(String[]arg)throws IOException
{
  ArrayList <String>list =new ArrayList<String>();
   File file= new File("//home//zoho//santhosh//Assignment-2//Medium-Level//abc.txt"); 
    FileReader fi=new FileReader(file);
    BufferedReader buff= new BufferedReader(fi);
       int line=0;String str="";
        while((line=buff.read())!=-1)
        {
           if((char)line==' ')
           {
             list.add(str); 
                str="";
           }else
           {
             str=str+(char)line;
           }                     
        }
       
       display(list);
       buff.close();
}
}
