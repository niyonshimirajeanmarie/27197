package _27197;

import _27197.q1.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Hospital Name:");
            String hospitalName = sc.nextLine();
            System.out.println("Enter Address:");
            String address = sc.nextLine();
            System.out.println("Enter Hospital Phone (10 digits):");
            String phone = sc.nextLine();
            System.out.println("Enter Hospital Email:");
            String email = sc.nextLine();

            System.out.println("Enter Department Name:");
            String deptName = sc.nextLine();
            System.out.println("Enter Department Code:");
            String deptCode = sc.nextLine();

            System.out.println("Enter Doctor Name:");
            String docName = sc.nextLine();
            System.out.println("Enter Doctor Specialization:");
            String docSpec = sc.nextLine();
            System.out.println("Enter Doctor Email:");
            String docEmail = sc.nextLine();
            System.out.println("Enter Doctor Phone:");
            String docPhone = sc.nextLine();

            System.out.println("Enter Nurse Name:");
            String nurseName = sc.nextLine();
            System.out.println("Enter Nurse Shift (Day/Night):");
            String shift = sc.nextLine();
            System.out.println("Enter Nurse Years of Experience:");
            int years = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Patient Name:");
            String patientName = sc.nextLine();
            System.out.println("Enter Age:");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Enter Gender (Male/Female/Other):");
            String gender = sc.nextLine();
            System.out.println("Enter Patient Contact Number:");
            String contact = sc.nextLine();

            System.out.println("Enter Admission Date (YYYY-MM-DD):");
            LocalDate admissionDate = LocalDate.parse(sc.nextLine());
            System.out.println("Enter Room Number:");
            int roomNum = Integer.parseInt(sc.nextLine());
            System.out.println("Enter Room Charges:");
            double roomCharges = Double.parseDouble(sc.nextLine());

            System.out.println("Enter Diagnosis:");
            String diagnosis = sc.nextLine();
            System.out.println("Enter Treatment Given:");
            String treatment = sc.nextLine();
            System.out.println("Enter Treatment Cost:");
            double treatmentCost = Double.parseDouble(sc.nextLine());

            System.out.println("Enter Doctor Fee:");
            double doctorFee = Double.parseDouble(sc.nextLine());
            System.out.println("Enter Medicine Cost:");
            double medicineCost = Double.parseDouble(sc.nextLine());

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
