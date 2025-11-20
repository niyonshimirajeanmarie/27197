package _27197.q7;

public class Seller extends Property {
    private String sellerName;
    private String contactNumber;

    public Seller(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String agencyName, String location, String phoneNumber,
                  String agentName, String email, String licenseNumber,
                  String propertyCode, String propertyType, double price,
                  String sellerName, String contactNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber,
                propertyCode, propertyType, price);
        if (sellerName.isEmpty() || contactNumber.isEmpty())
            throw new RealEstateDataException("Seller name/contact cannot be empty 27197");
        this.sellerName = sellerName;
        this.contactNumber = contactNumber;
    }
}
