package javaoop.constructor.encapsulation.bankaccount;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    Integer age = null;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    // getters

    public double getBalance() {
        return balance;
    }

    public Integer getAge() {
        return age;
    }

    public String accountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

}
