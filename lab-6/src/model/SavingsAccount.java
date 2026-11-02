package model;

public class SavingsAccount extends Account implements Premium {
    private final double rate;

    public SavingsAccount(String accountNumber, long balance, double rate) {
        super(accountNumber, balance);
        this.rate = rate;
    }

    @Override
    public double interestRate() {
        return rate;
    }

    @Override
    public boolean canWithdraw(long amount) {
        return amount > 0 && amount <= balance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{accountNumber='" + accountNumber
                + "', balance=" + balance + ", rate=" + rate + "}";
    }
}