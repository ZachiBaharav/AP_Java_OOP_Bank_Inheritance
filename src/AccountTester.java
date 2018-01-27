
/**
* This program tests the BankAccount class and its subclasses.
*/

public class AccountTester 
{
    public static void main(String[] args)
    {
        /*******/
        //Initially empty function here, and just the BankAccount class.
        /*******/

        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount(100);
        
        yourAccount.transfer(30, myAccount);
        System.out.println("myAccount balance=" + myAccount.getBalance());
        System.out.println("yourAccount balance=" + yourAccount.getBalance());
        
       
        SavingsAccount momSavings = new SavingsAccount(5); // interest
        
        momSavings.deposit(3000);

        momSavings.addInterest();
        System.out.println("Mom's savings balance = $" + 
                momSavings.getBalance());
        
        
        CheckingAccount timChecking = new CheckingAccount(100);
        timChecking.deposit(50);
        System.out.println("Tim checking balance = $" +
                timChecking.getBalance());
        
        //========
        
        // toString method
        
        
        
        
        // some more advanced stuff
        SavingsAccount collegeFund = new SavingsAccount(10);
        
        BankAccount anAccount;
        anAccount = collegeFund ;
        
        BankAccount[] accounts = new BankAccount[100];
        accounts[0] = momSavings ;
        accounts[1] = timChecking;
        
        //accounts[0].addInterest();
        
        SavingsAccount s1 = (SavingsAccount) accounts[0];
        s1.addInterest();
        
        momSavings.addInterest();
        
    }
        
}