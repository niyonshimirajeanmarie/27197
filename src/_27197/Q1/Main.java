package _27197;

import _27197.q1.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    
    private static boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }
    
    private static boolean isValidEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }
    
    private static boolean isValidGender(String gender) {
        return gender != null && (gender.equalsIgnoreCase("Male") || 
                                  gender.equalsIgnoreCase("Female") || 
                                  gender.equalsIgnoreCase("Other"));
    }
    
    private static boolean isValidShift(String shift) {
        return shift != null && (shift.equalsIgnoreCase("Day") || shift.equalsIgnoreCase("Night"));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Hospital Name:");
            String hospitalName = sc.nextLine();
            if (hospitalName == null || hospitalName.trim().isEmpty()) {
                throw new IllegalArgumentException("Hospital name cannot be empty");
            }
            
            System.out.println("Enter Address:");
            String address = sc.nextLine();
            if (address == null || address.trim().isEmpty()) {
                throw new IllegalArgumentException("Address cannot be empty");
            }
            
            System.out.println("Enter Hospital Phone (10 digits):");
            String phone = sc.nextLine();
            if (!isValidPhone(phone)) {
                throw new IllegalArgumentException("Hospital phone must be exactly 10 digits");
            }
            
            System.out.println("Enter Hospital Email:");
            String email = sc.nextLine();
            if (!isValidEmail(email)) {
                throw new IllegalArgumentException("Invalid hospital email format");
            }

            System.out.println("Enter Department Name:");
            String deptName = sc.nextLine();
            if (deptName == null || deptName.trim().isEmpty()) {
                throw new IllegalArgumentException("Department name cannot be empty");
            }
            
            System.out.println("Enter Department Code:");
            String deptCode = sc.nextLine();
            if (deptCode == null || deptCode.trim().isEmpty()) {
                throw new IllegalArgumentException("Department code cannot be empty");
            }

            System.out.println("Enter Doctor Name:");
            String docName = sc.nextLine();
            if (docName == null || docName.trim().isEmpty()) {
                throw new IllegalArgumentException("Doctor name cannot be empty");
            }
            
            System.out.println("Enter Doctor Specialization:");
            String docSpec = sc.nextLine();
            if (docSpec == null || docSpec.trim().isEmpty()) {
                throw new IllegalArgumentException("Doctor specialization cannot be empty");
            }
            
            System.out.println("Enter Doctor Email:");
            String docEmail = sc.nextLine();
            if (!isValidEmail(docEmail)) {
                throw new IllegalArgumentException("Invalid doctor email format");
            }
            
            System.out.println("Enter Doctor Phone:");
            String docPhone = sc.nextLine();
            if (!isValidPhone(docPhone)) {
                throw new IllegalArgumentException("Doctor phone must be exactly 10 digits");
            }

            System.out.println("Enter Nurse Name:");
            String nurseName = sc.nextLine();
            if (nurseName == null || nurseName.trim().isEmpty()) {
                throw new IllegalArgumentException("Nurse name cannot be empty");
            }
            
            System.out.println("Enter Nurse Shift (Day/Night):");
            String shift = sc.nextLine();
            if (!isValidShift(shift)) {
                throw new IllegalArgumentException("Nurse shift must be 'Day' or 'Night'");
            }
            
            System.out.println("Enter Nurse Years of Experience:");
            int years = Integer.parseInt(sc.nextLine());
            if (years < 0) {
                throw new IllegalArgumentException("Years of experience cannot be negative");
            }

            System.out.println("Enter Patient Name:");
            String patientName = sc.nextLine();
            if (patientName == null || patientName.trim().isEmpty()) {
                throw new IllegalArgumentException("Patient name cannot be empty");
            }
            
            System.out.println("Enter Age:");
            int age = Integer.parseInt(sc.nextLine());
            if (age <= 0 || age > 150) {
                throw new IllegalArgumentException("Age must be between 1 and 150");
            }
            
            System.out.println("Enter Gender (Male/Female/Other):");
            String gender = sc.nextLine();
            if (!isValidGender(gender)) {
                throw new IllegalArgumentException("Gender must be 'Male', 'Female', or 'Other'");
            }
            
            System.out.println("Enter Patient Contact Number:");
            String contact = sc.nextLine();
            if (!isValidPhone(contact)) {
                throw new IllegalArgumentException("Patient contact must be exactly 10 digits");
            }

            System.out.println("Enter Admission Date (YYYY-MM-DD):");
            LocalDate admissionDate = LocalDate.parse(sc.nextLine());
            if (admissionDate.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Admission date cannot be in the future");
            }
            
            System.out.println("Enter Room Number:");
            int roomNum = Integer.parseInt(sc.nextLine());
            if (roomNum <= 0) {
                throw new IllegalArgumentException("Room number must be positive");
            }
            
            System.out.println("Enter Room Charges:");
            double roomCharges = Double.parseDouble(sc.nextLine());
            if (roomCharges < 0) {
                throw new IllegalArgumentException("Room charges cannot be negative");
            }

            System.out.println("Enter Diagnosis:");
            String diagnosis = sc.nextLine();
            if (diagnosis == null || diagnosis.trim().isEmpty()) {
                throw new IllegalArgumentException("Diagnosis cannot be empty");
            }
            
            System.out.println("Enter Treatment Given:");
            String treatment = sc.nextLine();
            if (treatment == null || treatment.trim().isEmpty()) {
                throw new IllegalArgumentException("Treatment cannot be empty");
            }
            
            System.out.println("Enter Treatment Cost:");
            double treatmentCost = Double.parseDouble(sc.nextLine());
            if (treatmentCost < 0) {
                throw new IllegalArgumentException("Treatment cost cannot be negative");
            }

            System.out.println("Enter Doctor Fee:");
            double doctorFee = Double.parseDouble(sc.nextLine());
            if (doctorFee < 0) {
                throw new IllegalArgumentException("Doctor fee cannot be negative");
            }
            
            System.out.println("Enter Medicine Cost:");
            double medicineCost = Double.parseDouble(sc.nextLine());
            if (medicineCost < 0) {
                throw new IllegalArgumentException("Medicine cost cannot be negative");
            }

            HospitalRecord record = new HospitalRecord(1, LocalDate.now(), LocalDate.now(),
                    hospitalName, address, phone, email,
                    deptName, deptCode,
                    docName, docSpec, docEmail, docPhone,
                    nurseName, shift, years,
                    patientName, age, gender, contact,
                    admissionDate, roomNum, roomCharges,
                    diagnosis, treatment, treatmentCost,
                    doctorFee, medicineCost);

            record.displayFullRecord();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " 27197");
        }

        sc.close();
    }
}
