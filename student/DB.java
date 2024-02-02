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
    private static int examID=1001;
    private static PreparedStatement addExam;
    private static PreparedStatement getExam;
    private static PreparedStatement addMark;
    private static PreparedStatement addstudent;
    private static PreparedStatement getstudent;
    private static PreparedStatement removeStudent;
    private static PreparedStatement findIsActive;
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
    private static PreparedStatement classSubjectMapping;
    private static PreparedStatement updateClassRoomStudentCount;
    private static PreparedStatement getClassSubject;
    
    static
    {
       uName="postgres";
       pw="sarkar";
       url="jdbc:postgresql://localhost:5432/school";
              try
	      {
		 con=DriverManager.getConnection(url,uName,pw);
		 addstudent=con.prepareStatement("insert into Student values(?,?,?,?,?,?,?)");
		 addteacher=con.prepareStatement("insert into Teacher values(?,?,?,?,?,?,?)");
		 getstudent=con.prepareStatement("select student.student_id,student.name,student.father_name,student.gender,student.dob,student.bloodgroup from studentclassMapping join student on student.student_id =studentClassMapping.student_id where classid=?");
		 getTeacher=con.prepareStatement("select teacher_id,name,dob,gender,qualification,bloodgroup from teacher");
		 subjectTeacherMapping=con.prepareStatement("insert into classsubjectteachermap (classid,subject_id,teacher_id)values(?,?,?)");
		 displaysubject=con.prepareStatement("select subject_id as subjectID,subject from subject");
		 addSection=con.prepareStatement("insert into section  values(?,?)");
		 getSection=con.prepareStatement("select section_id,section from Section");
		 addClassRoom=con.prepareStatement("insert into ClassRoom values(?,?,?,?,?,?)");
		 addteacherClassMapping=con.prepareStatement("update classroom set teacher_id =? where classid=?");
		 getStudentDetails=con.prepareStatement("select student.student_id,student.name,student.father_name,student.gender,student.dob,student.bloodgroup,classroom.classid,section.section,classroom.std,classroom.student_count from  studentclassMapping join  classroom on  classroom.classid=studentclassmapping.classid join student on student.student_id=studentclassmapping.student_id join section on section.section_id=classroom.sec_id where classroom.std=? and student.dob=?");
		 getClassRoom=con.prepareStatement("select classid,section.section,std,student_count from classroom   join section on section. section_id=sec_id   where std=?");
		 getclasses=con.prepareStatement("select c.classid,section.section,c.std,c.student_count from classroom c  join section on section. section_id=c.sec_id where c.std>? and c.std<?");
		 addstudentclassMapping=con.prepareStatement("insert into studentclassMapping (student_id,classid)values(?,?)");
		 updateClassRoomStudentCount=con.prepareStatement("update  classroom set student_count=? where classid=?");
		 removeStudent=con.prepareStatement("delete from student where student_id=?");
		 findIsActive=con.prepareStatement("select Active from student where student_id=?");
		 classSubjectMapping=con.prepareStatement("insert into classsubjectmapping(classid,subject_id) values (?,?)");
		 getClassSubject=con.prepareStatement("select classsubjectMapping. subject_id, subject.subject from classsubjectmapping join subject on subject.subject_id=classsubjectmapping.subject_id where classsubjectmapping.classid=?");
		 addExam=con.prepareStatement("insert into exam values(?,?,?,?)");
		 getExam=con.prepareStatement("select exam_id,exam,duration,date from exam");
		 addMark=con.prepareStatement("insert into mark(exam_id,classid,student_id,subject_id,mark) values(?,?,?,?,?)");

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
		addstudent.setBoolean(7,true);
		addstudent.executeUpdate();
		return true;
	   }catch(SQLException e){  System.out.println("Not * connection..."+e);}  	
      return false;	    
  }
   public static void removeStudent(int c_id,int s_id)
  {
                 try
                {  
                      findIsActive.setInt(1,s_id);
                      ResultSet result=findIsActive.executeQuery();
                                 result.next();
			   boolean isActive=result.getBoolean(1); 
			   if(isActive)
			   {                                      
			      //removeStudent.setBoolean(1,false);  
		              removeStudent.setInt(1,s_id);
		              removeStudent.executeUpdate();
		              updateClassRoom(c_id,s_id-1);
			   }else
			   {
			   
			   }
	         }catch(SQLException e){  System.out.println("Not ** connection..."+e);}
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
		addteacher.setBoolean(7,true);
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
  public static ArrayList getStudent(int classid)
  {
    ArrayList<Student>students= new ArrayList();
         try{  
                     getstudent.setInt(1,classid);
		     ResultSet result=getstudent.executeQuery(); 
	       while(result.next())
	       {
	          students.add(new Student(result.getInt(1),result.getString(2),result.getString(3),
	          Gender.valueOf(result.getString(4)),result.getString(5),BloodGroup.valueOf(result.getString(6))));
	       }
	   }catch(Exception e){  System.out.println("Not * connection..."+e);}    
       return students;	   
  }
  public static ArrayList getClassSubject(int classid)
  {
    ArrayList<String>subjects= new ArrayList();
         try{  
                     getClassSubject.setInt(1,classid);
		     ResultSet result=getClassSubject.executeQuery(); 
	       while(result.next())
	       {
	           subjects.add(result.getInt(1)+". "+result.getString(2));
	       }
	   }catch(Exception e){  System.out.println("Not * connection..."+e);}    
       return subjects;	   
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
      try{                        System.out.println(subID+" "+teacherID+" "+classID);
                subjectTeacherMapping.setInt(1,classID);
	        subjectTeacherMapping.setInt(2,subID);
		subjectTeacherMapping.setInt(3,teacherID);
		int update=subjectTeacherMapping.executeUpdate();
		return update>0;
	}catch(SQLException e){  System.out.println("Not * connection..."+e);}  	
      return false;	 
  }
  public static ArrayList getSubjects()
  {
      ArrayList<String>subject=new ArrayList(); 
         try{
	       ResultSet result=displaysubject.executeQuery();
	       while(result.next())
	       {
	           subject.add(result.getInt(1)+". "+result.getString(2));
	       }
	    }catch(SQLException e){  System.out.println("Not * connection..."+e);}     
	 return subject;   	 
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
    int sec_id=addSection(section);
    int s_count=0;
         try{
	     addClassRoom.setInt(1,id);
	     addClassRoom.setInt(2,sec_id);
	     addClassRoom.setInt(3,1);
	     addClassRoom.setInt(4,std);
	     addClassRoom.setBoolean(5,true);
	     addClassRoom.setInt(6,s_count);
	     addClassRoom.executeUpdate();
		return true;
	   }catch(SQLException e){  System.out.println("Not * connection..."+e);}  	
      return false;	      
  } 
  public static void studentClassMapping(ClassRoom classObj,int s_ID) 
  {                    
     try
     {     
	         int s_count=classObj.studentCount;            
	         int c_id=classObj.classID;      
	           ++s_count;       
	              updateClassRoom(c_id,s_count);             
	        addstudentclassMapping.setInt(1,s_ID);                           
	        addstudentclassMapping.setInt(2,c_id);
	        addstudentclassMapping.executeUpdate();	
		School.addLater=true;
      }catch(SQLException e){  System.out.println("Not ** connection..."+e);}
         
  } 
  public static void updateClassRoom(int c_id,int s_ID)
  {
                 try
                {  
		          updateClassRoomStudentCount.setInt(1,s_ID);                      
			   updateClassRoomStudentCount.setInt(2,c_id);
			   updateClassRoomStudentCount.executeUpdate(); 
	         }catch(SQLException e){  System.out.println("Not ** connection..."+e);}
  }
  public static void classSubjectMapping(int s_id,ArrayList<ClassRoom>cls)
  {
              for(ClassRoom clses: cls)
              {
                 try
                {  
		          classSubjectMapping.setInt(1,clses.classID);                      
			   classSubjectMapping.setInt(2,s_id);
			   classSubjectMapping.executeUpdate(); 
	         }catch(SQLException e){  System.out.println("Already there..."+e);}
	       }  
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
	           classes.add(new ClassRoom(result.getInt(1),result.getString(2),result.getInt(3),result.getInt(4)));
	       }
		
      }catch(SQLException e){  System.out.println("Not * connection..."+e);}   
      return classes;	
  }
  public static boolean teacherClassMapping(int classID,int teacherID)
  {                           System.out.println(classID+" teacher "+teacherID);
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
  public static ArrayList getClass(int std)
  {
      ArrayList<ClassRoom>cls= new ArrayList();
         try{
	       getClassRoom.setInt(1,std);                     
	       ResultSet re= getClassRoom.executeQuery();            
	            while(re.next())
	            {                                
	               cls.add( new ClassRoom(re.getInt(1),re.getString(2),re.getInt(3),re.getInt(4)));
	           }
	     }catch(SQLException e){  System.out.println("Not * connection..."+e);}        
      return cls;	   
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
  public static void closeConnection()
   {
      try{
              con.close();
           DB.addstudent.close();
           DB.removeStudent.close();
           DB.findIsActive.close();
	   DB.addteacher.close();
	   DB.getTeacher.close();
	   DB.subjectTeacherMapping.close();
	   DB.addsubject.close();
	   DB.displaysubject.close();
	   DB.addClassRoom.close();
	   DB.getClassRoom.close();
	   DB.addstudentClassMapping.close();
	   DB.addteacherClassMapping.close();
	   DB.addSection.close();
	   DB.getSection.close();
	   DB.getclasses.close();
	   DB.getStudentDetails.close();
	   DB.addstudentclassMapping.close();
	   DB.updateClassRoomStudentCount.close();
	   DB.addExam.close();
           DB.getExam.close();
           DB.addMark.close();
         }catch(SQLException e){  System.out.println("Not * connection..."+e);} 
   }
}
