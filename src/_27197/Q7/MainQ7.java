package _27197;

import _27197.q7.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainQ7 {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    
    private static boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }
    
    private static boolean isValidEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Agency Name:");
            String agencyName = sc.nextLine();
            if (agencyName == null || agencyName.trim().isEmpty()) {
                throw new IllegalArgumentException("Agency name cannot be empty");
            }
            
            System.out.println("Location:");
            String location = sc.nextLine();
            if (location == null || location.trim().isEmpty()) {
                throw new IllegalArgumentException("Location cannot be empty");
            }
            
            System.out.println("Phone Number:");
            String phone = sc.nextLine();
            if (!isValidPhone(phone)) {
                throw new IllegalArgumentException("Phone number must be exactly 10 digits");
            }

            System.out.println("Agent Name:");
            String agentName = sc.nextLine();
            if (agentName == null || agentName.trim().isEmpty()) {
                throw new IllegalArgumentException("Agent name cannot be empty");
            }
            
            System.out.println("Agent Email:");
            String agentEmail = sc.nextLine();
            if (!isValidEmail(agentEmail)) {
                throw new IllegalArgumentException("Invalid agent email format");
            }
            
            System.out.println("License Number:");
            String license = sc.nextLine();
            if (license == null || license.trim().isEmpty()) {
                throw new IllegalArgumentException("License number cannot be empty");
            }

            System.out.println("Property Code:");
            String propertyCode = sc.nextLine();
            if (propertyCode == null || propertyCode.trim().isEmpty()) {
                throw new IllegalArgumentException("Property code cannot be empty");
            }
            
            System.out.println("Property Type:");
            String propertyType = sc.nextLine();
            if (propertyType == null || propertyType.trim().isEmpty()) {
                throw new IllegalArgumentException("Property type cannot be empty");
            }
            
            System.out.println("Price:");
            double price = Double.parseDouble(sc.nextLine());
            if (price <= 0) {
                throw new IllegalArgumentException("Price must be positive");
            }

            System.out.println("Seller Name:");
            String sellerName = sc.nextLine();
            if (sellerName == null || sellerName.trim().isEmpty()) {
                throw new IllegalArgumentException("Seller name cannot be empty");
            }
            
            System.out.println("Seller Contact:");
            String sellerContact = sc.nextLine();
            if (!isValidPhone(sellerContact)) {
                throw new IllegalArgumentException("Seller contact must be exactly 10 digits");
            }

            System.out.println("Buyer Name:");
            String buyerName = sc.nextLine();
            if (buyerName == null || buyerName.trim().isEmpty()) {
                throw new IllegalArgumentException("Buyer name cannot be empty");
            }
            
            System.out.println("Buyer Email:");
            String buyerEmail = sc.nextLine();
            if (!isValidEmail(buyerEmail)) {
                throw new IllegalArgumentException("Invalid buyer email format");
            }

            System.out.println("Agreement Date (YYYY-MM-DD):");
            LocalDate agreementDate = LocalDate.parse(sc.nextLine());
            if (agreementDate.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Agreement date cannot be in the future");
            }
            
            System.out.println("Terms:");
            String terms = sc.nextLine();
            if (terms == null || terms.trim().isEmpty()) {
                throw new IllegalArgumentException("Terms cannot be empty");
            }

            System.out.println("Payment Amount:");
            double paymentAmount = Double.parseDouble(sc.nextLine());
            if (paymentAmount < 0) {
                throw new IllegalArgumentException("Payment amount cannot be negative");
            }
            
            System.out.println("Payment Date (YYYY-MM-DD):");
            LocalDate paymentDate = LocalDate.parse(sc.nextLine());
            if (paymentDate.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Payment date cannot be in the future");
            }

            System.out.println("Commission Rate (%):");
            double rate = Double.parseDouble(sc.nextLine());
            if (rate < 0 || rate > 100) {
                throw new IllegalArgumentException("Commission rate must be between 0 and 100");
            }

            RealEstateRecord record = new RealEstateRecord(1, LocalDate.now(), LocalDate.now(),
                    agencyName, location, phone,
                    agentName, agentEmail, license,
                    propertyCode, propertyType, price,
                    sellerName, sellerContact,
                    buyerName, buyerEmail,
                    agreementDate, terms,
                    paymentAmount, paymentDate,
                    rate);

            record.displayRecord();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " 27197");
        }
        sc.close();
    }
}
