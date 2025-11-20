package _27197.q5;

public class Vehicle extends Branch {
    private String vehicleType;
    private String registrationNumber;
    private double dailyRate;

    public Vehicle(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate) throws VehicleDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode);
        if (dailyRate <= 0) throw new VehicleDataException("Daily rate must be > 0 27197");
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() { return dailyRate; }
}
