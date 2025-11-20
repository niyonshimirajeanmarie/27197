package _27143.Q4;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hotel(int id, String hotelName, String address, String phoneNumber, String email) {
        super(id);
        if (hotelName.isEmpty() || address.isEmpty()) throw new IllegalArgumentException("Hotel info cannot be empty");
        if (!phoneNumber.matches("\\d{10}")) throw new IllegalArgumentException("Phone must be 10 digits");
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) throw new IllegalArgumentException("Invalid email format");
        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters
    public String getHotelName() { return hotelName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}
