package _27197.q9;

public class Airline extends Entity {
    private String airlineName;
    private String address;
    private String contactEmail;

    public Airline(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String airlineName, String address, String contactEmail) throws AirlineDataException {
        super(id, createdDate, updatedDate);
        if (!contactEmail.matches("^(.+)@(.+)$")) throw new AirlineDataException("Invalid email 27197");
        this.airlineName = airlineName;
        this.address = address;
        this.contactEmail = contactEmail;
    }
}
