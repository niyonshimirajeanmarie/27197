package _27197.q3;

public class Salary extends Deduction {
    private double basicSalary;
    private double grossSalary;
    private double netSalary;

    public Salary(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
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
                taxDeduction, loanDeduction);

        if (basicSalary <= 0) throw new PayrollDataException("Basic salary must be > 0 27197");

        this.basicSalary = basicSalary;
        calculateNetSalary();
    }

    private void calculateNetSalary() {
        this.grossSalary = basicSalary + getTotalAllowance();
        this.netSalary = grossSalary - getTotalDeduction();
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void displaySalaryDetails() {
        System.out.println("Basic Salary: $" + basicSalary + " 27197");
        System.out.println("Gross Salary: $" + grossSalary + " 27197");
        System.out.println("Net Salary: $" + netSalary + " 27197");
    }
}
