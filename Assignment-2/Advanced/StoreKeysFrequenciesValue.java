import java.util.*;
public class StoreKeysFrequenciesValue
{ 
 public static void display(HashMap map)
 {
      Set<Map.Entry <String, Integer>> pairs= map.entrySet();
    for(Map.Entry pair:pairs)
    {
       System.out.println("Word : "+pair.getKey()+"     = "+pair.getValue()+" times");
    }
 }
public static void main(String[]arg)
{
  Scanner scan = new Scanner(System.in);
    System.out.println("Enter a text:");
    String text=scan.nextLine().trim();
    String words[]=text.split(" ");
   HashMap map= new HashMap();
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
       display(map);
       scan.close();
}
}

