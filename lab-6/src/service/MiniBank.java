package service;

import java.util.Scanner;
import model.Account;
import model.SavingsAccount;
import model.CurrentAccount;
import model.FixedDepositAccount;
import model.WithdrawRule;
import util.StatementFormatter;
import static util.Validator.isValidMobile;

public class MiniBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingsAccount savings = new SavingsAccount("SB101", 10000, 4.0);
       CurrentAccount current = new CurrentAccount("CA101", 20000, 10000, 2.0);
        FixedDepositAccount fixed = new FixedDepositAccount("FD101", 50000, 6.5);

        WithdrawRule rule1 = new WithdrawRule() {
            @Override
            public boolean allow(Account account, long amount) {
                return account.canWithdraw(amount);
            }
        };

        WithdrawRule rule2 = (account, amount) -> account.canWithdraw(amount);

        System.out.println("MiniBank");
        System.out.println("Mobile valid: " + isValidMobile("9876543210"));
        System.out.println();

        System.out.println("Savings Account");
        System.out.println(StatementFormatter.format(savings));
        System.out.println("Yearly Interest: " + savings.yearlyInterest());
        System.out.println("Anonymous rule allows withdrawal: "
                + rule1.allow(savings, 1000));
        System.out.println("Lambda rule allows withdrawal: "
                + rule2.allow(savings, 1000));
        System.out.println();

        System.out.println("Current Account");
        System.out.println(StatementFormatter.format(current));
        System.out.println("Yearly Interest: " + current.yearlyInterest());
        System.out.println();

        System.out.println("Fixed Deposit Account");
        System.out.println(StatementFormatter.format(fixed));
        System.out.println("Yearly Interest: " + fixed.yearlyInterest());
        System.out.println();

        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();

        if (isValidMobile(mobile)) {
            System.out.println("Valid mobile number");
        } else {
            System.out.println("Invalid mobile number");
        }

        sc.close();
    }
}