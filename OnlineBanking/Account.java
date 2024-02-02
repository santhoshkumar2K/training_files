import java.util.Date;
class Account
{
    private int accountID;
    private AccountType type;
    private long ac_number;
    private String password;
    private Date date;
    private long authar_no;
    private double balance;
   
    public Account(AccountType type, long ac_number, String password, Date date,long authar,double balance) {
        this.type = type;
        this.ac_number = ac_number;
        this.password = password;
        this.date = date;
        this.authar_no=authar;
        this.balance=balance;
    }
    public Account(int accountID, AccountType type, long ac_number, String password, Date date,long authar,double balance) {
        this.accountID = accountID;
        this.type = type;
        this.ac_number = ac_number;
        this.password = password;
        this.date = date;
        this.authar_no=authar;
        this.balance=balance;
    }
    public int getAccountID() {
        return accountID;
    }
    public AccountType getType() {
        return type;
    }
    public long getAc_number() {
        return ac_number;
    }
    public Date getDate() {
        return date;
    } 
    public String getPassword() {
        return password;
    }
    public long getAuthar_no() {
        return authar_no;
    }
    public double getBalance(){
        return this.balance
    }
}
