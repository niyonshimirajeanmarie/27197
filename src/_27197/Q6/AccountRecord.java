package _27197.q6;

public final class AccountRecord extends Payment {

    public AccountRecord(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                         String bankName, String branchCode, String address,
                         String accountNumber, String accountType, double balance,
                         String customerName, String email, String phoneNumber,
                         String transactionId, String transactionType, double amount,
                         double depositAmount, java.time.LocalDate depositDate,
                         double withdrawalAmount, java.time.LocalDate withdrawalDate,
                         double loanAmount, double interestRate, int duration,
                         double paymentAmount, java.time.LocalDate paymentDate) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance,
                customerName, email, phoneNumber, transactionId, transactionType, amount,
                depositAmount, depositDate, withdrawalAmount, withdrawalDate,
                loanAmount, interestRate, duration, paymentAmount, paymentDate);
    }

    public void displayAccount() {
        System.out.println("===== Account Record ===== 27197");
        System.out.println("Interest on Loan: $" + calculateInterest() + " 27197");
        System.out.println("========================== 27197");
    }
}
