package javaoop.constructor.encapsulation.bankaccount;

public class Main {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount("14526362", 5400.5);
        double newAmount = 600;
        System.out.println(myBankAccount.getBalance() + newAmount);
    }
}
