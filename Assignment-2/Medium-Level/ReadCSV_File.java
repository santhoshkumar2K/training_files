import java.util.*;
import java.io.*;
public class ReadCSV_File
{
 
 public static void add(String[]arr,String key[],HashMap map,int opt)
 {
   for(int i=0;i<arr.length;i++)
   {
     if(opt==1)
     {
       map.put(arr[i],"");
     }else if(opt==2)
     {
        if(map.containsKey(key[i]))
        {
            String v=(map.get(key[i])!="")? map.get(key[i])+","+arr[i] : map.get(key[i])+arr[i];
           map.put(key[i],v);
        }
     }
   }
 }
public static void main(String[]arg)throws IOException
{
  HashMap map= new HashMap(); 
    FileReader fi=new FileReader("/home/zoho/santhosh/Assignment-2/Medium-Level/Untitled 1.csv");
    BufferedReader buff= new BufferedReader(fi);
       String line=""; 
       boolean title=true;
       String s[]=null;String key[]=null;
        while((line=buff.readLine())!=null)
        {
            if(title)
            {
             String[]  ss=line.split(",");
             key=ss;
             title=false; 
             add(ss,key,map,1);
            }else
            {
              s=line.split(",");
              add(s,key,map,2);     
            }
            
        }
        Set <Map.Entry<String,String>>elements=map.entrySet();
        for(Map.Entry element:elements )
        {
           System.out.println(element.getKey()+" = "+element.getValue());
        }
        buff.close();
         
   }
   
}       
