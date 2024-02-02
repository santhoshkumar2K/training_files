public class Sleep 
{   
public static void main(String[]arg)
{
     Thread thread1= new Thread()
                  {
                      public void run()
                       {
		            try{
		                for(int i=1;i<=10;i++)
		                {
		                    System.out.println(i);
		                    Thread.sleep(1000);
		                }
		            }catch(Exception e){}    
		        }    
                  };
      
       thread1.start();
}
}

