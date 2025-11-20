package _27197.q5;

public class Payment extends Charge {
    private String paymentMode;
    private String transactionId;

    public Payment(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate,
                   String customerName, String licenseNumber, String contactNumber,
                   java.time.LocalDate rentalDate, java.time.LocalDate returnDate, int rentalDays,
                   double rentalCharge, double penaltyCharge,
                   String paymentMode, String transactionId) throws VehicleDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber,
                rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge);
        if (paymentMode.isEmpty() || transactionId.isEmpty()) throw new VehicleDataException("Payment info invalid 27197");
        this.paymentMode = paymentMode;
        this.transactionId = transactionId;
    }
}
