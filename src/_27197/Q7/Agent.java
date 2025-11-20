package _27197.q7;

public class Agent extends Agency {
    private String agentName;
    private String email;
    private String licenseNumber;

    public Agent(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String email, String licenseNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber);
        if (!email.matches("^(.+)@(.+)$")) throw new RealEstateDataException("Invalid email 27197");
        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }
}
