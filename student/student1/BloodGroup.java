enum BloodGroup
{
   A_POSITIVE("A_POSITIVE","A+"),
   A_NEGATIVE("A_NEGATIVE","A-"),
   B_POSITIVE("B_POSITIVE","B+"),
   B_NEGATIVE("B_NEGATIVE","B-"),
   AB_POSITIVE("AB_POSITIVE","AB+"),
   AB_NEGATIVE("AB_NEGATIVE","AB-"),
   O_POSITIVE("O_POSITIVE","O+"),
   O_NEGATIVE("O_NEGATIVE","O-");
   
   String blood;
   String sympol;
   BloodGroup(String blood,String sympol)
   {
     this.blood=blood;
     this.sympol=sympol;
   }
   public String sympol()
   {
      return this.sympol;
   }
   public String toString()
   {
      return this.blood;
   }
}
