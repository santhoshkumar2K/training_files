import java.sql.*;
import java.util.*;
public class MarkDB
{
    static Connection con;
    private static String uName;
    private static String pw;
    private static String url;
    private static int examID=1001;
    private static PreparedStatement addExam;
    private static PreparedStatement getExam;
    private static PreparedStatement addMark;
    private static PreparedStatement addteacher;
    private static PreparedStatement getTeacher;
    private static PreparedStatement subjectTeacherMapping;
    private static PreparedStatement addsubject;
    private static PreparedStatement displaysubject;
    private static PreparedStatement addClassRoom;
    private static PreparedStatement getClassRoom;
    private static PreparedStatement addstudentClassMapping;
    private static PreparedStatement addteacherClassMapping;
    private static PreparedStatement addSection;
    private static PreparedStatement getSection;
    private static PreparedStatement getclasses;
    private static PreparedStatement getStudentDetails;
    private static PreparedStatement addstudentclassMapping;
    private static PreparedStatement updateClassRoomStudentCount;
    
    static
    {
       uName="postgres";
       pw="sarkar";
       url="jdbc:postgresql://localhost:5432/school";
              try
	      {
		 con=DriverManager.getConnection(url,uName,pw);
		 addExam=con.prepareStatement("insert into exam values(?,?,?,?)");
		 getExam=con.prepareStatement("select exam_id,exam,duration,date from exam");
		 addMark=con.prepareStatement("insert into mark(exam_id,classid,student_id,subject_id,mark) values(?,?,?,?,?)");
	      }catch(Exception e)
	      {
		 System.out.println("Not connection..."+e);
	      } 
    }
    
  public static boolean addExam(Exam exam) 
  {
    exam.setExamID(examID);
    java.sql.Date eDate= new java.sql.Date(exam.getDate().getTime());
        try{
	        addExam.setInt(1,examID++);
		addExam.setString(2,exam.getExamName());
		addExam.setInt(3,exam.getDuration());
		addExam.setDate(4,eDate);
		addExam.executeUpdate();
		return true;
	   }catch(SQLException e){  System.out.println("exam Not * connection..."+e);}  	
      return false;	    
  }
  public static ArrayList getExam()
  {
    ArrayList<Exam>exams= new ArrayList();
         try{  
		     ResultSet result=getExam.executeQuery(); 
	       while(result.next())
	       {
	          exams.add(new Exam(result.getInt(1),result.getString(2),result.getInt(3),result.getDate(4)));
	       }
	   }catch(Exception e){  System.out.println("Not * connection..."+e);}    
       return exams;	   
  }
  public static boolean addMarkMapping(int examID,int classID,int studentID,int subID,int mark) 
  {
    
      try{
	        addMark.setInt(1,examID);
		addMark.setInt(2,classID);
		addMark.setInt(3,studentID);
		addMark.setInt(4,subID);
		addMark.setInt(5,mark);
		addMark.executeUpdate();
		return true;
	}catch(SQLException e){  System.out.println("Not * connection..."+e);}  	
      return false;	     
  } 
 }

