package _27197.q1;

import java.util.regex.Pattern;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;

    public Doctor(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String hospitalName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String doctorName, String specialization, String doctorEmail, String phone) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode);

        if (specialization.isEmpty()) throw new HospitalDataException("Specialization cannot be empty 27197");
        if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$", doctorEmail))
            throw new HospitalDataException("Invalid doctor email 27197");
        if (!phone.matches("\\d{10}")) throw new HospitalDataException("Phone must be 10 digits 27197");

        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }
}
