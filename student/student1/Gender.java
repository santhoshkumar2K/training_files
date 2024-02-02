enum Gender
{
     MALE("male"),FEMALE("female") ;
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
