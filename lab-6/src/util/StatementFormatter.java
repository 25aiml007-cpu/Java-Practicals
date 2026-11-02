package util;

import model.Account;

public class StatementFormatter {
    public static String format(Account account) {
        return "Account Number: " + account.accountNumber()
                + "\nBalance: " + account.balance();
    }
}