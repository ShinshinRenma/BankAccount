import java.io.*;
import java.util.*;

public class BankAccount {

    private static int accountCount = 0;
    private static double totalDeposit = 0;

    private double checkingBalance;
    private double savingsBalance;

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accountCount++;
        totalDeposit += this.checkingBalance + this.savingsBalance;
    }
    
    // Getters
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    
    // Setters
    public void setCheckingBalance(double balance) {
        this.checkingBalance = balance;
        totalDeposit += this.checkingBalance;
    }
    public void setSavingsBalance(double balance) {
        this.savingsBalance = balance;
        totalDeposit += this.savingsBalance;
    }

    // Deposit
    public void depositMoney() {
        Scanner input = new Scanner(System.in); 
        System.out.println("\nEnter how much you would like to deposit: \n$");
        Double depAmount = input.nextDouble();
        System.out.println("Which account would you like to deposit into? \nEnter 1 for Checking, 2 for Savings: ");
        int accountChoice = input.nextInt();
        if(accountChoice == 1) {
            this.checkingBalance += depAmount;
            totalDeposit += depAmount;
        }
        else if (accountChoice == 2) {
            this.savingsBalance += depAmount;
            totalDeposit += depAmount;
        }
        else {
            System.out.println("Invalid option selected.");
        }
    }
    // Withdrawal 
    public void withdrawMoney() {
        Scanner input = new Scanner(System.in); 
        System.out.println("\nEnter how much you would like to withdraw: $");
        Double wdAmount = input.nextDouble();
        System.out.println("Which account would you like to withdraw from? \nEnter 1 for Checking, 2 for Savings: ");
        int accountChoice = input.nextInt();
        if(accountChoice == 1) {
            if(this.checkingBalance >= wdAmount){
                this.checkingBalance -= wdAmount;
                totalDeposit -= wdAmount;
            }
            else {
                System.out.println("Insufficient funds!");
            }
            
        }
        else if (accountChoice == 2) {
            if(this.savingsBalance >= wdAmount) {
                this.savingsBalance -= wdAmount;
                totalDeposit -= wdAmount;
            }
            else {
                System.out.println("Insufficient funds!");
            }
            
        }
        else {
            System.out.println("Invalid option selected.");
        }
    }
    public static double getTotalDeposits() {
        return totalDeposit;
    }
}

