package _27197.q6;

import java.time.LocalDate;

public class Withdrawal extends Deposit {
    private double withdrawalAmount;
    private LocalDate withdrawalDate;

    public Withdrawal(int id, LocalDate createdDate, LocalDate updatedDate,
                      String bankName, String branchCode, String address,
                      String accountNumber, String accountType, double balance,
                      String customerName, String email, String phoneNumber,
                      String transactionId, String transactionType, double amount,
                      double depositAmount, LocalDate depositDate,
                      double withdrawalAmount, LocalDate withdrawalDate) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
                accountNumber, accountType, balance, customerName, email, phoneNumber,
                transactionId, transactionType, amount, depositAmount, depositDate);
        if (withdrawalAmount <= 0) throw new BankDataException("Withdrawal amount must be > 0 27197");
        this.withdrawalAmount = withdrawalAmount;
        this.withdrawalDate = withdrawalDate;
    }

    public double getWithdrawalAmount() { return withdrawalAmount; }
}
