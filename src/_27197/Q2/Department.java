package _27197.q2;

public class Department extends School {
    private String departmentName;
    private String departmentCode;

    public Department(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String schoolName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);

        if (departmentCode.length() < 3) throw new SchoolDataException("Department code must be >= 3 chars 27197");

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }
}
