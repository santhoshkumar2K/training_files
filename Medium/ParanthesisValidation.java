import java.util.Scanner;
public class ParanthesisValidation
{
   
 public static void findParanthesis(String sentence,int input)
 {
  int open =0,close=0,openIndex=0,closeIndex=0;
  for(int character=0;character<sentence.length();character++)
  {
    if(sentence.charAt(character)==40){
       open++;
    }else if(sentence.charAt(character)==41)
    {
   close++;}
  }
  if(open==close)
  {
     int opening[]=new int[open];
     int closing[]=new int[close];
    for(int character=0;character<sentence.length();character++)
    {
        if(sentence.charAt(character)==40)
        {
          opening[openIndex++]=character;
        }else if(sentence.charAt(character)==41)
        {
          closing[closeIndex++]=character;
        }
    } 
      int maxMin;
      if(closing[0]<opening[0] || input>opening[opening.length-1])
      {
       System.out.println("Unvalied...");
      }else{
          for(int i=0;i<closing.length;i++)
          {
           maxMin=0;
            for(int j=opening.length-1;j>=0;j--)
            {
               if(closing[i]>opening[j] && opening[j]!=-1)
               {
                 maxMin=opening[j];
                 opening[j]=-1;
                 if(maxMin==input){
                 System.out.println("open start "+maxMin+" close "+closing[i]);}
                 break;
               }
             }
           }
       }  
  }else
  {
    System.out.println("unvalied....");
  }
 }
public static void main(String []  arr)
{
  Scanner scan= new Scanner(System.in);
   
  System.out.println("Enter your sentence: ");
   String sentence=scan.next();
   System.out.println("Enter a opening paranthesis and find their closing index: ");
   int  open=scan.nextInt();
   findParanthesis(sentence,open);
}
}
