package accounttester;

/**
 *
 * @author Jun
 */
public class Account{

    private int accountnumber;
    private double balance;
 
    public Account(){
        this.accountnumber = 000;
        this.balance = 000.00;
    }
    
    public Account(int x, double y){
        this.accountnumber = x;
        this.balance = y;
    }
    
    public void setBalance(double x){
        this.balance = x;
    }
    
    public int getAccountNumber(){
       return accountnumber;
    }
    
    public double getBalance(){
       return balance;
    }
    
    public void credit(double x){
        this.balance += x;
    }
    
    public void debit(double x){
        if(this.balance >= x){
            this.balance = this.balance - x;
        }
        else
            throw new IllegalArgumentException("amount withdrawn exceeds current balance!");
    }
    
    public String toString(){
        return String.format("Account number/Balance: %03d/Php %.02f", this.accountnumber, this.balance);
    }
    
    public void setAccount(int x, double y){
      this.accountnumber = x;
      this.balance = y;
}
    
}
