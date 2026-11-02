
public class MiniBank {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];

        accounts[0] = new SavingsAccount("Rahul", 10000, 1000);
        accounts[1] = new CurrentAccount("Priya", 20000, 5000);
        accounts[2] = new FixedDepositAccount("Amit", 50000);

        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i]);
            System.out.println("Interest Rate: "
                    + accounts[i].interestRate() + "%");
            System.out.println("Monthly Interest: Rs. "
                    + accounts[i].monthlyInterest());

            if (accounts[i] instanceof SavingsAccount savings) {
                System.out.println("Minimum Balance: Rs. "
                        + savings.getMinBalance());
            }

            System.out.println();
        }

        System.out.println("Savings withdrawal: "
                + accounts[0].withdraw(2000));

        System.out.println("Current withdrawal: "
                + accounts[1].withdraw(24000));

        System.out.println("Fixed Deposit withdrawal: "
                + accounts[2].withdraw(1000));
    }
}
