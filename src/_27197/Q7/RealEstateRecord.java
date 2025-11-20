package _27197.q7;

public final class RealEstateRecord extends Commission {

    public RealEstateRecord(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                            String agencyName, String location, String phoneNumber,
                            String agentName, String agentEmail, String licenseNumber,
                            String propertyCode, String propertyType, double price,
                            String sellerName, String contactNumber,
                            String buyerName, String buyerEmail,
                            java.time.LocalDate agreementDate, String terms,
                            double paymentAmount, java.time.LocalDate paymentDate,
                            double commissionRate) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail,
                agreementDate, terms, paymentAmount, paymentDate, commissionRate);
    }

    public void displayRecord() {
        System.out.println("=== Real Estate Record 27197 ===");
        System.out.println("Commission Amount: $" + getCommissionAmount() + " 27197");
        System.out.println("============================== 27197");
    }
}
