package _27143.Q4;

public class Service extends Booking {
    private String serviceName;
    private double serviceCost;

    public Service(int id, String hotelName, String address, String phoneNumber, String email,
                   int roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   java.time.LocalDate bookingDate, java.time.LocalDate checkInDate, java.time.LocalDate checkOutDate,
                   String serviceName, double serviceCost) {
        super(id, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate);
        if (serviceName.isEmpty()) throw new IllegalArgumentException("Service name cannot be empty");
        if (serviceCost <= 0) throw new IllegalArgumentException("Service cost must be > 0");
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }

    public String getServiceName() { return serviceName; }
    public double getServiceCost() { return serviceCost; }
}
