package _27197.q6;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;

    public Bank(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String bankName, String branchCode, String address) throws BankDataException {
        super(id, createdDate, updatedDate);
        if (branchCode.length() < 3) throw new BankDataException("Branch code must be ≥ 3 chars 27197");
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.address = address;
    }
}
