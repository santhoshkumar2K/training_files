enum Gender
{
     MALE("MALE"),FEMALE("FEMALE") ;
     String type;
     Gender(String type)
     {
         this.type=type;
     }
     public String toString()
     {
         return this.type;
     }
}
