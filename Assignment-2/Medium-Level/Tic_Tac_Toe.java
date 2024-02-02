import java.util.Scanner;
public class Tic_Tac_Toe
{
  static String []board = new String[9];
  private static void board(String board[])
  {
    System.out.println("|---|---|---|");
    System.out.println("| "+board[0]+" | "+board[1]+" | "+board[2]+" | ");
    System.out.println("|-----------|");
    System.out.println("| "+board[3]+" | "+board[4]+" | "+board[5]+" | ");
    System.out.println("|-----------|");
    System.out.println("| "+board[6]+" | "+board[7]+" | "+board[8]+" | ");
    System.out.println("|---|---|---|");
  }
  private static boolean winning()
  {
     int start=0, jump=1,  collect=1;String win="";int count=0;
	     for(int check=0;check<=5;check++)
              {
		   if(check!=0 && check<4){
	    	      start=check-1;
	    	      jump=3;         
    		   }else if(check==4)
    		   {
    		     start=2; 
    		     jump=2;          
    		   }else if(check==5)
    		   {
    		     start=0;
    		     jump=4;
    		   }
	    		for(int column=start; column<9;  column=column+jump)
	    		{   
	    		   win=win+board[column]; 
	    		    if(win.equals("XXX"))
	    		    {
	    		        System.out.println("                Winning....\"X\""); return true;
	    		    }else if(win.equals("OOO"))
	    		    {
	    		      System.out.println("                  Winning....\"O\""); return true;
	    		    }
	    		    if(collect==3)
	    		    {
	    		        collect=0;win="";
	    		    }
	    		    collect++;
	    		}
    		}
          return false;		
  }
  private static boolean checkInput(int n)
  {
     if(n<=0 || 9<n)
     {                                 
      return false;
     }
     return true;
  }
  private static void  ticTacToe(Scanner scan)
  {
       System.out.println("first start with \"X\" :");
     board(board);
   String put="X";
   boolean finish=false;
   int playCount=0;
   while(!finish)
    {
	     System.out.println("This turn --> "+put);
	     int input;
	     System.out.println("Select a column !:");
	     try
	     {
		input=scan.nextInt();
	     }catch(java.util.InputMismatchException e)
	     {
		System.out.println("                   ! Invalied Input");
	       continue;
	     } 
		      if(!checkInput(input))
		      {
				System.out.println("unvalied input please try again!");
				continue;
		      }else
		      {
				if(board[input-1].equals("X") || board[input-1].equals("O"))
				{
				  System.out.println("Already this column is played !  so Can not apply again...");
				  continue;
				}else
				{
				  board[input-1]=put;
				  playCount++;
				} 
		      } 
		      board(board); 
		     if(playCount>=5)
		     {
			  finish=winning();
		     } 
		     if(playCount==9 && !finish)
		     {
			  System.out.println("                  \"Match draw\"");
			  break;
		     }
	      put=(put.equals("X")?"O":"X");
     }

  }
public static void main(String [] args)
{
   Scanner scan= new Scanner(System.in);
	  for(int index=0;index<9;index++)
	  {
	    board[index]=(index+1)+"";
	  }
	  ticTacToe(scan);
	  scan.close();
   
}
}

