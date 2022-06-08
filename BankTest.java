import java.util.ArrayList;
import java.util.Arrays;
public class BankTest {
    public static void main(String[] args) {
        
        BankAccount bankAcc1 = new BankAccount(100.00, 200.00);
        BankAccount bankAcc2 = new BankAccount(500.00, 1000.00);
        BankAccount bankAcc3 = new BankAccount(1000.00, 2000.00);
    	
        /* ============ App Test Cases ============= */
    
        System.out.printf("Total Deposits: %s", BankAccount.getTotalDeposits());
        bankAcc1.withdrawMoney();
        System.out.printf("\n1st Bank Account Checking: %s", bankAcc1.getCheckingBalance());
        System.out.printf("\n1st Bank Account Savings: %s", bankAcc1.getSavingsBalance());
        
        bankAcc2.depositMoney();
        System.out.printf("\n2nd Bank Account Checking: %s", bankAcc2.getCheckingBalance());
        System.out.printf("\n2nd Bank Account Savings: %s", bankAcc2.getSavingsBalance());

        System.out.printf("\nTotal Deposits: %s", BankAccount.getTotalDeposits());
        
    }
}


// Ninja Bonus: Add the following class attribute: account number.
// The type is up to you can be a String or Long or another type.

// Ninja Bonus: Create a private method that returns a random 
// ten digit account number.

// Ninja Bonus: In the constructor, call the private method from 
// above so that each user has a random ten digit account.

