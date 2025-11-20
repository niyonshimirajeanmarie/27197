package _27143.Q4;

public class Customer extends Room {
    private String customerName;
    private String customerEmail;
    private String contactNumber;

    public Customer(int id, String hotelName, String address, String phoneNumber, String email,
                    int roomNumber, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String contactNumber) {
        super(id, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight);
        if (customerName.isEmpty()) throw new IllegalArgumentException("Customer name cannot be empty");
        if (!customerEmail.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) throw new IllegalArgumentException("Invalid email format");
        if (!contactNumber.matches("\\d{10}")) throw new IllegalArgumentException("Contact must be 10 digits");
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.contactNumber = contactNumber;
    }

    public String getCustomerName() { return customerName; }
    public String getCustomerEmail() { return customerEmail; }
    public String getContactNumber() { return contactNumber; }
}
