package _27197;

import _27197.q7.*;
import java.time.LocalDate;
import java.util.Scanner;

public class MainQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Agency Name:");
            String agencyName = sc.nextLine();
            System.out.println("Location:");
            String location = sc.nextLine();
            System.out.println("Phone Number:");
            String phone = sc.nextLine();

            System.out.println("Agent Name:");
            String agentName = sc.nextLine();
            System.out.println("Agent Email:");
            String agentEmail = sc.nextLine();
            System.out.println("License Number:");
            String license = sc.nextLine();

            System.out.println("Property Code:");
            String propertyCode = sc.nextLine();
            System.out.println("Property Type:");
            String propertyType = sc.nextLine();
            System.out.println("Price:");
            double price = Double.parseDouble(sc.nextLine());

            System.out.println("Seller Name:");
            String sellerName = sc.nextLine();
            System.out.println("Seller Contact:");
            String sellerContact = sc.nextLine();

            System.out.println("Buyer Name:");
            String buyerName = sc.nextLine();
            System.out.println("Buyer Email:");
            String buyerEmail = sc.nextLine();

            System.out.println("Agreement Date (YYYY-MM-DD):");
            LocalDate agreementDate = LocalDate.parse(sc.nextLine());
            System.out.println("Terms:");
            String terms = sc.nextLine();

            System.out.println("Payment Amount:");
            double paymentAmount = Double.parseDouble(sc.nextLine());
            System.out.println("Payment Date (YYYY-MM-DD):");
            LocalDate paymentDate = LocalDate.parse(sc.nextLine());

            System.out.println("Commission Rate (%):");
            double rate = Double.parseDouble(sc.nextLine());

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
