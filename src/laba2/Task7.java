package laba2;

interface BankAccount {
    void createAccount(double initialBalance);
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class BankAccountImpl implements BankAccount {
    private double balance;

    @Override
    public void createAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
            System.out.println("Счет создан с начальным балансом: " + balance);
        } else {
            System.out.println("Ошибка: начальный баланс не может быть отрицательным");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение на " + amount + ". Новый баланс: " + balance);
        } else {
            System.out.println("Ошибка: сумма пополнения должна быть положительной");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие " + amount + ". Новый баланс: " + balance);
        } else {
            System.out.println("Ошибка: недостаточно средств или неверная сумма");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

public class Task7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccountImpl();

        account.createAccount(1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("Текущий баланс: " + account.getBalance());
    }
}
