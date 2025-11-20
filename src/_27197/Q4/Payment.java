package _27143.Q4;

import java.time.LocalDate;

public class Payment extends Service {
    private String paymentMethod;
    private LocalDate paymentDate;

    public Payment(int id, String hotelName, String address, String phoneNumber, String email,
                   int roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate,
                   String serviceName, double serviceCost,
                   String paymentMethod, LocalDate paymentDate) {
        super(id, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost);
        if (paymentMethod.isEmpty()) throw new IllegalArgumentException("Payment method cannot be empty");
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() { return paymentMethod; }
    public LocalDate getPaymentDate() { return paymentDate; }
}
