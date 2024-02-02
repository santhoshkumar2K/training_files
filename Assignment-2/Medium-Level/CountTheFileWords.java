import java.util.*;
import java.io.*;
public class CountTheFileWords
{
 public static void display(TreeMap map)
 {                                                   
      Set<Map.Entry <String, Integer>> pairs= map.entrySet();
    for(Map.Entry pair:pairs)
    {
       System.out.println("Word : "+pair.getKey()+"     = "+pair.getValue()+" times");
    }
 }
public static void main(String[]arg)throws IOException
{
  Scanner scan= new Scanner(System.in);
  TreeMap <String, Integer>map= new TreeMap();
   FileReader fi=null;
    BufferedReader buff=null;
  try
  {
      File file= new File("//home//zoho//santhosh//Assignment-2//Medium-Level//fileA.txt"); 
       fi=new FileReader(file);
       buff= new BufferedReader(fi);
        String words[]=null;
        String line="";
        while((line=buff.readLine())!=null)
        {
            line=line.trim();
            words=line.split(" "); 
        }
        int count=0;
        for(String element:words)
        {
           count=1;                                        
              if(!element.equals(""))
              {
                    if(map.containsKey(element))
                    {
                       count=(int)map.get(element);          
                        count++;
                    }
                map.put(element,count);
              }    
        }   
   }catch(FileNotFoundException e) 
   {
	      System.out.println("                File not found...please try again with currect file!");
   } 
   finally{
   try{
      buff.close();
      fi.close();
      scan.close();
      }catch(Exception e){}
   }                                 
       display(map);
}
}
