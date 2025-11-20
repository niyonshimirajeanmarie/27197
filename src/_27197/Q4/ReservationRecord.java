package _27143.Q4;

import java.time.LocalDate;

public final class ReservationRecord extends Feedback {
    private static final String STUDENT_ID = "27197";

    public ReservationRecord(int id, String hotelName, String address, String phoneNumber, String email,
                             int roomNumber, String roomType, double pricePerNight,
                             String customerName, String customerEmail, String contactNumber,
                             LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate,
                             String serviceName, double serviceCost,
                             String paymentMethod, LocalDate paymentDate,
                             double roomCharge, double serviceCharge,
                             int rating, String comments) {
        super(id, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost, paymentMethod, paymentDate, roomCharge, serviceCharge,
                rating, comments);
    }

    public void generateReservationReport() {
        System.out.println("===== HOTEL RESERVATION RECORD (" + STUDENT_ID + ") =====");
        System.out.println("Hotel: " + getHotelName() + ", Address: " + getAddress() + ", Phone: " + getPhoneNumber() + " [" + STUDENT_ID + "]");
        System.out.println("Customer: " + getCustomerName() + ", Email: " + getCustomerEmail() + ", Contact: " + getContactNumber() + " [" + STUDENT_ID + "]");
        System.out.println("Room: " + getRoomNumber() + " (" + getRoomType() + "), Price per Night: $" + getPricePerNight() + " [" + STUDENT_ID + "]");
        System.out.println("Booking: " + getBookingDate() + ", Check-In: " + getCheckInDate() + ", Check-Out: " + getCheckOutDate() + " [" + STUDENT_ID + "]");
        System.out.println("Service: " + getServiceName() + ", Cost: $" + getServiceCost() + " [" + STUDENT_ID + "]");
        System.out.println("Payment Method: " + getPaymentMethod() + ", Date: " + getPaymentDate() + " [" + STUDENT_ID + "]");
        System.out.println("Room Charge: $" + getRoomCharge() + ", Service Charge: $" + getServiceCharge() + ", Total Bill: $" + getTotalBill() + " [" + STUDENT_ID + "]");
        System.out.println("Rating: " + getRating() + ", Comments: " + getComments() + " [" + STUDENT_ID + "]");
    }
}
