package org.exercises.task3;

public class SavingsAccount extends BankAccount {
    @Override
    public Integer withdraw(int amount) {
        if ((getAccountBalance() - amount) >= 100) {
            setAccountBalance(getAccountBalance() - amount);
            return getAccountBalance();
        } else if ((getAccountBalance() - amount) < 100) {
            System.out.println("Невозможно снять деньги со счета, так как после снятия баланс составит менее 100 рублей!");
        }
        return -1;
    }
}
