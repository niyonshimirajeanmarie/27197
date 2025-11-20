package _27197.q1;

public class Bill extends Treatment {
    private double doctorFee;
    private double medicineCost;
    private double totalBill;

    public Bill(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String hospitalName, String address, String phoneNumber, String email,
                String departmentName, String departmentCode,
                String doctorName, String specialization, String doctorEmail, String doctorPhone,
                String nurseName, String shift, int yearsOfExperience,
                String patientName, int age, String gender, String contactNumber,
                java.time.LocalDate admissionDate, int roomNumber, double roomCharges,
                String diagnosis, String treatmentGiven, double treatmentCost,
                double doctorFee, double medicineCost) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, doctorPhone, nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges,
                diagnosis, treatmentGiven, treatmentCost);

        if (doctorFee <= 0 || medicineCost <= 0)
            throw new HospitalDataException("Doctor fee and medicine cost must be > 0 27197");

        this.doctorFee = doctorFee;
        this.medicineCost = medicineCost;
        generateBill();
    }

    private void generateBill() {
        totalBill = getRoomCharges() + getTreatmentCost() + doctorFee + medicineCost;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void displayBill() {
        System.out.println("Patient: " + getPatientName() + " 27197");
        System.out.println("Room Charges: $" + getRoomCharges() + " 27197");
        System.out.println("Treatment Cost: $" + getTreatmentCost() + " 27197");
        System.out.println("Doctor Fee: $" + doctorFee + " 27197");
        System.out.println("Medicine Cost: $" + medicineCost + " 27197");
        System.out.println("Total Bill: $" + totalBill + " 27197");
    }
}
