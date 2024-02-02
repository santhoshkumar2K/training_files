import java.util.*;
import java.text.SimpleDateFormat;
class ClassRoom
{
     int classID;
     String section;
     int std;
     int teacher_id;
     Teacher classTeacher;
     int noOfCapasity;
      int studentCount=0;
     ClassRoom(int id,String section,int std,int noOfCapasity)
     {
         this.classID=id;
         this.section=section;
         this.std=std;
         this.noOfCapasity=noOfCapasity;
         this.studentCount=0;
     }
     ClassRoom(int id,String section,int std,int noOfCapasity,int studentcount)
     {
         this.classID=id;
         this.section=section;
         this.std=std;
         this.noOfCapasity=noOfCapasity;
         this.studentCount=studentcount;
     }
      public String toString()
     {
         return "["+this.classID+". ("+this.section+") : "+this.std+" {"+this.noOfCapasity+"}]";
     }
}
