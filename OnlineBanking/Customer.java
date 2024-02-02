

import java.util.Date;

class Customer extends Person{
    private int customerID;
    Account account;  
    public Customer(int customerID, String firstName, String lastName, Date dob, Gender gender, Address address,long contact,Account account) {
        super(firstName,lastName,dob,gender,address,contact);
        this.customerID = customerID;
        this.account=account;
    }
    public Customer(String firstName, String lastName, Date dob, Gender gender, Address address, long contact) {
        super(firstName,lastName,dob,gender,address,contact);
    }
    public int getCustomerID() {
        return customerID;
    }
   

}
