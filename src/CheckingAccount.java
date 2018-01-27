

public class CheckingAccount extends BankAccount
{

    private int transactionsCount;
    private static final int FREE_TRANSACTIONS = 2;
    private static final double TRANSACTION_FEE = 2.0;
    
    
    // Only later on, to demonstrate class varaibles
    // then also do the toString
    private static int accountNumberCounter = 0;
    private final int accountNumber;    // can be initilaized in constructor!
    

    
    
    public CheckingAccount(double initBalance)
    {
        // private!! balance = initBalance ;
        // deposit(initBalance);
        super(initBalance);
        // calls superClass constructor with the parameter.
        // HAS TO BE the first line in the constructor
        // If ommitted, the non-parameter constructor is called.
        transactionsCount = 0;
        
        accountNumber = accountNumberCounter++ ;

    }
    
    public void deposit(double amount)
    {
        transactionsCount++;
        
        super.deposit(amount);
        // Methods in subclass:
        // 1. inherited from superclass. e.g, getBalance()
        // 2. New methods. e.g., addInterest
        // 3. Overriding! - e.g, deposit
        
    }
    
    public void withdraw(double amount)
    {
        transactionsCount++;
        super.withdraw(amount);
    }
    
    public void deductFees()
    {
        if (transactionsCount> FREE_TRANSACTIONS)
        {
            double fees = TRANSACTION_FEE *
                    (transactionsCount-FREE_TRANSACTIONS);
            super.withdraw(fees);
        }
        transactionsCount = 0;
    }    
    
    // to add only after account numbers
    public String toString() {
        return "Checking account number "+ accountNumber +". transactionCount=" + transactionsCount + " and " + super.toString() ;
    }
    
    
}
