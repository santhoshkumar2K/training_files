import java.util.*;
import java.text.SimpleDateFormat;
class GetRuntimeData
{
   protected static void studentRecord(Scanner scan) throws Exception
    {
        int option=1;  
             
       
		while(option>0)
		{ 
		try{
			    System.out.println("------------------------");
			    System.out.println("1.Add new Student");
			    System.out.println("2.Get Student Details");
			    System.out.println("3.Remove Student");
			    System.out.println("-------------------------"); 
		      option=scan.nextInt();
		       scan.nextLine();
		    switch(option)
		    {
		         case 1:Student newStudent= createStudent(scan); 
           
		               break;
		         case 2:System.out.println("------------------------");
		                   System.out.println("Ender Student name:");
		                   String name=scan.nextLine();
		                   System.out.println("Ender Student std: ");
		                   int std=scan.nextInt();
		                    scan.nextLine();
		                   System.out.println("Ender student Date Of Birth:");
		                   String DOB=scan.nextLine();
		                   java.util.Date dob=new SimpleDateFormat("yyyy-MM-dd").parse(DOB);
		               StudentInfo studentInfo=DB.getStudentDetails(name,dob,std);
		               System.out.println(studentInfo.student.getStudentID()+".student Name: "+studentInfo.student.getName());
		               break;
		        case 3:System.out.println("------------------------");
		                   System.out.println("Ender Student name:");
		                   String s_name=scan.nextLine();
		                   System.out.println("Ender Student std: ");
		                   int s_std=scan.nextInt();
		                    scan.nextLine();
		                   System.out.println("Ender student Date Of Birth:");
		                   String s_dob=scan.nextLine();
		                   java.util.Date date=new SimpleDateFormat("yyyy-MM-dd").parse(s_dob);
		               StudentInfo s_Info=DB.getStudentDetails(s_name,date,s_std);
		                DB.removeStudent(s_Info.s_class.classID,s_Info.student.getStudentID());
		               System.out.println(s_Info.student.getStudentID()+"."+s_Info.student.getName()+" is removed..");
		               break;       
		               
		    }
		    
		 }catch(InputMismatchException e)
	         {
	             scan.next();
	             System.out.println("invalied...");
	        }	  
	    }
	 
    }
     protected static void teacherRecord(Scanner scan) throws Exception
    {
        int option=1;
        
		while(option>0)
		{ 
		  try{
			    System.out.println("------------------------");
			    System.out.println("1.Add new Teacher");
			    System.out.println("2.");
			   
			    System.out.println("-------------------------");
			      option=scan.nextInt();
			       scan.nextLine();
			    switch(option)
			    {
				 case 1:Teacher newTeacher= createTeacher(scan);  
				       int teacherID=DB.addTeacher(newTeacher);
		                       
				       break;
				 case 2:
				       break;
				       
			    }
		     }catch(InputMismatchException e)
	             {
	                scan.next();
	                System.out.println("invalied...");
	            }	   
			   
		}
      
    }
     protected static void examRecord(Scanner scan) throws Exception
    {
        int option=1;
       
		while(option>0)
	       {
	            try{
			    System.out.println("------------------------");
			    System.out.println("1.AddExam Details");
			    System.out.println("2.View Exam Details");
			    System.out.println("3.Add Mark");
			    System.out.println("");
			    System.out.println("-------------------------");
			      option=scan.nextInt();
			       scan.nextLine();
			    switch(option)
			    {
				 case 1: System.out.println("Exam name :");
				         String name=scan.next();
				         System.out.println("Exam duration :");
				         int duration=scan.nextInt();
				         System.out.println("Exam Date :");
				         String date=scan.next();
				         Exam exam= new Exam(name,duration,new SimpleDateFormat("yyyy-MM-dd").parse(date));
				       DB.addExam(exam);
				       break;
				 case 2:ArrayList<Exam>exams=DB.getExam();
				         displayExams(exams);
				       break;
				 case 3:ArrayList<Exam>exam_s=DB.getExam();
				         displayExams(exam_s);
				        System.out.println("select Exam based on ExamID :");
				        int examID=scan.nextInt(); 
				         if(!checkInput(1001,1001+(exam_s.size()-1),examID))
				         {
				           System.out.println("Unvalied....");
				            examRecord(scan);
				            return;
				         }
				        System.out.println("select std 1 -> 12:");
				        int select_std=scan.nextInt();
				        ArrayList<ClassRoom>classes=DB.getClass(select_std);
				         displayClasses(classes);
				        System.out.println("select class based on classID :");
				        int clsID=classes.get(scan.nextInt()-1).classID;
				        
				        ArrayList<String>sub=DB.getClassSubject(clsID);
				        displaySubjects(sub);
				        System.out.println("select subject based on subjectID :");
				        int subID=scan.nextInt();
				        System.out.println("--------------------------------------------------------------");
				        Queue<Student>students=new LinkedList(DB.getStudent(clsID));
				        addMark(examID,clsID,subID,students,scan);
				       break;       
				       
			    }
		     }catch(InputMismatchException e)
	             {
			     scan.next();
			     System.out.println("invalied...");
	             }	   
		}
	
    }
    public static boolean checkInput(int start, int end, int value)
    {
          if(start<=value && end>=value)
          {
             return true;
          }else
          {
             return false;
          }   
    }
    public static void addMark(int examID,int classID,int subID,Queue<Student>students,Scanner scan)
    {
      try
      {
		for(int i=0;i<=students.size();i++)
		{
		   Student student=students.remove();
		   System.out.println(student.getStudentID()+". Name: "+student.getName()+", DOB:"+student.getDOB()+" ("+student.getGender()+"):");
		   System.out.println("Ender  mark: ");
		   int mark=scan.nextInt();
		   DB.addMarkMapping(examID,classID,student.getStudentID(),subID,mark);
		}
       }catch(Exception e)
       {
           System.out.println("No students ! ");
       }		
    }
    public static void displaySubjects(ArrayList<String> subjects)
    {
       System.out.println("-------------------------Subject----------------------------");
		                for(String subject: subjects)
		                {
		                   System.out.println("ID : "+subject);
		                 
		                }System.out.println("---------------------------------------------------------");
    }
    public static void displayExams(ArrayList<Exam>exams)
    {
       System.out.println("-------------------------EXAMS----------------------------");
		                for(Exam exam_s: exams)
		                {
		                   System.out.println(exam_s.getExamID()+". "+exam_s.getExamName()+", "+exam_s.getDate()+" ("+exam_s.getDuration()+")days");
		                 
		                }System.out.println("---------------------------------------------------------");
    }
    public static void displayTeachers(ArrayList<Teacher>teachers)
    {
        System.out.println("-------------list of Teacher---------------");
		               
		                for(Teacher teacher: teachers)
		                {
		                   System.out.println(teacher.getTeacherID()+". "+teacher.getName()+" "+teacher.getDegree()+" gender: "+teacher.getGender());
		                }
		                   System.out.println("----------------------------------");
    }
    /*public static void displayClasses(ArrayList<ClassRoom>rooms)
    {
                                for(ClassRoom classes: rooms)
		                 {
		                   System.out.println(classes.classID+". "+classes.std+"("+classes.section+")");
		                 }
    }*/
    
