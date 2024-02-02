import java.util.HashMap;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Exam
{
   private int examID;
   private String examName;
   private int duration;
   private Date examDate;
   
       Exam(String name,int duration,Date date)
       {
          this.examName=name;
          this.duration=duration;
          this.examDate=date;
       }
       Exam(int id,String name,int duration,Date date)
       {
          this.examID=id;
          this.examName=name;
          this.duration=duration;
          this.examDate=date;
       }
   public int getExamID()
    {
         return this.examID;
    }
    public void setExamID(int e_ID)
    {
          this.examID=e_ID;
    }
    public String getExamName()
    {
         return this.examName;
    }
    public void setExamName(String name)
    {
         this.examName= name;
    }
     public int getDuration()
    {
         return this.duration;
    }
    public void setDuration(int duration)
    {
          this.duration=duration;
    }
    public Date getDate()
    {
        return  this.examDate;
    }
    public void setDate(Date date)
    {
         this.examDate=date;
    }
}
