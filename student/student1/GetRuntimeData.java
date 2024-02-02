import java.util.*;
import java.text.SimpleDateFormat;
class GetRuntimeData
{
   protected static void studentRecord(Scanner scan) throws Exception
    {
        int option=1;
		while(option>0)
		{
		    System.out.println("------------------------");
		    System.out.println("1.Add new Student");
		    System.out.println("2.Get Student Details");
		    System.out.println("2.Change student Info");
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
		               System.out.println(studentInfo.student.getStudentID()+"."+studentInfo.student.getName());
		               break;
		               
		    }
		   
		}
    }
     protected static void teacherRecord(Scanner scan) throws Exception
    {
        int option=1;
		while(option>0)
		{
		    System.out.println("------------------------");
		    System.out.println("1.Add new Teacher");
		    System.out.println("2.Get Teacher Details");
		    System.out.println("2.Change Teacher Info");
		    System.out.println("-------------------------");
		      option=scan.nextInt();
		       scan.nextLine();
		    switch(option)
		    {
		         case 1:Teacher newTeacher= createTeacher(scan);  
		               int teacherID=DB.addTeacher(newTeacher);
                               System.out.println("---------------------------------------------");
                               System.out.println("Enter 1 for allocate class Teacher\nEnter 0 for Not Now");
                              /* if(scan.nextInt()==1)
                               {
                                   School.classTeacherAllocate(newTeacher);
                                   System.out.println("Enter class id: ");
                                    int classID=scan.nextInt();
                                    DB.teacherClassMapping(classID,teacher);  
                               }*/
		               break;
		         case 2:
		               break;
		               
		    }
		   
		}
    }
     protected static void schoolRecord(Scanner scan) throws Exception
    {
        int option=1;
		while(option>0)
		{
		    System.out.println("------------------------");
		    System.out.println("1.subject-Teacher Mapping");
		    System.out.println("2.Class-Teacher Mapping");
		    System.out.println("");
		    System.out.println("-------------------------");
		      option=scan.nextInt();
		       scan.nextLine();
		    switch(option)
		    {
		         case 1:
		               DB.displaySubjects();
		                   System.out.println("Select subject number: ");
		                  int sub=scan.nextInt(); 
		                   System.out.println("-------------list of Teacher---------------");
		                ArrayList<Teacher>teachers=DB.getTeacher();
		                for(Teacher teacher: teachers)
		                {
		                   System.out.println(teacher.getTeacherID()+". "+teacher.getName()+" "+teacher.getDegree()+" gender: "+teacher.getGender());
		                }
		                   System.out.println("----------------------------------");
		                   System.out.println("Select teacher number: ");
		                  int obt=scan.nextInt();
		                 ArrayList<ClassRoom>room=School.classTeacherAllocate(teachers.get(obt-1));
		                 for(ClassRoom classes: room)
		                 {
		                   System.out.println(classes.classID+". "+classes.std+"("+classes.section+")");
		                 }
		                   System.out.println("Enter class id: ");
		                   int classid=scan.nextInt();                    System.out.println(classid+" "+teachers.get(obt-1).getTeacherID()+" "+sub);
                              DB.subjectTeacherMapping(sub,teachers.get(obt-1).getTeacherID(),classid);
		               break;
		         case 2:  System.out.println("-------------list of Teacher---------------");
		                ArrayList<Teacher>teacher=DB.getTeacher();
		                for(Teacher tea: teacher)
		                {
		                   System.out.println(tea.getTeacherID()+". "+tea.getName()+" "+tea.getDegree()+" gender: "+tea.getGender());
		                }
		                   System.out.println("----------------------------------");
		                   System.out.println("Select teacher number: ");
		                  int obt1=scan.nextInt();
		               ArrayList<ClassRoom>rooms=School.classTeacherAllocate(teacher.get(obt1-1));
		               for(ClassRoom classes: rooms)
		                 {
		                   System.out.println(classes.classID+". "+classes.std+"("+classes.section+")");
		                 }
		                   System.out.println("Enter class id: ");
                                 int classID=scan.nextInt();
                                 DB.teacherClassMapping(classID,teacher.get(obt1-1).getTeacherID());
		               break;
		               
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
          System.out.println(">> "+(DB.addStudent(newStudent)));
                                   if(!School.studentClassAdd(newStudent.getStudentID(),std))
                                   {
                                        lateSeparation(newStudent, std);
                                   }
      return   newStudent; 
    }
     public static void lateSeparation(Student student,int std)
    {
		if(School.list.containsKey(std))
		{
		      Queue q=School.list.get(std);
		      q.add(student);    System.out.println("0000&&&&&&&&&&&&"+std+"="+q);
		   if(q.size()==2)
		   {
		       DB.start= true;
		       for(int i=0;i<=q.size();i++)
		       {
		           Student st=(Student)q.remove();
		           System.out.println(st+"() "+i);
		           School.studentClassAdd(st.getStudentID(),std);
		       }
		   }
		}else{
		    School.list.put(std,new LinkedList());
		     Queue q=School.list.get(std);
		    q.add(student);      System.out.println("______________0000"+std+"="+q);
		}
		DB.start= false;	
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
	     int num=scan.nextInt();
	     if(num>0 && num<bloods.length)
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
           Gender gen=getGender(scan.nextInt());
        System.out.println("Enter Qualification( 1 for UG :: 2 for PG :: 3 for PhD ): ");
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
