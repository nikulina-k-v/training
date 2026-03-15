package org.exercises.chapter3p3to3p4.task3;

public class BankAccount {
    private int accountBalance;

    public int getAccountBalance() {
        return accountBalance;
    }

    private void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Integer withdraw(int amount) {
        //позволяет снимать деньги со счета
        if (amount >= 0 && amount <= accountBalance) {
            accountBalance = accountBalance - amount;
        } else if (amount < 0) {
            System.out.println("Невозможно снять деньги со счета. На счету недостаточно средств!");
        }
        return accountBalance;
    }

    public Integer deposit(int amount) {
        //позволяет положить деньги на счет
        if (amount >= 0) {
            accountBalance = accountBalance + amount;
        } else if (amount < 0) {
            System.out.println("Невозможно пополнить баланс счета. Недостаточно средств!");
        }
        return accountBalance;
    }

    public void actualBalance() {
        System.out.println(accountBalance);
    }

}
