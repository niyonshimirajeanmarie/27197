package _27197;

import _27197.q9.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainQ9 {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    
    private static boolean isValidEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Airline Name:");
            String airlineName = sc.nextLine();
            if (airlineName == null || airlineName.trim().isEmpty()) {
                throw new IllegalArgumentException("Airline name cannot be empty");
            }
            
            System.out.println("Address:");
            String address = sc.nextLine();
            if (address == null || address.trim().isEmpty()) {
                throw new IllegalArgumentException("Address cannot be empty");
            }
            
            System.out.println("Contact Email:");
            String email = sc.nextLine();
            if (!isValidEmail(email)) {
                throw new IllegalArgumentException("Invalid contact email format");
            }

            System.out.println("Flight Number:");
            String flightNumber = sc.nextLine();
            if (flightNumber == null || flightNumber.trim().isEmpty()) {
                throw new IllegalArgumentException("Flight number cannot be empty");
            }
            
            System.out.println("Destination:");
            String destination = sc.nextLine();
            if (destination == null || destination.trim().isEmpty()) {
                throw new IllegalArgumentException("Destination cannot be empty");
            }
            
            System.out.println("Departure DateTime (YYYY-MM-DDTHH:MM):");
            LocalDateTime departure = LocalDateTime.parse(sc.nextLine());
            if (departure.isBefore(LocalDateTime.now())) {
                throw new IllegalArgumentException("Departure date cannot be in the past");
            }

            System.out.println("Passenger Name:");
            String passengerName = sc.nextLine();
            if (passengerName == null || passengerName.trim().isEmpty()) {
                throw new IllegalArgumentException("Passenger name cannot be empty");
            }
            
            System.out.println("Passport Number:");
            String passport = sc.nextLine();
            if (passport == null || passport.trim().isEmpty()) {
                throw new IllegalArgumentException("Passport number cannot be empty");
            }
            
            System.out.println("Nationality:");
            String nationality = sc.nextLine();
            if (nationality == null || nationality.trim().isEmpty()) {
                throw new IllegalArgumentException("Nationality cannot be empty");
            }

            System.out.println("Seat Number:");
            String seatNumber = sc.nextLine();
            if (seatNumber == null || seatNumber.trim().isEmpty()) {
                throw new IllegalArgumentException("Seat number cannot be empty");
            }
            
            System.out.println("Seat Type (Economy/Business):");
            String seatType = sc.nextLine();
            if (seatType == null || (!seatType.equalsIgnoreCase("Economy") && !seatType.equalsIgnoreCase("Business"))) {
                throw new IllegalArgumentException("Seat type must be 'Economy' or 'Business'");
            }

            System.out.println("Ticket Number:");
            String ticketNumber = sc.nextLine();
            if (ticketNumber == null || ticketNumber.trim().isEmpty()) {
                throw new IllegalArgumentException("Ticket number cannot be empty");
            }
            
            System.out.println("Ticket Price:");
            double price = Double.parseDouble(sc.nextLine());
            if (price <= 0) {
                throw new IllegalArgumentException("Ticket price must be positive");
            }

            System.out.println("Baggage Weight:");
            double baggageWeight = Double.parseDouble(sc.nextLine());
            if (baggageWeight < 0) {
                throw new IllegalArgumentException("Baggage weight cannot be negative");
            }
            
            System.out.println("Baggage Fee:");
            double baggageFee = Double.parseDouble(sc.nextLine());
            if (baggageFee < 0) {
                throw new IllegalArgumentException("Baggage fee cannot be negative");
            }

            System.out.println("Payment Date (YYYY-MM-DD):");
            LocalDate paymentDate = LocalDate.parse(sc.nextLine());
            if (paymentDate.isAfter(LocalDate.now())) {
                throw new IllegalArgumentException("Payment date cannot be in the future");
            }
            
            System.out.println("Payment Mode:");
            String paymentMode = sc.nextLine();
            if (paymentMode == null || paymentMode.trim().isEmpty()) {
                throw new IllegalArgumentException("Payment mode cannot be empty");
            }

            System.out.println("Total Fare:");
            double totalFare = Double.parseDouble(sc.nextLine());
            if (totalFare < 0) {
                throw new IllegalArgumentException("Total fare cannot be negative");
            }

            TicketRecord record = new TicketRecord(1, LocalDate.now(), LocalDate.now(),
                    airlineName, address, email,
                    flightNumber, destination, departure,
                    passengerName, passport, nationality,
                    seatNumber, seatType,
                    ticketNumber, price,
                    baggageWeight, baggageFee,
                    paymentDate, paymentMode,
                    totalFare);

            record.displayInvoice();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " 27197");
        }
        sc.close();
    }
}
