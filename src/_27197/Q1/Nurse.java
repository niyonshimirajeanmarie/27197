package _27197.q1;

public class Nurse extends Doctor {
    private String nurseName;
    private String shift;
    private int yearsOfExperience;

    public Nurse(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                 String hospitalName, String address, String phoneNumber, String email,
                 String departmentName, String departmentCode,
                 String doctorName, String specialization, String doctorEmail, String doctorPhone,
                 String nurseName, String shift, int yearsOfExperience) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, doctorPhone);

        if (!(shift.equalsIgnoreCase("Day") || shift.equalsIgnoreCase("Night")))
            throw new HospitalDataException("Shift must be 'Day' or 'Night' 27197");
        if (yearsOfExperience < 0)
            throw new HospitalDataException("Years of experience must be >= 0 27197");

        this.nurseName = nurseName;
        this.shift = shift;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getNurseName() {
        return nurseName;
    }

    public String getShift() {
        return shift;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
