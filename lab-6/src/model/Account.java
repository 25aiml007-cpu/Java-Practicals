package model;

public abstract class Account implements Transactable, InterestBearing, Cloneable {
    protected String accountNumber;
    protected long balance;

    public Account(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String accountNumber() {
        return accountNumber;
    }

    @Override
    public long balance() {
        return balance;
    }

    @Override
    public void deposit(long amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public boolean withdraw(long amount) {
        if (amount > 0 && canWithdraw(amount)) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public abstract boolean canWithdraw(long amount);

    @Override
    public String toString() {
        return "Account{accountNumber='" + accountNumber + "', balance=" + balance + "}";
    }

    @Override
    public Account clone() {
        try {
            return (Account) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}