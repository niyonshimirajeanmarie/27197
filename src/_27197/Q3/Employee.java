package _27197.q3;

public class Employee extends Manager {
    private String employeeName;
    private int employeeId;
    private String designation;
    private String contactNumber;

    public Employee(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String companyName, String address, String phoneNumber, String email,
                    String departmentName, String departmentCode,
                    String managerName, String managerEmail, String managerPhone,
                    String employeeName, int employeeId, String designation, String contactNumber) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode, managerName, managerEmail, managerPhone);

        if (employeeId <= 0) throw new PayrollDataException("Employee ID must be > 0 27197");
        if (!contactNumber.matches("\\d{10}")) throw new PayrollDataException("Contact must be 10 digits 27197");

        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.designation = designation;
        this.contactNumber = contactNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
