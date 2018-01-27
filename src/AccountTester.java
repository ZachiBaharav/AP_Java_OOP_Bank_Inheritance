
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
        
        // All are inheriting from Object (< the ultimate super class)
        // If we use without overriding, just the hash-code of the class
        // if we override ;nice.
        System.out.println("Using BankAccount toString: " + myAccount);
        System.out.println("Using SavingsAccount toString: " + momSavings);
        
        
        //========
        // Static counter
        // Class variable
        
        CheckingAccount donChecking = new CheckingAccount(30);
        CheckingAccount donnaChecking = new CheckingAccount(30);
        System.out.println("\n\nNote the counter rising!");
        System.out.println("Using CheckingAccount toString: " + timChecking);
        System.out.println("Using CheckingAccount toString: " + donChecking);
        System.out.println("Using CheckingAccount toString: " + donnaChecking);

        
        // some more advanced stuff
        SavingsAccount collegeFund = new SavingsAccount(10);
        
        BankAccount anAccount;
        anAccount = collegeFund ;
        
        BankAccount[] accounts = new BankAccount[100];
        accounts[0] = momSavings ;
        accounts[1] = timChecking;
        accounts[2] = donnaChecking;
        
        // Wouldn't work:
        //accounts[0].addInterest();
        // will work
        SavingsAccount s1 = (SavingsAccount) accounts[0];
        s1.addInterest();
        
        momSavings.addInterest();
        
        // in Java, the object determines which function is called.
        System.out.println("\n\nUsing the array, trying to print a checking account.");
        System.out.println("donnaChecking :: " + accounts[2]);
        
        
    }
        
}
