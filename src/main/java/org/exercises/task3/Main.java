package org.exercises.task3;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.actualBalance();
        bankAccount.withdraw(900);
        bankAccount.actualBalance();

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(1000);
        savingsAccount.actualBalance();
        savingsAccount.withdraw(900);
        savingsAccount.actualBalance();
    }
}