     protected static void schoolRecord(Scanner scan) throws Exception
    {
        int option=1;
        
       
		while(option>0)
		{
		     try{
			    System.out.println("------------------------");
			    System.out.println("1.subject-Teacher Mapping");
			    System.out.println("2.Class-Teacher Mapping");
			    System.out.println("3.class-Subject Mapping");
			    System.out.println("-------------------------");
			      option=scan.nextInt();
			       scan.nextLine();
			    switch(option)
			    {
				 case 1:
				         displaySubjects(DB.getSubjects());
				           System.out.println("Select subject number: ");
				          int sub=scan.nextInt(); 
				        ArrayList<Teacher>teachers=DB.getTeacher();
				          displayTeachers(teachers);
				           System.out.println("Select teacher number: ");
				          int obt=scan.nextInt();
				          if(!(checkInput(1,teachers.size(),obt)))
				          {
				              System.out.println("Unvalied...."+1+" "+teachers.size()+" "+obt);
				              schoolRecord(scan);
				              return;
				          }
				         ArrayList<ClassRoom>room=School.classTeacherAllocate(teachers.get(obt-1));
				         displayClasses(room);
				           System.out.println("Enter class id: ");
				           int classid=room.get(scan.nextInt()-1).classID;  
				                         
		                      DB.subjectTeacherMapping(sub,teachers.get(obt-1).getTeacherID(),classid);
				       break;
				 case 2:  
				        ArrayList<Teacher>teacher=DB.getTeacher();
				          displayTeachers(teacher);
				           System.out.println("Select teacher number: ");
				          int obt1=scan.nextInt();
				       ArrayList<ClassRoom>rooms=School.classTeacherAllocate(teacher.get(obt1-1));
				       displayClasses(rooms);
				           System.out.println("Enter class id: ");
		                         int classID=rooms.get(scan.nextInt()-1).classID;
		                         
		                         DB.teacherClassMapping(classID,teacher.get(obt1-1).getTeacherID());
				       break;
				 case 3:  System.out.println("select std 1 -> 12:");
				        ArrayList<ClassRoom>class_s=DB.getClass(scan.nextInt());
				       // displayClasses(class_s); 
				          System.out.println("select class based on classID :");
				          int clsID=scan.nextInt()*10;
				          System.out.println(clsID+" << ");
				        int opt=1, count=1,subID=0;
				         ArrayList<String>subject=DB.getSubjects();
				        while(opt!=0)
				        {  
						displaySubjects(subject);
						  System.out.println("select subject based on subjectID :");
					       subID=scan.nextInt();
						System.out.println("Enter 1 for select next subject to this class:\nEnter 0 for enough: ");
						opt=scan.nextInt();
						DB.classSubjectMapping(subID,class_s);
						System.out.println("--------------------------------------------------------------");    
					}   
				    	    
			    }
		     }catch(InputMismatchException e)
	             {
			     scan.next();
			     System.out.println("invalied...");
	            }
		   
		}
	
    }
     protected static Student createStudent(Scanner scan) throws Exception
    {
        System.out.println("----------------------------");
        System.out.println("Enter Student Name: ");
          String name=scan.nextLine();
        System.out.println("Enter Student father Name: ");
          String father=scan.nextLine();
        System.out.println("Enter Gender( 0 for female :: 1 for male ): ");
         Gender gen=getGender(scan.nextInt());
         scan.nextLine();
        System.out.println("Enter Student Date Of Birth(yyyy-MM-dd): ");
           String date=scan.nextLine();
           BloodGroup blood=getBloodGroup(scan);
        System.out.println("---------------------------------\nAdmission class( 6th -> 12th ): ");
           int std=scan.nextInt();    
        Student newStudent=new Student(name,father,gen,date,blood); 
            DB.addStudent(newStudent);
           ArrayList<ClassRoom>clses=DB.getClass(std);
           displayClasses(clses);
           System.out.println("Select a class based on class ID: ");
           System.out.println(">>> 0. for create new section: ");
           int option=scan.nextInt();
           int select=0;
           if(option==0)
           {
              char sec=clses.get(clses.size()-1).section.charAt(0);
              String section=((char)(sec+1)+"");
               DB.addClassRoom(new ClassRoom(clses.get(clses.size()-1).classID+1,section,std,0));
               clses=DB.getClass(std);
               displayClasses(clses);
               System.out.println("Select a class based on class ID: ");
               select=scan.nextInt();
           }else{
              select=option;
           }
            DB.studentClassMapping(clses.get(select-1),newStudent.getStudentID());
           
                                  
      return   newStudent; 
    }
    public static void  displayClasses(ArrayList<ClassRoom>clses)
    {
          int i=0;
           System.out.println("----------------------------------------------------------");
           for(ClassRoom cls:clses)
           {
              System.out.println("ID: "+(++i)+". "+cls.std+"("+cls.section+") --> no.of students= "+cls.studentCount);
           }
           System.out.println("-----------------------------------------------------------");
    }
    
