package model;

public class FixedDepositAccount extends Account {
    private final double rate;

    public FixedDepositAccount(String accountNumber, long balance, double rate) {
        super(accountNumber, balance);
        this.rate = rate;
    }

    @Override
    public double interestRate() {
        return rate;
    }

    @Override
    public boolean canWithdraw(long amount) {
        return false;
    }

    @Override
    public String toString() {
        return "FixedDepositAccount{accountNumber='" + accountNumber
                + "', balance=" + balance + ", rate=" + rate + "}";
    }
}