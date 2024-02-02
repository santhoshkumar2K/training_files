package ClassAndObjects;
import java.util.Scanner;
public class BankAccount
{
  private double balance;
  private final long accountNumber;
  private AccountType accountType;
  BankAccount(double balance,long accountNumber,AccountType accountType)
  {
    this.balance=balance;
    this.accountNumber=accountNumber;
    this.accountType=accountType;
  }
  public double getBalance()
  {
    return this.balance;
  }
  public void setBalance(double balance)
  {
     this.balance=balance;
  }
  public long getAccountNumber()
  {
    return this.accountNumber;
  }
  public void setAccountNumber(long accountNumber)
  {
     this.accountNumber=accountNumber;
  }
  public AccountType getAccountType()
  {
    return this.accountType;
  }
  public void setAccountType(AccountType accountType)
  {
     this.accountType=accountType;
  }
 public static void main(String[]args)
 {
    Scanner scan= new Scanner(System.in);  
 }
 enum AccountType
 {
   SavingAccount;
   SalaryAccount;
   FixedDepositAccount;
   RecurringDepositAccount;
   NRI_Account;
 }
} 
