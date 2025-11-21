package _27197;

import _27197.q5.*;
import java.time.LocalDate;
import java.util.Scanner;

public class MainQ5 {
    private static boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Company Name:");
            String companyName = sc.nextLine();
            if (companyName == null || companyName.trim().isEmpty()) {
                throw new IllegalArgumentException("Company name cannot be empty");
            }
            
            System.out.println("Address:");
            String address = sc.nextLine();
            if (address == null || address.trim().isEmpty()) {
                throw new IllegalArgumentException("Address cannot be empty");
            }
            
            System.out.println("Phone (10 digits):");
            String phone = sc.nextLine();
            if (!isValidPhone(phone)) {
                throw new IllegalArgumentException("Phone must be exactly 10 digits");
            }

            System.out.println("Branch Name:");
            String branchName = sc.nextLine();
            if (branchName == null || branchName.trim().isEmpty()) {
                throw new IllegalArgumentException("Branch name cannot be empty");
            }
            
            System.out.println("Location Code:");
            String locationCode = sc.nextLine();
            if (locationCode == null || locationCode.trim().isEmpty()) {
                throw new IllegalArgumentException("Location code cannot be empty");
            }

            System.out.println("Vehicle Type:");
            String vehicleType = sc.nextLine();
            if (vehicleType == null || vehicleType.trim().isEmpty()) {
                throw new IllegalArgumentException("Vehicle type cannot be empty");
            }
            
            System.out.println("Registration Number:");
            String regNumber = sc.nextLine();
            if (regNumber == null || regNumber.trim().isEmpty()) {
                throw new IllegalArgumentException("Registration number cannot be empty");
            }
            
            System.out.println("Daily Rate:");
            double dailyRate = Double.parseDouble(sc.nextLine());
            if (dailyRate <= 0) {
                throw new IllegalArgumentException("Daily rate must be positive");
            }

            System.out.println("Customer Name:");
            String custName = sc.nextLine();
            if (custName == null || custName.trim().isEmpty()) {
                throw new IllegalArgumentException("Customer name cannot be empty");
            }
            
            System.out.println("License Number:");
            String license = sc.nextLine();
            if (license == null || license.trim().isEmpty()) {
                throw new IllegalArgumentException("License number cannot be empty");
            }
            
            System.out.println("Contact Number:");
            String contact = sc.nextLine();
            if (!isValidPhone(contact)) {
                throw new IllegalArgumentException("Contact number must be exactly 10 digits");
            }

            System.out.println("Rental Date (YYYY-MM-DD):");
            LocalDate rentalDate = LocalDate.parse(sc.nextLine());
            if (rentalDate.isBefore(LocalDate.now())) {
                throw new IllegalArgumentException("Rental date cannot be in the past");
            }
            
            System.out.println("Return Date (YYYY-MM-DD):");
            LocalDate returnDate = LocalDate.parse(sc.nextLine());
            if (returnDate.isBefore(rentalDate) || returnDate.equals(rentalDate)) {
                throw new IllegalArgumentException("Return date must be after rental date");
            }
            
            System.out.println("Rental Days:");
            int rentalDays = Integer.parseInt(sc.nextLine());
            if (rentalDays <= 0) {
                throw new IllegalArgumentException("Rental days must be positive");
            }

            System.out.println("Rental Charge:");
            double rentalCharge = Double.parseDouble(sc.nextLine());
            if (rentalCharge < 0) {
                throw new IllegalArgumentException("Rental charge cannot be negative");
            }
            
            System.out.println("Penalty Charge:");
            double penaltyCharge = Double.parseDouble(sc.nextLine());
            if (penaltyCharge < 0) {
                throw new IllegalArgumentException("Penalty charge cannot be negative");
            }

            System.out.println("Payment Mode:");
            String paymentMode = sc.nextLine();
            if (paymentMode == null || paymentMode.trim().isEmpty()) {
                throw new IllegalArgumentException("Payment mode cannot be empty");
            }
            
            System.out.println("Transaction ID:");
            String transactionId = sc.nextLine();
            if (transactionId == null || transactionId.trim().isEmpty()) {
                throw new IllegalArgumentException("Transaction ID cannot be empty");
            }

            RentalRecord record = new RentalRecord(1, LocalDate.now(), LocalDate.now(),
                    companyName, address, phone, branchName, locationCode,
                    vehicleType, regNumber, dailyRate,
                    custName, license, contact,
                    rentalDate, returnDate, rentalDays,
                    rentalCharge, penaltyCharge,
                    paymentMode, transactionId);

            record.displayRental();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " 27197");
        }

        sc.close();
    }
}
