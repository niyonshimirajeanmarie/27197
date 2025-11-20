package _27197.q3;

import java.util.regex.Pattern;

public class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String phone;

    public Manager(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String companyName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String managerName, String managerEmail, String phone) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode);

        if (managerName.isEmpty()) throw new PayrollDataException("Manager name cannot be empty 27197");
        if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$", managerEmail))
            throw new PayrollDataException("Invalid email 27197");
        if (!phone.matches("\\d{10}")) throw new PayrollDataException("Phone must be 10 digits 27197");

        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.phone = phone;
    }

    public String getManagerName() {
        return managerName;
    }
}
