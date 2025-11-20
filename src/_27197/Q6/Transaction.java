package _27197.q6;

public class Transaction extends Customer {
    private String transactionId;
    private String transactionType;
    private double amount;

    public Transaction(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                       String bankName, String branchCode, String address,
                       String accountNumber, String accountType, double balance,
                       String customerName, String email, String phoneNumber,
                       String transactionId, String transactionType, double amount) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance,
                customerName, email, phoneNumber);
        if (amount <= 0) throw new BankDataException("Transaction amount must be > 0 27197");
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public double getAmount() { return amount; }
}
