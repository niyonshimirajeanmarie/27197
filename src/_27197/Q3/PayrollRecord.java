package _27197.q3;

public final class PayrollRecord extends Salary {
    public PayrollRecord(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                         String companyName, String address, String phoneNumber, String email,
                         String departmentName, String departmentCode,
                         String managerName, String managerEmail, String managerPhone,
                         String employeeName, int employeeId, String designation, String contactNumber,
                         int totalDays, int presentDays, int leaveDays,
                         double housingAllowance, double transportAllowance,
                         double taxDeduction, double loanDeduction,
                         double basicSalary) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode, managerName, managerEmail, managerPhone,
                employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance,
                taxDeduction, loanDeduction,
                basicSalary);
    }

    public void displayPayrollRecord() {
        System.out.println("===== Payroll Record ===== 27197");
        displaySalaryDetails();
        System.out.println("========================== 27197");
    }
}
