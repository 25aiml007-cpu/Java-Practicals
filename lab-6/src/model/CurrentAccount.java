package model;

public class CurrentAccount extends Account {
    private final long overdraftLimit;
    private final double rate;

    public CurrentAccount(String accountNumber, long balance, long overdraftLimit, double rate) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
        this.rate = rate;
    }

    @Override
    public double interestRate() {
        return rate;
    }

    @Override
    public boolean canWithdraw(long amount) {
        return amount > 0 && amount <= balance + overdraftLimit;
    }

    @Override
    public String toString() {
        return "CurrentAccount{accountNumber='" + accountNumber
                + "', balance=" + balance + ", overdraftLimit=" + overdraftLimit + "}";
    }
}