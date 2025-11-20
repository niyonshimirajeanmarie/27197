package _27197.q9;

public class Passenger extends Flight {
    private String passengerName;
    private String passportNumber;
    private String nationality;

    public Passenger(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                     String airlineName, String address, String contactEmail,
                     String flightNumber, String destination, java.time.LocalDateTime departureTime,
                     String passengerName, String passportNumber, String nationality) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime);
        if (passportNumber.isEmpty()) throw new AirlineDataException("Passport cannot be empty 27197");
        this.passengerName = passengerName;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }
}
