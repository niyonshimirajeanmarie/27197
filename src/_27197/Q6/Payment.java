package _27197.q6;

import java.time.LocalDate;

public class Payment extends Loan {
    private double paymentAmount;
    private LocalDate paymentDate;

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double depositAmount, LocalDate depositDate,
                   double withdrawalAmount, LocalDate withdrawalDate,
                   double loanAmount, double interestRate, int duration,
                   double paymentAmount, LocalDate paymentDate) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance, customerName, email, phoneNumber,
                transactionId, transactionType, amount, depositAmount, depositDate,
                withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration);
        if (paymentAmount <= 0) throw new BankDataException("Payment amount must be > 0 27197");
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() { return paymentAmount; }
}
