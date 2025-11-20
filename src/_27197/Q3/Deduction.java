package _27197.q3;

public class Deduction extends Allowance {
    private double taxDeduction;
    private double loanDeduction;

    public Deduction(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                     String companyName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String managerName, String managerEmail, String managerPhone,
                     String employeeName, int employeeId, String designation, String contactNumber,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance,
                     double taxDeduction, double loanDeduction) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode, managerName, managerEmail, managerPhone,
                employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance);

        if (taxDeduction < 0 || loanDeduction < 0)
            throw new PayrollDataException("Deductions must be >= 0 27197");

        this.taxDeduction = taxDeduction;
        this.loanDeduction = loanDeduction;
    }

    public double getTotalDeduction() {
        return taxDeduction + loanDeduction;
    }
}
