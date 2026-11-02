
import java.util.Scanner;

record BankInfo(String name, String branch) {}

enum MenuOption {
    OPEN_ACCOUNT, DEPOSIT, WITHDRAW, TRANSFER, EXIT
}

public class MiniBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankInfo bank = new BankInfo("MiniBank", "Main Branch");
        System.out.println("Welcome to " + bank.name());
        System.out.println("Branch: " + bank.branch());

        int choice;

        do {
            System.out.println("\n1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            if (choice == 5) {
                System.out.println("Thank you for using MiniBank!");
                break;
            }

            MenuOption option = switch (choice) {
                case 1 -> MenuOption.OPEN_ACCOUNT;
                case 2 -> MenuOption.DEPOSIT;
                case 3 -> MenuOption.WITHDRAW;
                case 4 -> MenuOption.TRANSFER;
                default -> MenuOption.EXIT;
            };

            switch (option) {
                case OPEN_ACCOUNT ->
                    System.out.println("Open Account - coming soon.");
                case DEPOSIT ->
                    System.out.println("Deposit - coming soon.");
                case WITHDRAW ->
                    System.out.println("Withdraw - coming soon.");
                case TRANSFER ->
                    System.out.println("Transfer - coming soon.");
                case EXIT ->
                    System.out.println("Goodbye!");
            }

        } while (true);

        sc.close();
    }
}
