package _27143.Q4;

import java.time.LocalDate;

public class Booking extends Customer {
    private LocalDate bookingDate;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Booking(int id, String hotelName, String address, String phoneNumber, String email,
                   int roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate) {
        super(id, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber);
        if (checkInDate.isAfter(checkOutDate)) throw new IllegalArgumentException("Check-in must be before check-out");
        this.bookingDate = bookingDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public LocalDate getBookingDate() { return bookingDate; }
    public LocalDate getCheckInDate() { return checkInDate; }
    public LocalDate getCheckOutDate() { return checkOutDate; }
}
