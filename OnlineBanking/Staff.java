import java.util.Date;

class Staff extends Person
{
    private int staffID; 
    private String username;
    private String password;
    
   
    public Staff(String firstName, String lastName, Date dob, Gender gender, Address address, long contact, int staffID,
            String username, String password) {
        super(firstName, lastName, dob, gender, address, contact);
        this.staffID = staffID;
        this.username = username;
        this.password = password;
    }
    public Staff(String firstName, String lastName, Date dob, Gender gender, Address address, long contact,
            String username, String password) {
        super(firstName, lastName, dob, gender, address, contact);
        this.username = username;
        this.password = password;
    }
    public int getStaffID() {
        return staffID;
    }
     public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}