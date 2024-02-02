import java.util.*;
import java.text.SimpleDateFormat;
class ClassRoom
{
     int classID;
     String section;
     int std;
     int teacher_id;
     Teacher classTeacher;
      int studentCount=0;
     ClassRoom(int id,String section,int std)
     {
         this.classID=id;
         this.section=section;
         this.std=std;
         this.studentCount=0;
     }
     ClassRoom(int id,String section,int std,int studentcount)
     {
         this.classID=id;
         this.section=section;
         this.std=std;
         this.studentCount=studentcount;
     }
      public String toString()
     {
         return "["+this.classID+". ("+this.section+") : "+this.std+" {"+this.studentCount+"}]";
     }
}
