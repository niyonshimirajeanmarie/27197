package _27197.q1;

public class Department extends Hospital {
    private String departmentName;
    private String departmentCode;

    public Department(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String hospitalName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email);

        if (departmentCode.length() < 3) throw new HospitalDataException("Code must be >= 3 chars 27197");
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
