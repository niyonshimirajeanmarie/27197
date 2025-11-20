package _27197.q7;

public class Agency extends Entity {
    private String agencyName;
    private String location;
    private String phoneNumber;

    public Agency(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String agencyName, String location, String phoneNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        if (!phoneNumber.matches("\\d{10}")) throw new RealEstateDataException("Phone must be 10 digits 27197");
        this.agencyName = agencyName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
}
