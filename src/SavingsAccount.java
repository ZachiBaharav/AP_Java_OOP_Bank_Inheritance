
// inheritance: One of the corner stones of OOP
// "IS-A"  relationship
//
// Using:  extends    and    implements  (abstract)
//
// Advantages:
//   avoid duplicating code
//   more flexible to changes
//   Data hiding
//   Overriding
// Disadvantages:
//  things get coupled. if we remove something from the base-class
//  Overloaded functions: Time and effort.

public class SavingsAccount extends BankAccount
{

    private double interestRate;
   
    public SavingsAccount(double rate)
    {
        // Something is happening with the BankAccount constructor
        interestRate = rate;
    }
    
    public void addInterest()
    {
        
        // balance is PRIVATE.
        // Even though it belongs to the superclass,
        // we cannot simply access it
        double interest = getBalance()*interestRate / 100;

        // we used implicitly 'this'.
        // this.deposit(interest);
        deposit(interest);   
    }

    
    public String toString() {
        return "Saving account. Interest rate=" + interestRate + " and " + super.toString() ;
    }
    
}
