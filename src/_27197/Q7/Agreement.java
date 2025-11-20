package _27197.q7;

import java.time.LocalDate;

public class Agreement extends Buyer {
    private LocalDate agreementDate;
    private String terms;

    public Agreement(int id, LocalDate createdDate, LocalDate updatedDate,
                     String agencyName, String location, String phoneNumber,
                     String agentName, String agentEmail, String licenseNumber,
                     String propertyCode, String propertyType, double price,
                     String sellerName, String contactNumber,
                     String buyerName, String buyerEmail,
                     LocalDate agreementDate, String terms) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail);
        if (terms.isEmpty() || agreementDate == null)
            throw new RealEstateDataException("Terms/date cannot be empty 27197");
        this.agreementDate = agreementDate;
        this.terms = terms;
    }
}
