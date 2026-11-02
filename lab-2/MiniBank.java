
public class MiniBank {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];

        accounts[0] = new Account("Rahul", 1000);
        accounts[1] = new Account("Priya", 2000);
        accounts[2] = new Account("Amit");

        accounts[0].deposit(500);
        accounts[1].withdraw(300);
        accounts[2].deposit(1000);

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Account Number: " + accounts[i].getAccountNumber());
            System.out.println("Owner: " + accounts[i].getOwnerName());
            System.out.println("Balance: Rs. " + accounts[i].getBalance());
            System.out.println();
        }
    }
}
