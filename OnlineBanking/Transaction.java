import java.util.Date;
class Transaction
{
    private int tansactionID;
    private long fromAcountNo;
    private String from;
    private String to;
    private long toAcountNo;
    private double amount;
    private Date date;
    
    public Transaction(int tansactionID, long fromAcountNo, String from, String to, long toAcountNo, double amount, Date date) {
        this.tansactionID = tansactionID;
        this.fromAcountNo = fromAcountNo;
        this.from = from;
        this.to = to;
        this.toAcountNo = toAcountNo;
        this.amount = amount;
        this.date = date;
    }
    public Transaction(long fromAcountNo, String from, String to, long toAcountNo, double amount, Date date) {
        this.fromAcountNo = fromAcountNo;
        this.from = from;
        this.to = to;
        this.toAcountNo = toAcountNo;
        this.amount = amount;
        this.date = date;
    }
    public int getTansactionID() {
        return tansactionID;
    }
    public long getFromAcountNo() {
        return fromAcountNo;
    }
    public String getFrom() {
        return from;
    }
    public String getTo() {
        return to;
    }
    public long getToAcountNo() {
        return toAcountNo;
    }
    public double getAmount() {
        return amount;
    }
    public Date getDate() {
        return date;
    }
}
