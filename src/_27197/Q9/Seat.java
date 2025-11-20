package _27197.q9;

public class Seat extends Passenger {
    private String seatNumber;
    private String seatType; // Economy/Business

    public Seat(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String airlineName, String address, String contactEmail,
                String flightNumber, String destination, java.time.LocalDateTime departureTime,
                String passengerName, String passportNumber, String nationality,
                String seatNumber, String seatType) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality);
        if (!seatType.equals("Economy") && !seatType.equals("Business"))
            throw new AirlineDataException("Seat type must be Economy/Business 27197");
        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }
}
