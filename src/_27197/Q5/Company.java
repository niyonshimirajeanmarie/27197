package _27197.q5;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;

    public Company(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String companyName, String address, String phoneNumber) throws VehicleDataException {
        super(id, createdDate, updatedDate);
        if (!phoneNumber.matches("\\d{10}")) throw new VehicleDataException("Phone must be 10 digits 27197");
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
