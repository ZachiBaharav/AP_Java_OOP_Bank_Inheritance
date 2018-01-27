/**
 * Bank account has a balance.
 * Can be changed by deposits, withdraw, transfer
 */
public class BankAccount 
{
    private double balance;

    public BankAccount()
    {
        balance = 0;
    }
  
    /**
     * @param initialBalance initial balance
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    
    /**
     * @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        balance += amount;
    }

    /**
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    
    /**
     * @return the current balance
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * @param amount  the amount to transfer
     * @param other   the other account
     */
    public void transfer(double amount, BankAccount other)
    {
        withdraw(amount);
        other.deposit(amount);
    }
    
}
