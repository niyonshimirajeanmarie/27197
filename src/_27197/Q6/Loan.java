package _27197.q6;

public class Loan extends Withdrawal {
    private double loanAmount;
    private double interestRate;
    private int duration; // in years

    public Loan(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String bankName, String branchCode, String address,
                String accountNumber, String accountType, double balance,
                String customerName, String email, String phoneNumber,
                String transactionId, String transactionType, double amount,
                double depositAmount, java.time.LocalDate depositDate,
                double withdrawalAmount, java.time.LocalDate withdrawalDate,
                double loanAmount, double interestRate, int duration) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance, customerName, email, phoneNumber,
                transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate);
        if (loanAmount <= 0 || interestRate <= 0 || duration <= 0)
            throw new BankDataException("Loan info invalid 27197");
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.duration = duration;
    }

    public double calculateInterest() {
        return (loanAmount * interestRate * duration) / 100;
    }
}
