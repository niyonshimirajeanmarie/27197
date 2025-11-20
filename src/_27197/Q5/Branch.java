package _27197.q5;

public class Branch extends Company {
    private String branchName;
    private String locationCode;

    public Branch(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode) throws VehicleDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber);
        if (locationCode.length() < 3) throw new VehicleDataException("Location code must be ≥ 3 chars 27197");
        this.branchName = branchName;
        this.locationCode = locationCode;
    }
}
