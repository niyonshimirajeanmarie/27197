package _27197.q9;

public class Invoice extends Payment {
    private double totalFare;

    public Invoice(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, java.time.LocalDateTime departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee,
                   java.time.LocalDate paymentDate, String paymentMode,
                   double totalFare) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee, paymentDate, paymentMode);
        if (totalFare <= 0) throw new AirlineDataException("Total fare must be > 0 27197");
        this.totalFare = totalFare;
    }

    public double getTotalFare() { return totalFare; }
}
