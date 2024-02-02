import java.util.*;
import java.io.*;
public class SearchCSV_Value
{

 public static boolean search(HashSet set,String word)
 {
   for(Object element: set)
   {                         
      if(element.equals(word))
      {                                          
          return true;
      }
   }
   return false;
 }
public static void main(String[]arg)throws IOException
{
  HashSet<String> set= new HashSet(); 
   File file= new File("/home/zoho/santhosh/Assignment-2/Medium-Level/Untitled 1.csv"); 
    FileReader fin=new FileReader(file);
        int line=0;String str="";
        while((line=fin.read())!=-1)
        {
           if((char)line==',')
           {
             set.add(str); 
                str="";
           }else
           {
             str=str+(char)line;
           }                     
        }                                     
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
         String word=scan.nextLine();
        System.out.println(search(set,word)); 
            fin.close();
            scan.close();
         
   }
   
}       
