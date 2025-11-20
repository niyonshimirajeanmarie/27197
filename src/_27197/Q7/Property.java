package _27197.q7;

public class Property extends Agent {
    private String propertyCode;
    private String propertyType;
    private double price;

    public Property(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String agencyName, String location, String phoneNumber,
                    String agentName, String email, String licenseNumber,
                    String propertyCode, String propertyType, double price) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber);
        if (price <= 0) throw new RealEstateDataException("Price must be > 0 27197");
        this.propertyCode = propertyCode;
        this.propertyType = propertyType;
        this.price = price;
    }

    public double getPrice() { return price; }
}
