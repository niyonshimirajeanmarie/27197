package _27197.q9;

import java.time.LocalDateTime;

public class Flight extends Airline {
    private String flightNumber;
    private String destination;
    private LocalDateTime departureTime;

    public Flight(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String airlineName, String address, String contactEmail,
                  String flightNumber, String destination, LocalDateTime departureTime) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail);
        if (flightNumber.isEmpty() || destination.isEmpty() || departureTime == null)
            throw new AirlineDataException("Flight info cannot be empty 27197");
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }
}
