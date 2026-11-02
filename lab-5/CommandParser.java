
public class CommandParser {
    public static Command parse(String line) {
        if (line == null || line.trim().isEmpty()) {
            throw new IllegalArgumentException("Command cannot be empty.");
        }

        String[] parts = line.trim().split("\\s+");

        if (parts.length != 3) {
            throw new IllegalArgumentException(
                    "Use: DEPOSIT AC0001 500");
        }

        TransactionType type;

        try {
            type = TransactionType.valueOf(parts[0].toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid transaction type.");
        }

        if (!Validator.isValidAmount(parts[2])) {
            throw new IllegalArgumentException(
                    "Amount must be a positive whole number.");
        }

        try {
            long amount = Long.parseLong(parts[2]);
            return new Command(type, parts[1], amount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Amount is too large.");
        }
    }
}
