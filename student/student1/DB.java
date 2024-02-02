import java.sql.*;
import java.util.*;
public class DB
{
    static Connection con;
    private static int count=1;
    private static int studentCount=1;
    private static int teacherCount=2;
       static boolean start;
    private static String uName;
    private static String pw;
    private static String url;
    private static PreparedStatement addstudent;
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
		 addstudent=con.prepareStatement("insert into Student values(?,?,?,?,?,?)");
		 addteacher=con.prepareStatement("insert into Teacher values(?,?,?,?,?,?)");
		 getTeacher=con.prepareStatement("select teacher_id,name,dob,gender,qualification,bloodgroup from teacher");
		 subjectTeacherMapping=con.prepareStatement("insert into classsubjectteachermap (classid,subject_id,teacher_id)values(?,?,?)");
		 displaysubject=con.prepareStatement("select subject_id as subjectID,subject from subject");
		 addSection=con.prepareStatement("insert into section  values(?,?)");
		 getSection=con.prepareStatement("select section_id,section from Section");
		 addClassRoom=con.prepareStatement("insert into ClassRoom values(?,?,?,?,?,?,?)");
		 addteacherClassMapping=con.prepareStatement("update classroom set teacher_id =? where classid=?");
		 getStudentDetails=con.prepareStatement("select student.student_id,student.name,student.father_name,student.gender,student.dob,student.bloodgroup,classroom.classid,section.section,classroom.std,classroom.capasity from  studentclassMapping join  classroom on  classroom.classid=studentclassmapping.classid join student on student.student_id=studentclassmapping.student_id join section on section.section_id=classroom.sec_id where classroom.std=? and student.dob=?");
		 getClassRoom=con.prepareStatement("select classid,section.section,std,student_count,capasity from classroom   join section on section. section_id=sec_id  where classid in (select max(classid) from classroom where std=?)");
		 getclasses=con.prepareStatement("select c.classid,section.section,c.std,c.student_count,c.capasity from classroom c  join section on section. section_id=c.sec_id where c.std>? and c.std<?");
		 addstudentclassMapping=con.prepareStatement("insert into studentclassMapping (student_id,classid)values(?,?)");
		 updateClassRoomStudentCount=con.prepareStatement("update  classroom set student_count=? where classid=?");
	      }catch(Exception e)
	      {
		 System.out.println("Not connection..."+e);
	      } 
    }
    
  public static boolean addStudent(Student student) 
  {
    student.setStudentID(studentCount);
    java.sql.Date sDate= new java.sql.Date(student.getDOB().getTime());
        try{
	        addstudent.setInt(1,studentCount++);
		addstudent.setString(2,student.getName());
		addstudent.setString(3,student.getFatherName());
		addstudent.setString(4,student.getGender().toString());
		addstudent.setDate(5,sDate);
		addstudent.setString(6,student.getBloodGroup().toString());
		addstudent.executeUpdate();
		return true;
	   }catch(SQLException e){  System.out.println("Not * connection..."+e);}  	
      return false;	    
  } 
  public static int addTeacher(Teacher teacher) 
  {
    teacher.setTeacherID(teacherCount);
    java.sql.Date sDate= new java.sql.Date(teacher.getDOB().getTime());
      try{
	        addteacher.setInt(1,teacherCount++);
		addteacher.setString(2,teacher.getName());
		addteacher.setDate(3,sDate);
		addteacher.setString(4,teacher.getGender().toString());
		addteacher.setString(5,teacher.getDegree().toString());
		addteacher.setString(6,teacher.getBloodGroup().toString());
		addteacher.executeUpdate();
		return 1;
	}catch(SQLException e){  System.out.println("Not * connection..."+e);}  	
      return -1;	     
  } 
  public static ArrayList getTeacher()
  {
    ArrayList<Teacher>teachers= new ArrayList();
         try{  
		     ResultSet result=getTeacher.executeQuery(); 
	       while(result.next())
	       {
	          teachers.add(new Teacher(result.getInt(1),result.getString(2),result.getString(3),
	          Gender.valueOf(result.getString(4)),Degree.valueOf(result.getString(5)),BloodGroup.valueOf(result.getString(6))));
	       }
	   }catch(Exception e){  System.out.println("Not * connection..."+e);}    
       return teachers;	   
  }
  public static int getID(String idName,String tableName,String where)
  {
           String query="select "+idName+" from "+tableName+" where "+where;
          
      try
     {
	   //  Connection con=connect();
	     PreparedStatement pr=con.prepareStatement(query);
		ResultSet result=pr.executeQuery();        
		result.next();                                  
		int id=result.getInt(1);                      
		pr.close();
		return id;
      }catch(SQLException e){  /*System.out.println("Not ?id connection..."+e);*/}	
      return -1;	 
  }
  public static boolean subjectTeacherMapping(int subID,int teacherID,int classID)
  {
      try{  
                subjectTeacherMapping.setInt(1,classID);
	        subjectTeacherMapping.setInt(2,subID);
		subjectTeacherMapping.setInt(3,teacherID);
		int update=subjectTeacherMapping.executeUpdate();
		return update>0;
	}catch(SQLException e){  System.out.println("Not * connection..."+e);}  	
      return false;	 
  }
  public static void displaySubjects()
  {
         try{
	       ResultSet result=displaysubject.executeQuery();
	       System.out.println("----------------------\"Select subject\"----------------------");
	       while(result.next())
	       {
	          System.out.println(result.getInt(1)+". "+result.getString(2));
	       }
	       System.out.println("-------------------------------------------------------");	
	    }catch(SQLException e){  System.out.println("Not * connection..."+e);}     	 
  }
  public static boolean addClassRoom(ArrayList<ClassRoom> classes)
  {
      for(int i=0;i<classes.size();i++)
      {
        if(classes.get(i)!=null)
        {
          addClassRoom(classes.get(i));      
        }  
      }
     return true;
  }
  private static int addSection( String sec)
  {
       int sec_id;
       String section;
       String tem="";
       int resent=-1;
       try{
	     ResultSet out=getSection.executeQuery();         
		while(out.next())
		{
		   tem=out.getString(2);   
		    if(tem.contains(sec))
		    {                                  
		        return out.getInt(1);
		    }
		}
	      addSection.setInt(1,count);         
	      addSection.setString(2,sec);
	      addSection.executeUpdate();
		resent=count;
		count++;
	  }catch(SQLException e){  System.out.println("Not * connection..."+e);}  		
      return resent;
  }
  public static boolean addClassRoom(ClassRoom classroom) 
  {
    int id=classroom.classID;
    String section=classroom.section;
    int std=classroom.std;
    int cap=classroom.noOfCapasity;
    int sec_id=addSection(section);
    int s_count=0;
         try{
	     addClassRoom.setInt(1,id);
	     addClassRoom.setInt(2,sec_id);
	     addClassRoom.setInt(3,1);
	     addClassRoom.setInt(4,std);
	     addClassRoom.setBoolean(5,true);
	     addClassRoom.setInt(6,cap);
	     addClassRoom.setInt(7,s_count);
	     addClassRoom.executeUpdate();
		return true;
	   }catch(SQLException e){  System.out.println("Not * connection..."+e);}  	
      return false;	      
  } 
 public static void studentClassMapping(int s_ID,int std) 
  {                    
     try
     {
	      ClassRoom classObj= classObject(std," and c.capasity>c.student_count");    
	         if(classObj.noOfCapasity==classObj.studentCount)
	         {              
	           School.addLater=false;
	         System.out.println("start: : "+start);  
	             if(start)
	            {                                                           
			     int se=classObj.section.charAt(0);
			       addClassRoom(new ClassRoom(classObj.classID+1,((char)(se+1)+""),std,classObj.noOfCapasity,0));
			       System.out.println(std+""+(char)se+": full ! so section "+((char)(se+1))+" is added...");
			       studentClassMapping(s_ID,std);
			    System.out.println("(YES)"); 
	            } 
	            return;
	         }
	         int s_count=classObj.studentCount;            
	         int c_id=classObj.classID;      
	           ++s_count;       
	           updateClassRoomStudentCount.setInt(1,s_count);                      
	           updateClassRoomStudentCount.setInt(2,c_id);
	           updateClassRoomStudentCount.executeUpdate();                 
	        addstudentclassMapping.setInt(1,s_ID);                           
	        addstudentclassMapping.setInt(2,c_id);
	        addstudentclassMapping.executeUpdate();	
		School.addLater=true;
      }catch(SQLException e){  System.out.println("Not ** connection..."+e);}
     	
      //return false;	      
  } 
  public static ArrayList getClasses(int start,int end)
  {      ArrayList<ClassRoom>classes= new ArrayList();
     try
     {      
             getclasses.setInt(1,start-1);
             getclasses.setInt(2,end+1);
	     ResultSet result=getclasses.executeQuery();
	       while(result.next())
	       {
	           classes.add(new ClassRoom(result.getInt(1),result.getString(2),result.getInt(3),result.getInt(4),result.getInt(5)));
	       }
		
      }catch(SQLException e){  System.out.println("Not * connection..."+e);}   
      return classes;	
  }
  public static boolean teacherClassMapping(int classID,int teacherID)
  {
       try{
	     addteacherClassMapping.setInt(1,teacherID);
	     addteacherClassMapping.setInt(2,classID);
	     int result=addteacherClassMapping.executeUpdate();
	       return result>0;
           }catch(SQLException e){  System.out.println("Not * connection..."+e);}  
     	return false;
  }
  public static StudentInfo getStudentDetails(String name,java.util.Date dob,int std)
  {
        Student student=null;
        ClassRoom cls=null;
           java.sql.Date sDate=new java.sql.Date(dob.getTime());
         try{  
	     getStudentDetails.setInt(1,std);
	     getStudentDetails.setDate(2,sDate);
	     ResultSet result=getStudentDetails.executeQuery();   
	       while(result.next())
	       {
	           student= new Student(result.getInt(1),result.getString(2),result.getString(3),Gender.valueOf(result.getString(4)),result.getDate(5)+"",BloodGroup.valueOf(result.getString(6)));
	           cls=new ClassRoom(result.getInt(7),result.getString(8),result.getInt(9),result.getInt(10));    
	       }
	     }catch(Exception e){  System.out.println("Not * connection..."+e);}    
	     if(student==null || cls==null)
	     return null;
     	 return new StudentInfo(student,cls);
  }
  public static ClassRoom classObject(int std,String sub)
  {
         try{
	       getClassRoom.setInt(1,std);                     
	       ResultSet re= getClassRoom.executeQuery();            
	            re.next();                                
	           return new ClassRoom(re.getInt(1),re.getString(2),re.getInt(3),re.getInt(5),re.getInt(4));
	     }catch(SQLException e){  System.out.println("Not * connection..."+e);}        
      return null;	   
  }
}
