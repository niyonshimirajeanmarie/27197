package _27197.q7;

import java.time.LocalDate;

public class Payment extends Agreement {
    private double paymentAmount;
    private LocalDate paymentDate;

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                   String agencyName, String location, String phoneNumber,
                   String agentName, String agentEmail, String licenseNumber,
                   String propertyCode, String propertyType, double price,
                   String sellerName, String contactNumber,
                   String buyerName, String buyerEmail,
                   LocalDate agreementDate, String terms,
                   double paymentAmount, LocalDate paymentDate) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail,
                agreementDate, terms);
        if (paymentAmount <= 0) throw new RealEstateDataException("Payment amount must be > 0 27197");
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() { return paymentAmount; }
}
