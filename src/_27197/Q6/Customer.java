package _27197.q6;

public class Customer extends Account {
    private String customerName;
    private String email;
    private String phoneNumber;

    public Customer(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String bankName, String branchCode, String address,
                    String accountNumber, String accountType, double balance,
                    String customerName, String email, String phoneNumber) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance);
        if (!phoneNumber.matches("\\d{10}")) throw new BankDataException("Phone must be 10 digits 27197");
        if (!email.matches("^(.+)@(.+)$")) throw new BankDataException("Invalid email format 27197");
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
