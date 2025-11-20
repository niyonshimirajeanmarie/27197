package _27197.q7;

public class Commission extends Payment {
    private double commissionRate; // percentage
    private double commissionAmount;

    public Commission(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
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
                agreementDate, terms, paymentAmount, paymentDate);
        if (commissionRate < 0) throw new RealEstateDataException("Commission rate must be ≥ 0 27197");
        this.commissionRate = commissionRate;
        this.commissionAmount = (getPaymentAmount() * commissionRate) / 100;
    }

    public double getCommissionAmount() { return commissionAmount; }
}
