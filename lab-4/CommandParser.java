
public class CommandParser {
    public static Command parse(String line) {
        if (line == null) {
            throw new IllegalArgumentException("Command cannot be empty.");
        }

        String[] parts = line.trim().split("\\s+");

        if (parts.length != 3) {
            throw new IllegalArgumentException(
                    "Enter command in the format: DEPOSIT AC0001 500");
        }

        try {
            TransactionType type =
                    TransactionType.valueOf(parts[0].toUpperCase());

            if (!Validator.isValidAmount(parts[2])) {
                throw new IllegalArgumentException(
                        "Amount must be a positive whole number.");
            }

            long amount = Long.parseLong(parts[2]);

            return new Command(type, parts[1], amount);

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(
                    "Invalid command or amount: " + e.getMessage());
        }
    }
}
