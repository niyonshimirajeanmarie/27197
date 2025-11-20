
package _27143.Q4;

public class Room extends Hotel {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int id, String hotelName, String address, String phoneNumber, String email,
                int roomNumber, String roomType, double pricePerNight) {
        super(id, hotelName, address, phoneNumber, email);
        if (roomNumber <= 0) throw new IllegalArgumentException("Room number must be > 0");
        if (pricePerNight <= 0) throw new IllegalArgumentException("Price must be > 0");
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    // Getters
    public int getRoomNumber() { return roomNumber; }
    public String getRoomType() { return roomType; }
    public double getPricePerNight() { return pricePerNight; }
}
