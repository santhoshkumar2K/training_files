
public class MyThread extends Thread
{      static int person=1;
      boolean energy=true;

    MyThread(String name)
    {
        super(name);
    }
    
    private void rest(long time)
    {
        try {
                Thread.sleep(time);
            } catch( InterruptedException e) {
            }
    }
    public void endOfTheGame()
    {  
        if(this.isDaemon())
        {
            System.out.println(this.getName()+" reached");
            rest(3000);
        }
        synchronized (this)
        {
         System.out.println(person+++" Winning is >> "+Thread.currentThread().getName());
           this.notifyAll();   
        }   
    }
    public void run()
    {
        if(Thread.currentThread().getName().equals("Horse-1") || Thread.currentThread().getName().equals("Horse-4"))
        {
             energy=false;
             System.out.println(Thread.currentThread().getName()+" so tired");
        }
        
        for(int km=0;km<1000;km++)
        {
           if(!energy && km%5==0)
           {
               rest(10);
           }
        }
        
        endOfTheGame();
    }
  
	public static void main(String[] args) throws InterruptedException
	{ 
	   // Win w= new Win();
	     Thread main=Thread.currentThread();
		     System.out.println("name of main thread: "+main.getName());
		       main.setName("Owner");
		     System.out.println("Now main thread: "+main.getName()+"\n-------------------------------------------------------------");
		MyThread thread1= new MyThread("Horse-1");            //sleep & late
		MyThread thread2= new MyThread("Horse-2");
		MyThread thread3= new MyThread("Horse-3");            // high priority
		MyThread thread4= new MyThread("Horse-4");            //sleep & late
		MyThread thread5= new MyThread("Horse-5");
		
		MyThread checkingMain= new MyThread("jeep");
		   checkingMain.setDaemon(true);
		   checkingMain.setPriority(10);
		     System.out.println("                             Lets start : $$\n");
		    checkingMain.start();
		     thread1.start();
		     thread2.start();
		     thread3.start();
		     thread4.start();
		     thread5.start();   
		    
		    synchronized(checkingMain) 
		    {
		       System.out.println("********OWNER WAITING********");
		       checkingMain.wait();
		    }     
		     System.out.println("                              Game Over");
		      
	}
}

