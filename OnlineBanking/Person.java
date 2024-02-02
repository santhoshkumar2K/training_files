import java.util.Date;

class Person{

    private String firstName;
    private String lastName;
    private Date dob;
    private Gender gender;
    private Address address;
    private long contact;
    
    public Person(String firstName, String lastName, Date dob, Gender gender, Address address, long contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.contact = contact;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Date getDob() {
        return dob;
    }
    public Gender getGender() {
        return gender;
    }
    public Address getAddress() {
        return address;
    }
    public long getContact() {
        return contact;
    }
}
