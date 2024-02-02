import java.util.*;
public class StudentsDetails
{
  private static String subjects(int subject)
  {
      switch(subject)
    {
      case 1:return "Tamil ";
      case 2:return "English ";
      case 3:return "Maths ";
      case 4:return "Science ";
      case 5:return "Social ";
     }        
     return "";
  }
  private static void checkMark(Students[]students, int rangeFrom ,int rangeTo)
  { 
   boolean namePrint; int noOfSubject, noOfStudents=0;
   for(Students student: students)
   {
      namePrint=true; noOfSubject=0;
      for(int subject=1; subject<=5; subject++)
      {
      	 if(getMark(student, subject)>=rangeFrom && getMark(student, subject)<=rangeTo)
         {
              if(namePrint)
              {
                 System.out.print((++noOfStudents)+". "+student.getName()+": ");
                 namePrint=false; 
              }
            System.out.print(subjects(subject)+getMark(student, subject)+", ");
            noOfSubject++;
         }
      }
      System.out.println((namePrint)?"":noOfSubject+"= Subject");
    }
     if(noOfStudents==0)
     {
       System.out.println("No one");
     }
  }
  private  static double getMark(Students student, int option)
  {
    switch(option)
    {
      case 1:return student.getTamil();
      case 2:return student.getEnglish();
      case 3:return student.getMaths();
      case 4:return student.getScience();
      case 5:return student.getSocial();
      case 6:return student.getTotal();                                   
    }
    return 0;
  }
 private static void topStudents(Students[]student, int option, int limit)
 {
   System.out.println((limit>(student.length))?"limit is too long..only "+student.length+" Students":"");
  for(int i=0;i<student.length;i++)
  {
     for(int j=i+1;j<student.length;j++)
     {
        if(getMark(student[i],option)<getMark(student[j],option))
        {
           Students o=student[i];
           student[i]=student[j];
           student[j]=o;
        } 
     }
   }
    display(student,option,limit);
  }
  private static void display(Students[]students, int option, int limit)
  {
    int count=1;
    for(Students student: students)
    {
     
      if(count>limit)
      {
        break;
      }
      if(option!=7)   // 7 means for display only pass students 
      {
      System.out.println(student.getName()+": "+getMark(student,option));   count++;
      }else{
        if(student.getPass())
        {
         System.out.println(student.getName()+": "+getMark(student,option)); count++;
        }  
      }     
    }
  }
 public static void main(String [] args )
 {
      Scanner scan= new Scanner(System.in);
      System.out.println("How many students add: ");
       Students [] list=new Students[scan.nextInt()];
      
        for(int index=0;index<list.length; index++)
        {  scan.nextLine();
           list[index]= Students.createStudent(scan);
           System.out.println("-------------------------------------------------");
        }
        int input=1;
   while(input>0)
   {
         System.out.println("--------------------------Welcome---------------------------");
         System.out.println("Enter \"1\" for Total wise Top Students :  ");
         System.out.println("Enter \"2\" for  Tamil wise Top Students:  "); 
         System.out.println("Enter \"3\" for English wise Top Students :  ");
         System.out.println("Enter \"4\" for Maths wise Top Students :  ");  
         System.out.println("Enter \"5\" for Science wise Top Students :  "); 
         System.out.println("Enter \"6\" for Social wise Top Students :  ");  
         System.out.println("Enter \"7\" for Subject:  ");      
         System.out.println("Enter \"8\" for Fail Students with Subject :  ");   
         System.out.println("Enter \"9\" for pass Students with  mark :  "); 
         System.out.println("Enter \"10\" for centum Students with  subjet :  ");       
         System.out.println("Enter \"0\" for exit:  ");  
         System.out.println("--------------------------Welcome---------------------------");
         System.out.println("Your Option: ");
          input=scan.nextInt();
        
         if(input==0)
         {
         System.exit(0);
         }else if(input==1)
         {
           System.out.println("Enter a Limit :  ");    
           topStudents(list,6, scan.nextInt());
         }else if(input==2)
         {
           System.out.println("Enter a Limit :  ");    
           topStudents(list,1, scan.nextInt());
         }else if(input==3)
         {
           System.out.println("Enter a Limit :  ");    
           topStudents(list,2, scan.nextInt());
         }else if(input==4)
         {
           System.out.println("Enter a Limit :  ");    
           topStudents(list,3, scan.nextInt());
         }else if(input==5)
         {
           System.out.println("Enter a Limit :  ");    
           topStudents(list,4, scan.nextInt());
         }else if(input==6)
         {
           System.out.println("Enter a Limit :  ");    
           topStudents(list,5, scan.nextInt());
         }else if(input==7)
         {
            for(int subject=1;subject<=5;subject++)
            {
              System.out.println(subjects(subject));
            }
         }else if(input==8)
         {   
           checkMark(list,0,34);;
         }else if(input==9)
         {
           display(list,7,list.length-1);
         }else if(input==10)
         {
           checkMark(list,100,100);
         }
      }  
        scan.close();
   }  
 }
