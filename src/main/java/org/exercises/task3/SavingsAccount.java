package org.exercises.task3;

public class SavingsAccount extends BankAccount {
    @Override
    public Integer withdraw(int amount) {
        int difference = getAccountBalance() - amount;
        if (difference >= 100) {
            super.withdraw(amount);
            return getAccountBalance();
        } else if (difference < 100) {
            System.out.println("Невозможно снять деньги со счета, так как после снятия баланс составит менее 100 рублей!");
        }
        return -1;
    }
}
