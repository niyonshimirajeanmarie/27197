package _27197.q1;

import java.time.LocalDate;

public class Admission extends Patient {
    private LocalDate admissionDate;
    private int roomNumber;
    private double roomCharges;

    public Admission(int id, LocalDate createdDate, LocalDate updatedDate,
                     String hospitalName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String doctorPhone,
                     String nurseName, String shift, int yearsOfExperience,
                     String patientName, int age, String gender, String contactNumber,
                     LocalDate admissionDate, int roomNumber, double roomCharges) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, doctorPhone, nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber);

        if (admissionDate == null) throw new HospitalDataException("Admission date cannot be null 27197");
        if (roomCharges <= 0) throw new HospitalDataException("Room charges must be > 0 27197");

        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
        this.roomCharges = roomCharges;
    }

    public double getRoomCharges() {
        return roomCharges;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }
}
