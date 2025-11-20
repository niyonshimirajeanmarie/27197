package _27197;

import _27197.q5.*;
import java.time.LocalDate;
import java.util.Scanner;

public class MainQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Company Name:");
            String companyName = sc.nextLine();
            System.out.println("Address:");
            String address = sc.nextLine();
            System.out.println("Phone (10 digits):");
            String phone = sc.nextLine();

            System.out.println("Branch Name:");
            String branchName = sc.nextLine();
            System.out.println("Location Code:");
            String locationCode = sc.nextLine();

            System.out.println("Vehicle Type:");
            String vehicleType = sc.nextLine();
            System.out.println("Registration Number:");
            String regNumber = sc.nextLine();
            System.out.println("Daily Rate:");
            double dailyRate = Double.parseDouble(sc.nextLine());

            System.out.println("Customer Name:");
            String custName = sc.nextLine();
            System.out.println("License Number:");
            String license = sc.nextLine();
            System.out.println("Contact Number:");
            String contact = sc.nextLine();

            System.out.println("Rental Date (YYYY-MM-DD):");
            LocalDate rentalDate = LocalDate.parse(sc.nextLine());
            System.out.println("Return Date (YYYY-MM-DD):");
            LocalDate returnDate = LocalDate.parse(sc.nextLine());
            System.out.println("Rental Days:");
            int rentalDays = Integer.parseInt(sc.nextLine());

            System.out.println("Rental Charge:");
            double rentalCharge = Double.parseDouble(sc.nextLine());
            System.out.println("Penalty Charge:");
            double penaltyCharge = Double.parseDouble(sc.nextLine());

            System.out.println("Payment Mode:");
            String paymentMode = sc.nextLine();
            System.out.println("Transaction ID:");
            String transactionId = sc.nextLine();

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
