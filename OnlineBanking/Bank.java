import java.util.ArrayList;

class Bank
{
    private int bankID;
    private String bankName;
    private String location;
    private ArrayList<Customer>customers;
    
    public Bank(int bankID, String bankName, String location, ArrayList<Customer> customers) {
        this.bankID = bankID;
        this.bankName = bankName;
        this.location = location;
        this.customers = customers;
    }
    public Bank(String bankName, String location) {
        this.bankName = bankName;
        this.location = location;
        this.customers = customers;
    }
    public int getBankID() {
        return bankID;
    }
    public String getBankName() {
        return bankName;
    }
    public String getLocation() {
        return location;
    }
   
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
