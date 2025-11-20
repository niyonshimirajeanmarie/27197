package _27197.q3;

public class Attendance extends Employee {
    private int totalDays;
    private int presentDays;
    private int leaveDays;

    public Attendance(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String companyName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode,
                      String managerName, String managerEmail, String managerPhone,
                      String employeeName, int employeeId, String designation, String contactNumber,
                      int totalDays, int presentDays, int leaveDays) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode, managerName, managerEmail, managerPhone,
                employeeName, employeeId, designation, contactNumber);

        if (totalDays < 0 || presentDays < 0 || leaveDays < 0)
            throw new PayrollDataException("Attendance values cannot be negative 27197");
        if (presentDays > totalDays)
            throw new PayrollDataException("Present days cannot exceed total days 27197");

        this.totalDays = totalDays;
        this.presentDays = presentDays;
        this.leaveDays = leaveDays;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public int getPresentDays() {
        return presentDays;
    }

    public int getLeaveDays() {
        return leaveDays;
    }
}
