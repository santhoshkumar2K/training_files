import java.util.*;
import java.text.SimpleDateFormat;
class Teacher implements Comparable
{
    private int teacherID;
    private String name;
    private Date DOB;
    private Gender gender;
    private BloodGroup blood;
    private Degree degree;
    Teacher(String name,String DOB,Gender gender,Degree degree,BloodGroup blood)throws Exception
    {
        this.name=name;
        this.DOB=new SimpleDateFormat("yyyy-MM-dd").parse(DOB);
        this.gender=gender;
        this.blood=blood;
        this.degree=degree;
    }
    Teacher(int id,String name,String DOB,Gender gender,Degree degree,BloodGroup blood)throws Exception
    {
        this.teacherID=id;
        this.name=name;
        this.DOB=new SimpleDateFormat("yyyy-MM-dd").parse(DOB);
        this.gender=gender;
        this.blood=blood;
        this.degree=degree;
    }
     public int getTeacherID()
    {
        return  this.teacherID;
    }
    public void setTeacherID(int t_id)
    {
        this.teacherID=t_id;
    }
    public String getName()
    {
        return  this.name;
    }
    public void setName(String name)
    {
         this.name= name;
    }
     public Degree getDegree()
    {
         return this.degree;
    }
    public void setDegree(Degree degree)
    {
         this.degree=degree;
    }
    public BloodGroup getBloodGroup()
    {
         return this.blood;
    }
    public void setBloodGroup(BloodGroup blood)
    {
         this.blood=blood;
    }
    public Gender getGender()
    {
        return  this.gender;
    }
    public void setGender(Gender gen)
    {
         this.gender=gen;
    }
    public Date getDOB()
    {
        return  this.DOB;
    }
    public void setDOB(Date dob)
    {
         this.DOB=dob ;
    }
    public int compareTo(Object obj)
    {
        Teacher teacher=(Teacher)obj;
       if(this.name.compareTo(teacher.name)>0)
       {
           return 1;
       }return-1;
    }
}

