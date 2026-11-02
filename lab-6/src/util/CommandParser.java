package util;

public class CommandParser {
    public static Command parse(String input) {
        if (input == null || input.trim().isEmpty()) {
            return null;
        }

        String[] parts = input.trim().split("\\s+");

        try {
            TransactionType type = TransactionType.valueOf(parts[0].toUpperCase());

            String accountNumber = parts.length > 1 ? parts[1] : "";
            long amount = parts.length > 2 ? Long.parseLong(parts[2]) : 0;

            return new Command(type, accountNumber, amount);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}