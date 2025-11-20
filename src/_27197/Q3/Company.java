package _27197.q3;

import java.util.regex.Pattern;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;

    public Company(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String companyName, String address, String phoneNumber, String email) throws PayrollDataException {
        super(id, createdDate, updatedDate);

        if (!phoneNumber.matches("\\d{10}"))
            throw new PayrollDataException("Phone must be 10 digits 27197");
        if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$", email))
            throw new PayrollDataException("Invalid email format 27197");

        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void displayCompanyDetails() {
        System.out.println("Company Name: " + companyName + " 27197");
        System.out.println("Address: " + address + " 27197");
        System.out.println("Phone: " + phoneNumber + " 27197");
        System.out.println("Email: " + email + " 27197");
    }
}
