package util;

public record Command(TransactionType type, String accountNumber, long amount) {
}

enum TransactionType {
    DEPOSIT,
    WITHDRAW,
    BALANCE,
    EXIT
}