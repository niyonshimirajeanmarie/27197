package _27197.q1;

public class Treatment extends Admission {
    private String diagnosis;
    private String treatmentGiven;
    private double treatmentCost;

    public Treatment(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                     String hospitalName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String doctorPhone,
                     String nurseName, String shift, int yearsOfExperience,
                     String patientName, int age, String gender, String contactNumber,
                     java.time.LocalDate admissionDate, int roomNumber, double roomCharges,
                     String diagnosis, String treatmentGiven, double treatmentCost) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, doctorPhone, nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges);

        if (treatmentCost <= 0 || diagnosis.isEmpty() || treatmentGiven.isEmpty())
            throw new HospitalDataException("Invalid treatment details 27197");

        this.diagnosis = diagnosis;
        this.treatmentGiven = treatmentGiven;
        this.treatmentCost = treatmentCost;
    }

    public double getTreatmentCost() {
        return treatmentCost;
    }
}
