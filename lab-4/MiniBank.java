
public class MiniBank {
    public static void main(String[] args) {
        System.out.println("Mobile: " +
                Validator.isValidMobile("9876543210"));
        System.out.println("Mobile: " +
                Validator.isValidMobile("12345"));

        System.out.println("Email: " +
                Validator.isValidEmail("abc@xyz.com"));
        System.out.println("Email: " +
                Validator.isValidEmail("abcxyz.com"));

        System.out.println("PAN: " +
                Validator.isValidPan("ABCDE1234F"));
        System.out.println("PAN: " +
                Validator.isValidPan("12345"));

        System.out.println("IFSC: " +
                Validator.isValidIfsc("SBIN0001234"));
        System.out.println("IFSC: " +
                Validator.isValidIfsc("12345"));

        Command command = CommandParser.parse("DEPOSIT AC0001 500");

        System.out.println("\nCommand Details");
        System.out.println("Type: " + command.type());
        System.out.println("Account Number: " + command.accountNumber());
        System.out.println("Amount: " + command.amount());

        Account account = new Account("Rahul", 1500);

        System.out.println();
        System.out.println(StatementFormatter.buildStatement(account));
    }
}
