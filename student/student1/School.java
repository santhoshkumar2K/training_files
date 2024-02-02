import java.util.*;
class School
{
    int start;
    int end;
    ArrayList<String>section= new ArrayList();
    ArrayList<ClassRoom>classes;
    
    static LinkedHashMap<Integer,Queue> list=new LinkedHashMap();
    static boolean addLater;
   School(int start, int end,int capasity )
   {
       ArrayList <ClassRoom>tem= new ArrayList();
       int id=start;
       for(int i=start;i<=end;i++)
       {
           tem.add(new ClassRoom(10*id,"A",i,capasity));
           id++;
       }
       this.classes=tem;
       this.start=start;
       this.end=end;
       this.section.add("A");
       DB.addClassRoom(this.classes);
   }
    public static boolean studentClassAdd(int s,int std)
   {  
       DB.studentClassMapping(s,std);    System.out.println(addLater+"{}");
       return addLater;
   }
   public static ArrayList classTeacherAllocate(Teacher teacher)
   {  
       String qualification=teacher.getDegree().toString();
       if(qualification.equals("UG"))
       {
            return DB.getClasses(1,5);
       }else if(qualification.equals("PG"))
       {
            return DB.getClasses(6,10);
       }else if(qualification.equals("PhD"))
       {
            return  DB.getClasses(11,12);
       }
       return null;
          
   }
}
