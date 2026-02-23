package org.exercises.task3;

public class BankAccount {
    private int accountBalance;

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Integer withdraw(int amount) {
        //позволяет снимать деньги со счета
        accountBalance = accountBalance - amount;
        return accountBalance;
    }

    public Integer deposit(int amount) {
        //позволяет положить деньги на счет
        accountBalance = accountBalance + amount;
        return accountBalance;
    }

    public void actualBalance() {
        System.out.println(accountBalance);
    }

}
