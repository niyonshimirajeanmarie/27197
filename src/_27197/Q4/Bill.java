package _27143.Q4;

public class Bill extends Payment {
    private double roomCharge;
    private double serviceCharge;
    private double totalBill;

    public Bill(int id, String hotelName, String address, String phoneNumber, String email,
                int roomNumber, String roomType, double pricePerNight,
                String customerName, String customerEmail, String contactNumber,
                java.time.LocalDate bookingDate, java.time.LocalDate checkInDate, java.time.LocalDate checkOutDate,
                String serviceName, double serviceCost,
                String paymentMethod, java.time.LocalDate paymentDate,
                double roomCharge, double serviceCharge) {
        super(id, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost, paymentMethod, paymentDate);
        if (roomCharge < 0 || serviceCharge < 0) throw new IllegalArgumentException("Charges must be >= 0");
        this.roomCharge = roomCharge;
        this.serviceCharge = serviceCharge;
        generateBill();
    }

    public void generateBill() { this.totalBill = roomCharge + serviceCharge; }

    public double getRoomCharge() { return roomCharge; }
    public double getServiceCharge() { return serviceCharge; }
    public double getTotalBill() { return totalBill; }
}
