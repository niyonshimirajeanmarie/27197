package _27197.q3;

public class Allowance extends Attendance {
    private double housingAllowance;
    private double transportAllowance;

    public Allowance(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                     String companyName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String managerName, String managerEmail, String managerPhone,
                     String employeeName, int employeeId, String designation, String contactNumber,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode, managerName, managerEmail, managerPhone,
                employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays);

        if (housingAllowance < 0 || transportAllowance < 0)
            throw new PayrollDataException("Allowances must be >= 0 27197");

        this.housingAllowance = housingAllowance;
        this.transportAllowance = transportAllowance;
    }

    public double getTotalAllowance() {
        return housingAllowance + transportAllowance;
    }
}