    protected static Gender getGender(int opt)
    {
	        if(opt==0)
		{
		   return Gender.FEMALE; 
		}else
		{
		   return Gender.MALE;
		}
    }
    protected static Degree getDegree(int opt)
   {       
                if(opt==1)
		{
		   return Degree.UG; 
		}else if(opt==2)
		{
		   return Degree.PG;
		}else if(opt==3)
		{
		    return Degree.PhD;
		}else{
		    return null;
		}
    }
    protected static BloodGroup getBloodGroup(Scanner scan)
    {
	     BloodGroup [] bloods=BloodGroup.values();
	     for(int i=0;i<bloods.length;i++)
	     {
	        System.out.println((i+1)+"."+bloods[i].sympol());
	     } 
	     System.out.println("Ender a number for select bloodgroup: ");
	     int num=scan.nextInt()-1;
	     if(num>=0 && num<bloods.length)
	     {
	        return bloods[num];
	     }
	        return null; 
    }
     protected static Teacher createTeacher(Scanner scan) throws Exception
    {
        System.out.println("----------------------------");
        System.out.println("Enter Teacher Name: ");
          String name=scan.nextLine();
        System.out.println("Enter Gender( 0 for female :: 1 for male ): ");
          int input=scan.nextInt();
          Gender gen=null;
         if(input==0 || input==1)
         {
           gen=getGender(input);
         }else
         {
             System.out.println("unvaied....");
            createTeacher(scan);
         }  
        System.out.println("Enter Degree: ");
           String degree=scan.next();   
        System.out.println("Enter Qualification of teacher( 1 for UG :: 2 for PG :: 3 for PhD ): ");
           Degree deg=getDegree(scan.nextInt());
           scan.nextLine();
        System.out.println("Enter  Date Of Birth(yyyy-MM-dd): ");
           String date=scan.nextLine();
           BloodGroup blood=getBloodGroup(scan);
        Teacher teacher= new Teacher(name,date,gen,deg,blood);  
         
         // School.allocateWork(teacher);
      return   teacher;
    }
}
