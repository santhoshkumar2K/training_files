import java.util.*;
import java.text.SimpleDateFormat;
public class Main
{
	public static void main(String[] args)throws Exception
	{       
	        System.out.println(new School(1,12,2).classes);
		Scanner  scan = new Scanner(System.in);
		int option=1;
		while(option>0)
		{
		    System.out.println("________________________");
		    System.out.println("1.Student");
		    System.out.println("2.Teacher");
		    System.out.println("3.");
		    System.out.println("_________________________");
		      option=scan.nextInt();
		        scan.nextLine();
		    switch(option)
		    {
		         case 1: GetRuntimeData.studentRecord(scan);
		               break;
		         case 2:GetRuntimeData.teacherRecord(scan);
		               break;
		         case 3:GetRuntimeData.schoolRecord(scan);
		                break;      
		               
		    }
		   
		}
		
	}
}

