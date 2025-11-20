package _27197.q1;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;
    private ArrayList<Department> departments;

    public Hospital(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String hospitalName, String address, String phoneNumber, String email) throws HospitalDataException {
        super(id, createdDate, updatedDate);

        if (!phoneNumber.matches("\\d{10}"))
            throw new HospitalDataException("Phone must be 10 digits 27197");
        if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$", email))
            throw new HospitalDataException("Invalid email format 27197");

        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName + " 27197");
        System.out.println("Address: " + address + " 27197");
        System.out.println("Phone: " + phoneNumber + " 27197");
        System.out.println("Email: " + email + " 27197");
    }
}
