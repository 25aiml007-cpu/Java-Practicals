
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
            System.out.println(accounts[i].toString());
        }

        System.out.println();

        Account anotherAccount = new Account("Rahul", 1500);

        System.out.println("Are accounts equal? "
                + accounts[0].equals(anotherAccount));

        Object obj = accounts[0];

        if (obj instanceof Account) {
            System.out.println("Object is an Account.");
        }

        Customer customer = new Customer(
                "Rahul",
                "rahul@gmail.com",
                "9876543210",
                new Customer.Address("Main Road", "Surat", "395007")
        );

        Customer copy = customer.clone();

        System.out.println("\nCustomer ID: " + customer.getCustomerId());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("City: " + customer.getAddress().getCity());
        System.out.println("Cloned Customer: " + copy.getName());

        System.out.println();
        System.out.println(accounts[0].getStatement());
    }
}
